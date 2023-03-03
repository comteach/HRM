<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>人力资源管理系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div style="width:600px;height:100%;margin-left:270px;">
    <form action="updatePeople.action" method="get">
       
   ID：<input class="form-control"  type="text"  value="${people.id}" name="id"readonly="readonly"><br>       
        姓名：<input class="form-control" type="text"  value="${people.name}" name="name"><br>
        年龄：<input class="form-control" type="text"  value="${people.age}" name="age"><br>
        性别：<input class="form-control" type="text"  value="${people.sex}" name="sex"><br>
        电话：<input class="form-control" type="text"  value="${people.phone}" name="phone"><br>
        邮箱：<input class="form-control" type="text"  value="${people.email}" name="email"><br>
   毕业院校：<input class="form-control" type="text" value="${people.school}" name="school"><br>
   求职意向：<input class="form-control" type="text" value="${people.post}" name="post"><br>
   期望薪水：<input class="form-control" type="text" value="${people.salary}" name="salary"><br>
        简介：<input class="form-control" type="text"  value="${people.resume}" name="resume"><br>        
         <input type="hidden" name="param" value="1"/>             
         <input class="btn btn-primary btn-lg btn-block" type="submit" value="提交">
         <input class="btn btn-primary btn-lg btn-block" type="reset" value="重置">
    </form>
</div>

</body>
</html>
