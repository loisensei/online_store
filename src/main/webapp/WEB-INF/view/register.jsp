<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Custom Theme files -->
    <link href="/css/login.css" rel="stylesheet" type="text/css" media="all" />
    <!-- //Custom Theme files -->
    <!-- web font -->
    <link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
    <!-- //web font -->
</head>
<body>
<!-- main -->
<div class="main-w3layouts wrapper">
    <h1>SIGN UP</h1>
    <div class="main-agileinfo">
        <div class="agileits-top">
            <%--@elvariable id="newUser" type="com.ltw.online_store.Entity.User"--%>
            <form:form method="post" action="register" modelAttribute="newUser">
                <form:errors class="error" path="userName"></form:errors>
                <form:input type="text" path="userName" class="text" placeholder="Username" required="required"></form:input>

<%--                <input class="text" type="text" name="Username" placeholder="Username" required="required">--%>
                <form:errors class="error" path="email"></form:errors>
                <form:input type="text" path="email" class="email" placeholder="Email" required="required"></form:input>

<%--                <input class="text email" type="email" name="email" placeholder="Email" required="required">--%>
                <form:errors class="error" path="password"></form:errors>
                <form:input type="password" path="password" class="text" placeholder="Password" required="required"></form:input>

<%--                <input class="text" type="password" name="password" placeholder="Password" required="required">--%>
                <form:errors class="error" path="confirmPassword"></form:errors>
                <form:input type="password" path="confirmPassword" class="text w3lpass" placeholder="Confirm Password" required="required"></form:input>

<%--                <input class="text w3lpass" type="password" name="confirmPassword" placeholder="Confirm Password" required="required">--%>
                <div class="wthree-text">
                    <label class="anim">
                        <input type="checkbox" class="checkbox">
                        <span>I Agree To The Terms & Conditions</span>
                    </label>
                    <div class="clear"> </div>
                </div>
                <input type="submit" value="SIGNUP">
            </form:form>
            <p>have an Account? <a href="/login"> Login Now!</a></p>
        </div>
    </div>
</div>
</body>
</html>