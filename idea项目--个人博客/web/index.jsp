<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/16
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登陆页面</title>
  <style>
    *{
      margin: 0;
      padding: 0;
    }
    #div_1{
      position: absolute;
      top: 340px;
      left: 780px;
      color:whitesmoke;
      font-size: 20px;font-family: '黑体';
    }
    #div_2{
      position: absolute;
      top: 130px;
      left: 180px;
      color:whitesmoke;
      font-size: 90px;font-family: '黑体';
    }
  </style>
</head>
<body>
<div id="div_2">
  <p><img src="img/tu1.jpg"  style="width: 80px;height: 80px" >我的空间</p><br>
</div>


<img src="img/z1.jpg"  style="width: 100%;height: 100%" >
<div id="div_1">
  <form action="./login" method="post"><%--get  会将参数显示在地址栏  post参数不显示在地址栏--%>
    <p>用户姓名：<input type="text" name="uname"></p><br>
    <p>用户密码：<input type="password" name="upass"></p><br><br>
         <button type="submit" style="margin-left: 100px" >登陆</button>
         <button type="reset" style="margin-left: 10px">注册</button>
    <button type="reset" style="margin-left: 10px">忘记密码</button>

  <span style="color: red">${mess}</span>
</div>



</body>
</html>
