<%--
  Created by IntelliJ IDEA.
  User: leo
  Date: 15/9/9
  Time: 下午2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>欢迎来到学生管理系统</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">

</head>

<body>
<div align="center"> <font size=" 2" color="#FF6633">用户登录</font>
</div>
<form id="form1" name="form1" method="post" action="loginServlet">
  <table width="357" border="0" align="center">
    <tr>
      <td width="128">用户名：</td>
      <td width="219"><label>
        <input name="user" type="text" id="user" />
      </label></td>
    </tr>
    <tr>
      <td>密　码：</td>
      <td><label>
        <input name="pwd" type="password" id="pwd" />
      </label></td>
    </tr>
    <tr>
      <td><label>
        <input type="submit" name="Submit" value="登录" />
      </label></td>
      <td><label><a href="addUser.jsp">用户注册</a></label></td>
    </tr>
  </table>
  <p>&nbsp;</p>
</form>
</body>
</html>
