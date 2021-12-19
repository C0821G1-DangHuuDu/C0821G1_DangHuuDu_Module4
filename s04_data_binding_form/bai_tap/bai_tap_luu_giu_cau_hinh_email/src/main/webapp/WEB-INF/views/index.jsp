<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/12/2021
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Settings</h1>
  <form:form modelAttribute="setting" method="post">
    <table>
      <tr>
        <td>
          <form:label path="language">Language:</form:label>
        </td>
        <td>
          <form:select path="language">
            <form:options items="${language}"></form:options>
          </form:select>
        </td>
      </tr>

      <tr>
        <td>
          <form:label path="pageSize">Page Size:</form:label>
        </td>
        <td>
          Show <form:select path="pageSize">
          <form:options items="${pageSize}"></form:options>
        </form:select> emails per page
        </td>
      </tr>

    <tr>
      <td>
        <form:label path="spamsFilter">Spams filter:</form:label>
      </td>
      <td>
        <form:checkbox path="spamsFilter" value="true"></form:checkbox>Enable spams filter
<%--        checkbox không được chứa giá trị giống ở dưới mà phải để ngoài giống ở trên nếu không sẽ bị lỗi--%>
<%--        <form:checkbox path="spamsFilter" value="true">Enable spams filter</form:checkbox>--%>
      </td>
    </tr>

      <tr>
        <td>
          <form:label path="signature">Signature:</form:label>
        </td>
        <td>
          <form:textarea path="signature"></form:textarea>
        </td>
      </tr>

      <tr>
        <td></td>
        <td>
          <button type="submit">Updates</button>
          <button>Cancel</button>
        </td>
      </tr>
    </table>
  </form:form>
  </body>
</html>
