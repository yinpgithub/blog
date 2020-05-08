<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<style>
.iframe{
	height: 1000px;
	width: 100%;
}
</style>
<body>
<%-- 文章Id：${id} --%>
<!-- <br/> -->
<!-- 文章内容： -->
<!-- <p> -->
<%-- 	${content} --%>
<!-- </p> -->
<iframe class="iframe"  src="${content}">

</iframe>
</body>
</html>