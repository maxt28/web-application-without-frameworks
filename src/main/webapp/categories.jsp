<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <li class="active"><a href="/categories">Gategories</a></li>
            <li><a href="/signIn">Sign In</a></li>
            <li><a href="/signUp">Sign Up</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div id="categories" class="inside-content">
        <h1>Categories</h1>
       <c:out value="${category}"/>
        <table>
            <tr>
                <td class="vsmall-td">N.</td>
                <td class="small-td">Name</td>
                <td class="small-td">Type</td>
                <td class="large-td">Description</td>
            </tr>

        <c:forEach var="item" items="${categories}" varStatus="s">
            <tr>
            <td class="vsmall-td">
                <c:out value="${s.index+1}"/>
            </td>
            <td class="small-td">
            <c:out value="${item.name}"/>
            </td>
            <td class="small-td">
                <c:out value="${item.getType()}"/>
            </td>
            <td class="large-td">
                <c:out value="${item.getDescription()}"/>
            </td>
            </tr>
        </c:forEach>

        </table>

        <!--<table>
            <tr>
                <td>N.</td>
                <td>Name</td>
                <td>Type</td>
                <td>Description</td>
            </tr>


            <tr>
                <td>1</td>
                <td>C++</td>
                <td>stupid</td>
                <td>That is description for C++.</td>
            </tr>
            <tr>
                <td>2</td>
                <td>C#</td>
                <td>poser</td>
                <td>That is description for C#.</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Java</td>
                <td>cool</td>
                <td>That is description for Java.</td>
            </tr>

        </table>-->
    </div>
</div>
<div class="footer">
    <p>You can find this project on <a href="http://github.com/maxt28">GitHub</a>.</p>
</div>
</body>
</html>

