<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/12/2021
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form method="post">
    <input type="checkbox" id="lettuce" name="condiment" value="lettuce">
    <label for="lettuce">Lettuce</label>
    <input type="checkbox" id="tomato" name="condiment" value="tomato">
    <label for="tomato">Tomato</label>
    <input type="checkbox" id="mustard" name="condiment" value="mustard">
    <label for="mustard">Mustard</label>
    <input type="checkbox" id="sprouts" name="condiment" value="sprouts">
    <label for="sprouts">Sprouts</label> <br>
    <input type="submit" value="Save">
  </form>

  <p>Condiments your choose: ${condiment[0]},${condiment[1]},${condiment[2]},${condiment[3]}</p>
  </body>
</html>
