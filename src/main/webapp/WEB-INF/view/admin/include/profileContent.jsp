<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%--<link rel="stylesheet" href="/css/profile.css">--%>


<div class="container col-md-9">
    <div class="row justify-content-center">
        <div class="col-12 col-lg-10 col-xl-8 mx-auto">
            <h2 class="h3 mb-4 page-title">Settings</h2>
            <div class="my-4">
                <ul class="nav nav-tabs mb-4" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="false">Profile</a>
                    </li>
                </ul>
                <form id="profile-form" method="post">
                    <hr class="my-4" />
                    <div class="form-row">
                        <div class="form-group col-md-5">
                            <label for="username">Username</label>
                            <input type="text" id="username" class="form-control" value="${loggerInUser.userName}" readonly/>
                        </div>
                        <div class="form-group col-md-5">
                            <label for="name">Full Name</label>
                            <input type="text" id="name" class="form-control" value="${loggerInUser.fullName}" />
                        </div>
                    </div>
                    <div class="form-group col-md-9">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" value="${loggerInUser.email}" />
                    </div>
                    <div class="form-group col-md-9">
                        <label for="address">Address</label>
                        <input type="text" class="form-control" id="address" value="${loggerInUser.address}" />
                    </div>
                    <hr class="my-4" />
                    <div class="row mb-4">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="newPassword">New Password</label>
                                <input type="password" class="form-control" id="newPassword" />
                            </div>
                            <div class="form-group">
                                <label for="confirmPassword">Confirm Password</label>
                                <input type="password" class="form-control" id="confirmPassword" />
                                <label for="confirmPassword" id="warn-cf-pass" style="color: #A11515FF"></label>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Save Change</button>
                </form>
            </div>
        </div>
    </div>

</div>

<script src="/js/web/profile.js"></script>
