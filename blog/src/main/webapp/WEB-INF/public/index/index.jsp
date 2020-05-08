<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../static/js/jQuery1.10.2.js"></script>
<script type="text/javascript" src="index.js"></script>
</head>
<body>
	<h1>首页</h1>
<!-- 	<a href="/1.html">如何让富婆爱上你</a> -->
<!-- 	<br/> -->
<!-- 	<a href="/2.html">疫情发生以来，全国已累计发放190多亿元消费券</a> -->
<!-- 	<br/> -->
<!-- 	<a href="/3.html">centos7固定局域网ip</a> -->
<!-- 	<br/> -->
<!-- 	<a href="/4.html">文章4</a> -->
<!-- 	<br/> -->
<!-- 	<h1>登录</h1> -->
	<c:forEach items="${contentss}" var="contents">
		<div>
			<h1><span>标题：</span>${contents.title}</h1>
			<h1><span>发布日期：</span>${contents.insertDt}</h1>
		</div>
	</c:forEach>
</body>
</html>