<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>人力资源管理系统</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<style>
    a{
        color: #ffffff;
    }
    h1{
        /*文字对齐*/
        text-align: center;
    } 
 
    body{
            background: url(image/beijing.jpeg) top left;
            background-size: 100%;
     }

   
</style>

<body>
<h1>人力资源管理系统</h1>
<!--table-striped:斑马线格式，table-bordered：带边框的表格，table-hover：鼠标悬停高亮的表格-->
<br>
<h4><form action="${pageContext.request.contextPath}/findPeopleByName.action" method="get">
	  &nbsp&nbsp应聘者姓名:<input type="text"  name="name" id="name" placeholder="输入姓名搜索">
	<input class="btn btn-primary" type="submit" value="搜索">
</form></h4>

<br>
<table class="table table-striped table-bordered table-hover text-center">
    <thead>
    <tr style="text-align:center">
           <!--th标签定义html表格中的表头单元格-->
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>毕业院校</th>
        <th>求职意向</th>
        <th>期望薪水</th>
        <th>简介</th>
        <th>创建时间</th>
        <th>操作</th>   
    </tr>
    </thead>
    <tbody>
    <c:forEach var="people" items="${peoples}">
		<tr>
		     <td>${people.id}</td>
		     <td>${people.name}</td>
		     <td>${people.age}</td>
		     <td>${people.sex}</td>
		     <td>${people.phone}</td>
		     <td>${people.email}</td>
		     <td>${people.school}</td>
		     <td>${people.post}</td>
		     <td>${people.salary}</td>
		     <td>${people.resume}</td>
		     <td>${people.date}</td>
		     <td> <a class="btn btn-primary"  href="${pageContext.request.contextPath}/updatePeople.action?param=0&id=${people.id}">更改</a>
				  <a class="btn btn-danger" href="${pageContext.request.contextPath}/deletePeople.action?id=${people.id}">删除</a>
		     </td>
        </tr>
	</c:forEach>
    </tbody>
</table>

<button class="btn btn-primary btn-block" ><a href="addPeople.jsp">添加简历信息</a></button>
</body>

</html>


