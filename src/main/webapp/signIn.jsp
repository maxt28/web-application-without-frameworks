<%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
    <style>
    <%@include file="css/homeStyle.css"%>
</style>
</head>
<body>
<div class="header">
    <p>ServletApp</p>
    <div class="nav">
        <ul>
            <li><a href="/home">Home</a></li>
            <li><a href="/categories">Gategories</a></li>
            <li class="active"><a href="/signIn">Sign In</a></li>
            <li><a href="/signUp">Sign Up</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="inside-content">
        <form class="logIn" method="post" action="/signIn">
            <label>User name:</label>
            <input class="form-input" type="text" name="userName" autofocus="autofocus">
            <label>Password:</label>
            <input class="form-input" type="password" name="password">
            <input class="form-button" type="submit" name="" value="Log In">
        </form>
    </div>
</div>
<div class="footer">
    <p>You can find this project on <a href="http://github.com/maxt28">GitHub</a>.</p>
</div>
</body>
</html>