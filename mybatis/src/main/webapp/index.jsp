<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>显示用户信息</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
		table,td{
		    border: 1px solid;
		    border-collapse: collapse;
		}
	</style>
  </head>
  
  <body>
	<table>
		<tr>
		    <td>用户ID</td>
		    <td>用户名</td>
		    <td>用户生日</td>
		    <td>工资</td>
		</tr>
	    <%--遍历lstUsers集合中的User对象 --%>
		<c:forEach var="user" items="${lstUsers}">
			<tr>
			    <td>${user.userId}</td>
				<td>${user.userName}</td>
				<td>${user.userBirthday}</td>
				<td>${user.userSalary}</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
