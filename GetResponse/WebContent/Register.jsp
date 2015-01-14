<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<form method="get" action="${pageContext.request.contextPath}/GetResponseDelegate">
            <center>
            <table border="1" width="50%" cellpadding="7">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="First_Name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="Last_Name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="EMAIL" value="" /></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="integer" name="PHONE" value="" /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="USERNAME" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="PASSWORD" value="" /></td>
                    </tr>
                    <tr>
                    <input type="hidden" name="serviceType" value="admin" />
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>