<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="container-fluid">
    <div class="col-md-3">

        <div id="sidebar">
            <div class="container-fluid tmargin">
                <div class="input-group">
                </div>
            </div>

            <ul class="nav navbar-nav side-bar">

                <li class="side-bar tmargin">
                    <a href="<c:url value='/admin/don-hang' />">
                        <span class="glyphicon glyphicon-shopping-cart">&nbsp;</span>Order</a>
                </li>

                <li class="side-bar">
                    <a href='<c:url value="/admin/san-pham"/>' >
                        <span class="glyphicon glyphicon-folder-open">&nbsp;</span>Product</a>
                </li>

                <li class="side-bar">
                    <a href='<c:url value="/admin/danh-muc"/>'>
                        <span class="glyphicon glyphicon-tasks">&nbsp;</span>Category</a>
                </li>

                <li class="side-bar">
                    <a href='<c:url value="/admin/nhan-hieu"/>' >
                        <span class="glyphicon glyphicon-flag">&nbsp;</span>Brand</a>
                </li>

                <li class="side-bar main-menu">
                    <a href="<c:url value='/admin/account-management' />">
                        <span class="glyphicon glyphicon-th-list">&nbsp;</span>Account</a>
                </li>

                <li class="side-bar main-menu">
                    <a href="<c:url value='/admin/lien-he' />">
                        <span class="glyphicon glyphicon-envelope">&nbsp;</span>Contact</a>
                </li>
                <li class="side-bar">
                    <a href="<c:url value='/admin/profile' />">
                        <span class="glyphicon glyphicon-user">&nbsp;</span>Account Information</a>
                </li>

            </ul>
        </div>
    </div>

    <script src="<c:url value='/js/admin.js'/>" ></script>