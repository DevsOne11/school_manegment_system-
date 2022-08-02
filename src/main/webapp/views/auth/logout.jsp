<%--
  Created by IntelliJ IDEA.
  User: jl
  Date: 8/2/2022
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout Page</title>
  <jsp:include page="../head.jsp" />
</head>
<body>
<div class="row">
  <div class="col-md-6 offset-3">
    <form method="post" action="/auth/logout">
      <div class="alert alert-warning">
        <h1>Are you really want to sign out</h1>
      </div>
      <button type="submit" class="btn btn-primary" onclick="clearSessionCookie();">Yes</button>
      <a href="/" class="btn btn-success focus">Back</a>
    </form>
  </div>
</div>
</body>
</html>
