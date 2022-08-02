<%--
  Created by IntelliJ IDEA.
  User: jl
  Date: 8/2/2022
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<div class="row">
    <div class="col-md-6 offset-3">
        <form method="post" action="/auth/login">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="uname"  placeholder="john">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="pswd" placeholder="pswd123">
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="remember-me" name="rememberMe">
                <label class="form-check-label" for="remember-me">Remember me ?</label>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>
</body>
</html>
