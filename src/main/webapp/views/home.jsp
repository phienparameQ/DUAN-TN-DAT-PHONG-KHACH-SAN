<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Document</title>

</head>
<body>
<div class="header">
    <img src="/images/logo.jpg" alt="Logo">
    <h3>Dragon Ball</h3> <br>
    <h2>Hotel</h2>
    <a href="#"><button type="button" class="btn btn-warning" style="margin-left: 1100px"> Đăng xuất </button></a>
</div>
<div class="nav">
    <ul class="nav flex-column">
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#">Thống kê</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#">Hóa Đơn</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#">Quản Lý nhân viên</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Khách Hàng</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Khuyến Mại</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Dịch Vụ</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Giao Ca</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Phòng</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn btn-info" href="#" >Quản Lý Tài Khoản</a>
        </li>

    </ul>
</div>
<div class="body">
    <!-- Nội dung chính sẽ ở đây -->

</div>
<div class="footer">
    © 2024 Dragon Ball Hotel. FPT POLYTECHNIC KIỀU MAI.
</div>
</body>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .header {
        background-color: red;
        color: white;
        padding: 10px;
        display: flex;
        align-items: center;
    }
    .header img {
        width: 70px;
        height: 70px;

    }
    .header h3 {
        margin-left: 20px;
        margin-top: -10px;
        margin-bottom: 0;
    }
    .header h2 {
        margin-left: -40px;
        margin-top: 50px;
    }
    .nav {
        width: 200px;
        background-color: #f8f9fa;
        padding: 20px;
        box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
        position: fixed;
        height: 100%;
    }
    .nav ul {
        list-style-type: none;
        padding: 0;
    }
    .nav ul li {
        margin-top: 10px;
        margin-bottom: 10px;
        height: 30px;
    }
    .nav ul li a {
        text-decoration: none;
        color: #007bff;
    }
    .nav ul li a:hover {
        text-decoration: underline;
    }
    .body {
        margin-left: 220px;
        padding: 20px;
    }
    .footer {
        background-color: #f1f1f1;
        padding: 10px;
        text-align: center;
        position: fixed;
        width: 100%;
        bottom: 0;
    }
</style>
</html>