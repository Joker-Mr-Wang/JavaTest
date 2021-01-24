<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/4/11
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${user}个人博客界面</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        p{
            color: white;
            line-height: 50px;
            font-size: 17px;
        }
    </style>
    <script>
        var num = 0;
        function fun() {   //调用一次   num加1   图片就换一张
            num++;
            if (num>7) {
                num=1;
            }
            //得到   img   标签
            var img = document.getElementById("img");
            img.src="img/f"+num+".jpg"
            setTimeout("fun()",1000);   //1000毫秒    1s
        }
    </script>

</head>
<body onload="fun()" style="background-color:lightblue">  <%--onload  代表页面加载完成后需要执行的函数 --%>
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
        <img src="img/f1.jpg" id="img" width="550px" height="300px">
    </div>
</div>
<div style="float: left;width: 1000px;margin-top: -255px;margin-left: 650px">
    <p style="font-size: 30px;font-family: '黑体';letter-spacing: 7px;">美好瞬间</p>
    <p>从前，车马很慢，书信很远，一辈子只够做一件事，一生只够爱一个人</p>
    <p>世间美好与你环环相扣，美食与风景不可辜负。一生很短，只想与你度过</p>
    <p>每一首歌的背后，都藏着一个故事，每一个羞涩的回避，而渴望更好的相逢。</p>
    <p>想陪你走过你曾经走过的路，吃你爱吃的美食，做你身边最亲近你的人 </p>
    <a href="http://localhost:8080/blog/lyb.jsp" style="margin-left: 570px">更多&gt;></a>
</div>

<div>

    <marquee  direction="right">
        <img src="img/m1.jpg" width="300px" height="300px">
        <img src="img/m2.jpg" width="300px" height="300px">
        <img src="img/m3.jpg" width="300px" height="300px">
        <img src="img/m4.jpg" width="300px" height="300px">
        <img src="img/m6.jpg" width="300px" height="300px">
        <img src="img/m5.jpg" width="300px" height="300px">
    </marquee>


</div>
<img src="img/f4.jpg" width="100%" height="300px">
<%--<audio autoplay="autoplay">

    <source src="img/p.mp3" type="audio/mp3">v
</audio>--%>

<!-- 仅自动播放音乐 -->
<audio src="./img/p.mp3" autoplay></audio>






</body>
</html>
