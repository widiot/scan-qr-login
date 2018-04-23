<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>最后一个页面</title>
    <link class="bootstrap library" rel="stylesheet" type="text/css"
          href="http://sandbox.runjs.cn/js/sandbox/bootstrap-2.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
</head>

<body>
<div class="container">
    <div class="loginBox row-fluid">
        <div>
            <h2>${sessionScope.user.username}!这是最后一个页面。 </h2>
        </div>
        <form action="/userLogin/user/outLogin">
            <table>
                <tr>
                    <td><input class="btn btn-primary" type="submit" value="退出"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>