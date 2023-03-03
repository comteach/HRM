<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <title>人力资源管理系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div style="width:600px;height:100%;margin-left:270px;">
    <form action="addPeople" method="post">
<!--form-control给input添加这个class后就会使用bootstrap自带的input框-->
        姓名：<input class="form-control" type="text"  name="name"><br>
        <!--注意参数的拼接-->
        年龄：<input class="form-control" type="text" name="age"><br>
        性别：<input class="form-control" type="text" name="sex"><br>
        电话：<input class="form-control" type="text"  name="phone"><br>
        邮箱：<input class="form-control" type="text"  name="email"><br>
   毕业院校：<input class="form-control" type="text"  name="school"><br>
   求职意向：<input class="form-control" type="text" name="post"><br>
   期望薪水：<input class="form-control" type="text" name="salary"><br>
        简介：<input class="form-control" type="text"  name="resume"><br>
       
                  
        <button class="btn btn-primary btn-lg btn-block">保存</button>
    </form>
</div>

</body>
</html>
