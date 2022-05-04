<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
<%--<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>--%>
<%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
<%--<!------ Include the above in your HEAD tag ---------->--%>
<%--<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">--%>

<section class="jumbotron text-center">
    <div class="container">
        <!-- Slider -->
        <div class="image-slider">
            <div class="image-item">
                <div class="image">
                    <img
                            src="https://images.unsplash.com/photo-1611510338559-2f463335092c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"
                            alt=""
                    />
                </div>
                <h3 class="image-title">Balenciaga</h3>
            </div>
            <div class="image-item">
                <div class="image">
                    <img
                            src="https://images.unsplash.com/photo-1588484628369-dd7a85bfdc38?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"
                            alt=""
                    />
                </div>
                <h3 class="image-title">Yeezy 700V3</h3>
            </div>
            <div class="image-item">
                <div class="image">
                    <img
                            src="https://images.unsplash.com/photo-1602033693432-b88c0b6320ed?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80"
                            alt=""
                    />
                </div>
                <h3 class="image-title">Rick Owens</h3>
            </div>
            <div class="image-item">
                <div class="image">
                    <img
                            src="https://images.unsplash.com/photo-1606890542241-b848582fe5cd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"
                            alt=""
                    />
                </div>
                <h3 class="image-title">Salomon</h3>
            </div>
            <div class="image-item">
                <div class="image">
                    <img
                            src="https://images.unsplash.com/photo-1621665421558-831f91fd0500?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
                            alt=""
                    />
                </div>
                <h3 class="image-title">Jordan</h3>
            </div>
        </div>
    </div>
</section>

<div class="container">
    <div class="row">
        <div class="col">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="/trang-chu">Trang Chủ</a></li>
                    <li class="breadcrumb-item"><a href="#">Nhãn hiệu</a></li>
                    <li class="breadcrumb-item active" aria-current="#">Sub-Brand</li>
                </ol>
            </nav>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-sm-3">
            <div class="card bg-light mb-3">
                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i>Thương hiệu</div>
                <ul class="list-group category_block">
                    <c:forEach items="${cacNhanHieu}" var="nhanHieu">
                    <li class="list-group-item text-white"><a href="#">${nhanHieu.ten}</a></li>
                    </c:forEach>

                </ul>
            </div>
            <div class="card bg-light mb-3">
                <div class="card-header text-white text-uppercase">Sản phẩm mới nhất</div>
                <div class="card-body">
                    <img class="img-fluid" src="/img/pic1.jpg" />
                    <h5 class="card-title">Jordan</h5>
                    <p class="card-text">Sneaker</p>
                    <p class="bloc_left_price">100$</p>
                </div>
            </div>
        </div>

        <div class="col-sm-9">
            <div class="row sub-category">
<%--                <c:forEach items="${listP}" var="o">--%>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic1.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic2.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic3.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic7.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic5.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="/img/pic6.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="#" title="View Product">Balenciaga</a></h4>
                            <p class="card-text show_txt">Adidas</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">30$</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
<%--                </c:forEach>--%>
            </div>
        </div>

    </div>
</div>
<%--<section class="jumbotron text-center">--%>
<%--    <div class="container">--%>
<%--        <!-- Slider -->--%>
<%--        <div class="image-slider">--%>
<%--            <div class="image-item">--%>
<%--                <div class="image">--%>
<%--                    <img--%>
<%--                            src="https://images.unsplash.com/photo-1611510338559-2f463335092c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"--%>
<%--                            alt=""--%>
<%--                    />--%>
<%--                </div>--%>
<%--                <h3 class="image-title">Balenciaga</h3>--%>
<%--            </div>--%>
<%--            <div class="image-item">--%>
<%--                <div class="image">--%>
<%--                    <img--%>
<%--                            src="https://images.unsplash.com/photo-1588484628369-dd7a85bfdc38?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"--%>
<%--                            alt=""--%>
<%--                    />--%>
<%--                </div>--%>
<%--                <h3 class="image-title">Yeezy 700V3</h3>--%>
<%--            </div>--%>
<%--            <div class="image-item">--%>
<%--                <div class="image">--%>
<%--                    <img--%>
<%--                            src="https://images.unsplash.com/photo-1602033693432-b88c0b6320ed?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80"--%>
<%--                            alt=""--%>
<%--                    />--%>
<%--                </div>--%>
<%--                <h3 class="image-title">Rick Owens</h3>--%>
<%--            </div>--%>
<%--            <div class="image-item">--%>
<%--                <div class="image">--%>
<%--                    <img--%>
<%--                            src="https://images.unsplash.com/photo-1606890542241-b848582fe5cd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"--%>
<%--                            alt=""--%>
<%--                    />--%>
<%--                </div>--%>
<%--                <h3 class="image-title">Salomon</h3>--%>
<%--            </div>--%>
<%--            <div class="image-item">--%>
<%--                <div class="image">--%>
<%--                    <img--%>
<%--                            src="https://images.unsplash.com/photo-1621665421558-831f91fd0500?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"--%>
<%--                            alt=""--%>
<%--                    />--%>
<%--                </div>--%>
<%--                <h3 class="image-title">Jordan</h3>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>

<%--<div class="container">--%>
<%--    <div class="row">--%>
<%--        <div class="col">--%>
<%--            <nav aria-label="breadcrumb">--%>
<%--                <ol class="breadcrumb">--%>
<%--                    <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>--%>
<%--                    <li class="breadcrumb-item"><a href="#">Category</a></li>--%>
<%--                    <li class="breadcrumb-item active" aria-current="#">Sub-category</li>--%>
<%--                </ol>--%>
<%--            </nav>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div class="container">--%>
<%--    <div class="row">--%>
<%--        <div class="col-sm-3">--%>
<%--            <div class="card bg-light mb-3">--%>
<%--                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>--%>
<%--                <ul class="list-group category_block">--%>
<%--                    <c:forEach items="${null}" var="o">--%>
<%--                        <li class="list-group-item text-white"><a href="#"></a></li>--%>
<%--                    </c:forEach>--%>

<%--                </ul>--%>
<%--            </div>--%>
<%--            <div class="card bg-light mb-3">--%>
<%--                <div class="card-header bg-success text-white text-uppercase">Last product</div>--%>
<%--                <div class="card-body">--%>
<%--                    <img class="img-fluid" src="${p.image}" />--%>
<%--                    <h5 class="card-title">${p.name}</h5>--%>
<%--                    <p class="card-text">${p.title}</p>--%>
<%--                    <p class="bloc_left_price">${p.price} $</p>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="col-sm-9">--%>
<%--            <div class="row">--%>
<%--                <c:forEach items="${}" var="o">--%>
<%--                    <div class="col-12 col-md-6 col-lg-4">--%>
<%--                        <div class="card">--%>
<%--                            <img class="card-img-top" src="${o.image}" alt="Card image cap">--%>
<%--                            <div class="card-body">--%>
<%--                                <h4 class="card-title show_txt"><a href="#" title="View Product">${o.name}</a></h4>--%>
<%--                                <p class="card-text show_txt">${o.title}</p>--%>
<%--                                <div class="row">--%>
<%--                                    <div class="col">--%>
<%--                                        <p class="btn btn-danger btn-block">${o.price} $</p>--%>
<%--                                    </div>--%>
<%--                                    <div class="col">--%>
<%--                                        <a href="#" class="btn btn-success btn-block">Add to cart</a>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </c:forEach>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--    </div>--%>
<%--</div>--%>

