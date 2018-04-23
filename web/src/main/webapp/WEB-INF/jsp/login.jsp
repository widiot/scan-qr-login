<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8">
    <title>用户登录</title>
    <link class="bootstrap library" rel="stylesheet" type="text/css"
          href="http://sandbox.runjs.cn/js/sandbox/bootstrap-2.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/qrcode.min.js" type="text/javascript"></script>
</head>

<body>
<div class="container">
    <div class="loginBox row-fluid">
        <form class="span7 left" action="/userLogin/user/checkLogin" method="post">
            <h2>账号登录</h2>
            <input type="text" name="username" placeholder="用户名"/>
            <input type="password" name="password" placeholder="密码"/>
            <div class="row-fluid" class="loginbutton">
                <div class="span8 lh30"><label><input type="checkbox" name="rememberme"/>下次自动登录</label></div>
                <div class="span1"><input type="submit" value="登录" class="btn btn-primary"></div>
            </div>
        </form>
        <div class="span5 right">
            <h2>扫码登录</h2>
            <div id="qrcode"></div>
        </div>
    </div>
</div>
<script src="<%=request.getContextPath()%>/js/QRLogin.js" type="text/javascript"></script>
</body>
</html>