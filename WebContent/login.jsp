<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>人力资源管理系统</title>

 <link rel="stylesheet" href="image/style.css" />
    <style>
        body{
            background: url(image/bg.jpg) top left;
            background-size: 100%;
        }

    </style>
</head>



<body>

<div id="div-title">
    <h3>欢迎登陆</h3> 
</div>

<div id="form-border">
    <form method="post" action="login">
        <div id="img-control">
            <img src="image/donghua.jpg" id="login-img"/>
        </div>
        <label class="form-label" for="account">用户名</label>
        <input name="username" id="username" class="form-input" type="text" placeholder="用户名" required="required"/><br>
        <label class="form-label" for="password">密&nbsp&nbsp码</label>
        <input name="password" id="password" class="form-input" type="password" placeholder="密码" required="required"/><br>
        <label id="register" class="form-label" for="password">没有账号？<a href="register.jsp">点击注册</a></label><br>
        <input id="login" class="form-button" type="submit" value="登录"/>
    </form>
</div>
    <!-- <form method="post" action="login">
           用户名:<input type="text" name="username"id="username"></input><br><br>
          密&nbsp&nbsp码：<input type="password" name="password"id="password"></input><br><br>
    <input type="submit" value="登录"></input>
    <a href="register.jsp">用户注册</a>
   </form> -->
</body>
</html>
</html>