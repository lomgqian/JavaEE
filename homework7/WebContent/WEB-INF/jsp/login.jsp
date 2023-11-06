<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${msg}</p>  
	<form:form modelAttribute="users" action="${pageContext.request.contextPath }/users/login" method="post">
		<fieldset>
        <legend>用户登录</legend>
        <p>
            <label>用户名:</label>
            <form:input path="uname"/>
        </p>
        <p>
            <label>密码:</label>
            <form:input path="upwd"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset">
            <input id="submit" type="submit" value="登录">
        </p>
    	</fieldset>
  
    	<form:errors path="*"/>
	</form:form>
</body>
</html>