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
            <li><a href="/signIn">Sign In</a></li>
            <li class="active"><a href="/signUp">Sign Up</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="inside-content">
        <form class="signUp" method="post" action="/signUp">
            <label class="form-label" >User name:</label>
            <input class="form-input" type="text" name="userName" autofocus="autofocus">
            <label>Password:</label>
            <input class="form-input" type="password" name="password">
            <label>Repeat password:</label>
            <input class="form-input" type="password" name="confirmPassword">
            <label>Email:</label>
            <input class="form-input" type="email" name="email">
            <input class="form-button" type="submit" name="" value="Register">
        </form>
    </div>
</div>
<div class="footer">
    <p>You can find this project on <a href="http://github.com/maxt28">GitHub</a>.</p>
</div>
</body>
</html>