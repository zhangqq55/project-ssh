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
    
    <title>My JSP 'lx11_xwfb.jsp' starting page</title>
    
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
  <s:form action="AddxinwenAction" namespace="/zc">
  <s:textfield name="titlea" label="标题" value=""></s:textfield>
  <s:select name="cid" label="类型" list="#{'--请选择类型--':0}" listValue="key" listKey="value">
  <s:iterator value="list" var="st">
  <s:optgroup list="#{#st.categoryname:#st.id}" listValue="key" listKey="value">
  </s:optgroup>
  </s:iterator>
  </s:select>
  <s:textarea name="contenta" label="内容" cols="30" rows="8" value=""></s:textarea>
  <s:textfield name="ly" label="来源" value=""></s:textfield>
  <s:submit value="添加"></s:submit>
  </s:form>
  </body>
</html>
