<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>详情</td><td>文件名</td>
		</tr>
	
		<c:forEach items="${multiFileDomain.description}" var="description" varStatus="loop">
			<tr>
				
				<td>${description}</td>
				<td>${multiFileDomain.myfile[loop.count-1].originalFilename}</td>
			</tr>
		</c:forEach>

	</table>
	<a href="${pageContext.request.contextPath }/jsp/mult">继续上传</a><br>
	<a href="${pageContext.request.contextPath }/showDownFiles">下载文件</a><br>
</body>
</html>