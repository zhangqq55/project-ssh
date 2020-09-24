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
    
    <title>My JSP 'kcsjsy.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	#aaa{
	float:left;
	}
	#abb{
	width:25%;
	float:left;
	text-align:center;
	}
	</style>
  </head>
  
  <body>
  <div id="abb">
  <h2>新闻分类</h2>
  <s:iterator value="list" var="st">
  <a href="zc/kcsjb.action?idid=${st.id}" target="aba"><s:property value="#st.categoryname"/></a><br><br>
  </s:iterator>
  </div>
  <div id="aaa">
  <iframe src="lx11_sy1.jsp" name="aba" style='width:900;height:500'></iframe>
  </div>
  </body>
</html>
