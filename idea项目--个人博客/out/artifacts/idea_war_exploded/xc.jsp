<%--
Created by IntelliJ IDEA.
User: ASUS
Date: 2020/4/17
Time: 16:57
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>相册</title>
   <style>*{
       margin: 0;
       padding: 0;
   }</style>
</head>
<body style="background-color:lightblue">
<div>
    <img src="img/z3.jpg" style="width: 100%" height="300px">
    <div style="position: absolute;margin-top: -42px">
        <span style="margin-left: 350px"><a style="text-decoration: none;color: white" href="http://localhost:8080/blog/blog.jsp">首页</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="">我的说说</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="">个人档案</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="http://localhost:8080/blog/xc.jsp">${user}个人相册</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="http://localhost:8080/blog/lyb.jsp">留言板</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="https://www.taobao.com/">网上商城</a></span>
        <span style="margin-left: 70px"><a style="text-decoration: none;color: white" href="">空间设置</a></span>

    </div>
</div>


<div>
    <div>
        <img src="img/1.jpg"  width="500px" height="300px">
        <img src="img/m1.jpg"  width="500px" height="300px">
        <img src="img/m2.jpg"  width="500px" height="300px">
        <img src="img/m3.jpg"  width="500px" height="300px">
        <img src="img/m4.jpg"  width="500px" height="300px">
        <img src="img/m5.jpg"  width="500px" height="300px">
        <img src="img/m6.jpg"  width="500px" height="300px">
        <img src="img/f1.jpg"  width="500px" height="300px">
        <img src="img/f2.jpg"  width="500px" height="300px">
        <img src="img/f3.jpg"  width="500px" height="300px">
        <img src="img/f5.jpg"  width="500px" height="300px">
        <img src="img/f6.jpg"  width="500px" height="300px">
        <img src="img/z1.jpg"  width="500px" height="300px">
        <img src="img/z2.jpg"  width="500px" height="300px">
        <img src="img/z3.jpg"  width="500px" height="300px">

    </div>
</div>


<audio src="./img/p.mp3" autoplay></audio>

</body>
</html>