<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

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
            <li class="active"><a href="/home">Home</a></li>
            <li><a href="/categories">Gategories</a></li>
            <li><a href="/signIn">Sign In</a></li>
            <li><a href="/signUp">Sign Up</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="inside-content">
        <br>
        <h3>Welcome to my ServletApp!</h3>
        <p>You can register or sign in clicking on the buttons below.</p>
        <a class="button" href="/signIn">Sign In</a>
        <a class="button" href="/signUp">Sign Up</a>
    </div>
</div>
<div class="footer">
    <p>You can find this project on <a href="http://github.com/maxt28">GitHub</a>.</p>
</div>
</body>
</html>

