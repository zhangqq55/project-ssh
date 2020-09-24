<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lx11_ckxw.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <input type="button" name="Submit" value="返回上一页" onclick="javascript:history.back(-1);"><br>
  <s:set value="xinwen.category" var="aaa"></s:set>
 标题：<s:property value="xinwen.titlea"/><br><br>
 发布时间：<s:property value="xinwen.issuetime"/><br><br>
 新闻类型 ：<s:property value="#aaa.categoryname"/><br><br>
 新闻内容：<s:property value="xinwen.contenta"/><br><br>
 来源：<s:property value="xinwen.ly"/>
  </body>
</html>
