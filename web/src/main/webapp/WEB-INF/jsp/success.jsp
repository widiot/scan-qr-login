<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功</title>
    <link class="bootstrap library" rel="stylesheet" type="text/css"
          href="http://sandbox.runjs.cn/js/sandbox/bootstrap-2.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
</head>

<body>
<div class="container">
    <div class="loginBox row-fluid">
        <div>
            <h2>welcome,${sessionScope.user.username}! </h2>
        </div>
        <p>登录成功!
            <a href="/userLogin/user/anotherpage">另一个页面</a>
        </p>
        <form action="/userLogin/user/outLogin">
            <table>
                <tr>
                    <td><input class="btn btn-primary" type="submit" value="退出登录"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
