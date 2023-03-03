<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="image/style.css" />
    <style>
        body{
            background: url(image/bg.jpg) top left;
            background-size: 100%;
        }

    </style>
</head>
<body>
   <!--   <form method="post" action="register">
             用户名:<input type="text" name="username"id="username"></input><br><br>
             密&nbsp&nbsp码：<input type="password" name="password"id="password"></input><br><br>
     <input type="submit" value="注册"></input>
     </form> -->
     
     <div id="div-title">
    <h3>欢迎注册</h3>
</div>
<div id="form-border">
    <form method="post" action="register">
        <div id="img-control">
            <img src="image/donghua.jpg" id="register-img"/>
        </div>
        <label class="form-label" for="account">用户名</label>
        <input name="username" id="account" class="form-input" type="text" placeholder="用户名" required="required"/><br>
        <label class="form-label" for="password">密&nbsp&nbsp码</label>
        <input name="password"  id="password" class="form-input" type="password" placeholder="密码" required="required"/><br>
        <label id="register" class="form-label" for="password">已有账号？<a href="login.jsp">点击登陆</a></label><br>
        <input id="login" class="form-button" type="submit" value="注册"/>
    </form>
</div>
</body>
</html>