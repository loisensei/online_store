<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script src="https://kit.fontawesome.com/75eef02814.js" crossorigin="anonymous"></script>


<div class="col-md-9 bounce">
    <h3 class="page-header">Quản lý Tài khoản</h3>
    <form id="form_add_account" method="post">
        <div class="form-row">
            <div class="form-group col-md-4">
                <input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" name="username">
            </div>
            <div class="form-group col-md-5">
                <input type="password" class="form-control" id="password" placeholder="Mật khẩu" name="password">
            </div>
            <div class="form-group col-md-2">
            <label for="role">Vai Trò:</label>
            <select id="role" class="form-control" name="role">
                <option selected>USER</option>
                <option>ADMIN</option>
            </select>
            </div>
        </div>
        <div class="form-group col-md-9">
            <input type="email" class="form-control" id="email" placeholder="Email" name="email">
        </div>
        <div class="form-group col-md-9">
            <input type="text" class="form-control" id="address" placeholder="Địa chỉ" name="address">
        </div>

        <div class="form-group col-md-1">
            <button type="submit" class="btn btn-primary">Thêm tài khoản</button>
        </div>

    </form>
    <hr>

    <table class="table table-hover" style="text-align: center;">
        <thead>
        <tr>
            <th>Mã</th>
            <th>Tên đăng nhập</th>
            <th>Email</th>
            <th>Họ và tên</th>
            <th>Địa chỉ</th>
            <th>Vai trò</th>
            <th> </th>
        </tr>

        </thead>
        <tbody>

        </tbody>

    </table>
</div>

<%--</div>--%>
<script src="/js/admin/taikhoan.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>


