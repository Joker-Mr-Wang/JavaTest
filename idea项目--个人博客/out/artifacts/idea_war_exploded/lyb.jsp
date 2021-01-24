<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/17
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
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

<div style="float: left;width: 1000px;margin-top: 5px;margin-left: 50px;">
    <p style="font-size: 50px;font-family: '黑体';letter-spacing: 5px;color: darkblue">留言板</p>
<p style=" font-size: 30px;color: darkblue">留下你曾未说出口的情话</p>




</div>


<div style="float: left;width: 1400px;margin-top: 50px;margin-left: 50px;m;background-color:antiquewhite" >
<p><img src="img/tx2.JPG"  style="width: 60px;height: 60px" >冷極</p><br>
    <p>你说我的眼睛灿若星辰，那是因为你是星辰，而我的眼中只有你</p>
    <p><img src="img/tx1.JPG"  style="width: 60px;height: 60px" >孤酒暖阳</p><br>
    <p>从前，车马很慢，书信很远，一辈子只够做一件事，一生只够爱一个人</p>
    <p><img src="img/tx3.JPG"  style="width: 60px;height: 60px" >不是山谷</p><br>
    <p>爱是甘愿断掉了所有退路，只为换一个共度余生的你。</p>
    <p><img src="img/tx4.JPG"  style="width: 60px;height: 60px" >柠檬加冰</p><br>
    <p>你总是我嘴边人，你总是我心尖人，你总是我最爱人，反正你总是我的</p>
</div>

<audio src="./img/p.mp3" autoplay></audio>

</body>
</html>
