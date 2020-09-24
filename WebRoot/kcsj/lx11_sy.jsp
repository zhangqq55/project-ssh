<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lx11_sy.jsp' starting page</title>
    
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
  <h3>类型管理</h3>
  <p><a href="zc/aaalx.action" target="aba">类型查看</a></p>
  <p><a href="kcsj/lx11_lxfb.jsp" target="aba">类型发布</a></p>
  <br>
  <h3>新闻管理</h3>
  <p><a href="zc/CxxinwenAction.action" target="aba">新闻查看</a></p>
  <p><a href="zc/ZzaddxinwenAction.action" target="aba">新闻发布</a></p>
  </div>
  <div id="aaa">
  <iframe src="lx11_sy1.jsp" name="aba" style='width:1000;height:400'></iframe>
  <!-- 可以自己写一个显示sql的数据的页面 -->
  </div>
</body>
</html>
