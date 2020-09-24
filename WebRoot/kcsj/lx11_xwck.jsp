<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lx11_xwck.jsp' starting page</title>
    
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
  <s:form action="CxxinwenlxAction" namespace="/zc">
  <s:select name="cid" label="类型" list="#{'--请选择类型--':0}" listValue="key" listKey="value">
  <s:iterator value="list" var="st">
  <s:optgroup list="#{#st.categoryname:#st.id}" listValue="key" listKey="value">
  </s:optgroup>
  </s:iterator>
  </s:select>
  <s:submit value="查询"></s:submit>
  </s:form>
  <br><br>
  <s:set value="0" var="aaa"></s:set>
  <table>
  <tr>
  <th>序号</th>
  <th>标题</th>
  <th>发布时间</th>
  <th>类型</th>
  <th>操作</th>
  </tr>
  <s:iterator value="lista" var="st">
  <s:set value="#aaa+1" var="aaa"></s:set>
  <tr>
  <td><s:property value="#aaa"/></td>
  <td><a href="zc/CxnrAction.action?id=${st.id}"><s:property value="#st.titlea"/></a></td>
  <td><s:property value="#st.issuetime"/></td>
  <s:set value="#st.category" var="aba"></s:set>
  <td><s:property value="#aba.categoryname"/></td>
  <td><a href="zc/XgzzAction.action?id=${st.id}&titlea=${st.titlea}&contenta=${st.contenta}&ly=${st.ly}">修改</a>  <a href="javascript: if(window.confirm('是否删除？')){window.location.href = 'zc/ScxinwenAction.action?id=${st.id}'}">删除</a></td>
  </tr>
  </s:iterator>
  </table>
  </body>
</html>
