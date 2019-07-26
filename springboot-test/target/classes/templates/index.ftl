
<!DOCTYPE html>
<html lang="en">
<head>
       <meta charset="UTF-8">
       <title>SpringBoot演示</title>
</head>
<body>
   这是一个freemarker页面。
<p>欢迎你：<span style="color: red">${username!''}</span></p>
<button type="button"
        onclick="document.getElementById('demo4').innerHTML = Date()">
    点击这里来显示日期和时间
</button>

<p id="demo4" ></p>

-- 改变内容
<p id="demo1" style="color:#4aff2e;" >JavaScript 能够改变 HTML 内容。</p>

<button type="button"  onclick='document.getElementById("demo1").innerHTML = "Hello JavaScript!"'>点击我！</button>



<p>JavaScript 能够改变 HTML 属性值。</p>
<p>在本例中，JavaScript 改变了图像的 src 属性值。</p>

<button onclick="document.getElementById('myImage').src='http://localhost:8080/springboottest/static/img/eg_bulbon.gif'">开灯</button>

<img id="myImage" border="0" src="http://localhost:8080/springboottest/static/img/eg_bulboff.gif" style="text-align:center;">

<button onclick="document.getElementById('myImage').src='http://localhost:8080/springboottest//static/img/eg_bulboff.gif'">关灯</button>

<p id="demo2">JavaScript 能够改变 HTML 元素的样式。</p>

<button type="button" onclick="document.getElementById('demo2').style.fontSize='55px'">
    点击我！
</button>

<p>JavaScript 能够显示隐藏 HTML 元素。</p>

<p id="demo3" style="display:none">Hello JavaScript!</p>

<button type="button" onclick="document.getElementById('demo3').style.display='block'">
    点击我！
</button>

<h1>外部 JavaScript</h1>

<p id="demo" >一个段落。</p>

<button type="button" onclick="myFunction()">试一试</button>

<p>（myFunction 存储在名为 "myScript.js" 的外部文件中。）</p>


<p>写入数据</p>
<button type="button" style="color:#4aff2e;" onclick="test()">点击有奇效</button>
<p style="color: #4aff2e">
<script>
document.write("这是script写入的数据")
</script>
</p>

<p style="color:red">将删除所有已经加载的属性</p>
<button onclick="document.write(5 + 6)">试一试</button>




<script>
    var message="前方高能";
    console.log("控制台输出测试");
    function  AlertFunction(message) {
        
        alert(message);
    }
    function test() {
        alert("前方高能");
    }
</script>
<script src="http://www.w3school.com.cn/demo/myScript.js"></script>


</body>
</html>