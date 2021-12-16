<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/12/2021
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form method="post">
    <input type="text" name="num1">

    <input type="text" name="num2">
      <br>
    <input type="submit" name="action" value="Addition(+)">
    <input type="submit" name="action" value="Subtraction(-)">
    <input type="submit" name="action" value="Multiplication(x)">
    <input type="submit" name="action" value="Division(/)">
  </form>

  <p>Result: ${result}</p>
  </body>
  </body>
</html>
