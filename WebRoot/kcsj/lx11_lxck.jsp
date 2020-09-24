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
    
    <title>My JSP 'lx11_lxck.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function aba(){
	  if(confirm("你删除吗？")){
	  return false;
	  }
	else{
	return true;
	}
	}
	</script>

  </head>
  
  <body>
  <s:set value="0" var="aaa"></s:set>
  <h1>查看新闻类型：</h1>
  <table>
  <tr>
  <th>序号</th>
  <th>类型名</th>
  <th>操作</th>
  </tr>
  <s:iterator value="list" var="st">
  <s:set value="#aaa+1" var="aaa"></s:set>
  <tr>
  <td><s:property value="#aaa"/></td>
  <td><s:property value="#st.categoryname"/></td>
  <td><a href="zc/acalx.action?id=${st.id}&categoryname=${st.categoryname}">修改</a>  <a href="javascript: if(window.confirm('可能会吧新闻删除，是否删除？')){window.location.href = 'zc/aealx.action?id=${st.id}&categoryname=${st.categoryname}'}">删除</a></td>
  </tr>
  </s:iterator>
  </table>
  </body>
</html>
