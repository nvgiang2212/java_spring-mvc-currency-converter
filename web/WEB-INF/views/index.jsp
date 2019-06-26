<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/converter">
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD"/><br/>
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>