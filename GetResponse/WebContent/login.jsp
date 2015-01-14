<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body >
   <form method="get" action="${pageContext.request.contextPath}/UserAuthentication">
      <table border="0">
      <tr>
      <td>Username</td>
      <td><input type="text" name="userName"></td>
      </tr>
      <tr>
      <td>Password</td>
      <td><input type="password" name="password"></td>
      </tr>
      <tr><td colspan="2" align="center">
              <input type="submit" value="Login"></td>
      </tr>
 </table>
   </form>
</body>
</html>