<%-- 
    Document   : arithmeticcalculator
    Created on : 3-Jun-2022, 10:42:17 AM
    Author     : patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input typee="text" name="num1" value="${first}"></input>
            <br>
            <label>Second</label>
            <input typee="text" name="num2"value="${second}"></input>
            <br>
            <input type="submit" name="calc" value="+"></input>
            <input type="submit" name="calc" value="-"></input>
            <input type="submit" name="calc" value="*"></input>
            <input type="submit" name="calc" value="%"></input>
            <br>
            Result: ${message}
            <br>
            <a href="age">Age Calculator</a>
            
            
    </body>
</html>
