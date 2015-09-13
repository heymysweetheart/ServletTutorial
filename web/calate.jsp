<%--
  Created by IntelliJ IDEA.
  User: leo
  Date: 15/9/13
  Time: 下午4:20
  To change this template use File | Settings | File Templates.
--%>
<%@  page  language="java"  import="java.util.*"  pageEncoding="UTF-8"%>
<%  String path = request.getContextPath(); String  basePath  =  request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>calculator</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta  http-equiv="keywords"  content="keyword1,keyword2,keyword3">

  <meta http-equiv="description" content="This is my page">
  <!--   <link rel="stylesheet" type="text/css" href="styles.css">   -->
</head>
<body>
<%
  String first = (String)request.getAttribute("first");
  String second = (String)request.getAttribute("second");
  String operator = (String)request.getAttribute("operator");
  String result = (String)request.getAttribute("result");
%>
<h1>简易计算器</h1>

<form method="post" action="calculatorServlet">
  <input  name="first"  value="<%=(first==null?"":first) %>"/>
  <select name="operator" >
    <option  value="+">+</option>
    <option value="-">-</option>
    <option value="/">/</option>
    <option value="*">*</option>
    <option value="pow">square</option>
    <option value="sqrt">radication</option>
  </select>
  <input  name="second"  value="<%=(second==null?"":second) %>"/>&nbsp;&nbsp;=
  <input name="result" value="<%=(result==null?"":result) %>" />
  <input value="计算" type="submit">
</form>
</body>
</html>
