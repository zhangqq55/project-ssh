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
    
    <title>My JSP 'kcsjmohucg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#table1 td{
		border:#777 1px solid;
		}
		
	</style>

  </head>
  
  <body>
  <form action="/Kj3/zc/kcsjc.action" namespace="/zc">
  标题:<input type="text" name="mohuname"><br>
  新闻时间：<input type="datetime-local" name="hks">---<input type="datetime-local" name="hjs"><br>
  <input type="submit" value="搜索"/>
  </form>
  <h2>筛选条件</h2>
  <h3>标题（包含）：<s:property value="mohuname"/></h3>
  <h3>开始时间：<s:property value="hks"/></h3>
  <h3>结束时间：<s:property value="hjs"/></h3>
  <s:set value="0" var="aaa"></s:set>
  <table id="table1">
  <tr>
  <th>序号</th>
  <th>标题</th>
  <th>发布时间</th>
  <th>类型</th>
  </tr>
  <s:iterator value="list" var="sst1">
  <s:set value="#aaa+1" var="aaa"></s:set>
  <tr>
  <td><s:property value="#aaa"/></td>
  <td><a href="zc/CxnrAction.action?id=${sst1.id}"><s:property value="#sst1.titlea"/></a></td>
  <td><s:property value="#sst1.issuetime"/></td>
  <td><s:property value="#sst1.category.categoryname"/></td>
  <tr>
  </s:iterator>
  </table>
  </body>
</html>
