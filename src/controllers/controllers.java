package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllers {
    @GetMapping("/greeting")
    public String greeting(String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @PostMapping("/converter")
    String converter(@RequestParam float usd, float rate, Model model) {
        float vnd = usd * rate;
        model.addAttribute("usd", usd);
        model.addAttribute("att2", vnd);
        return "converter";
    }
}
