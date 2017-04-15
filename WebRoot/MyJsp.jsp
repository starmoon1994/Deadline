<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import = "com.time.*" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="GBK">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" 
  href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
</head>
 <style>
	 p{
	 text-align:center;
	 }
	 h1{
	 text-align:center;
	 }
	 h2{
	 text-align:center;
	 }
 </style>
  
  <body>

   <div class="container">
	<div class="jumbotron">
	  <h1>这是一个计时器</h1> 
	  <p>这里有你需要的倒计时吗？</p> 
	</div>
</div>
<div class="container">
<div class="row">
  <div class="col-md-4">
    <h2>深圳</h2>

  </div>
  
  <div class="col-md-4">
  <p>如果姑娘实习回来的时间是5月7日</p>
  <%
   //声明Test的实例对象
  Test time = new Test();
  %>
  <p>姑娘回来的时间还剩下</p>
  <p><%=time.deadlineDays(5, 7) %>天</p>
  </div>
  
  <div class="col-md-4">
    <h2 >荆州</h2>
    <p>如果毕业时间是7月1日</p>
    <p>距离毕业只有
    <%=time.deadlineDays(7, 1) %>
    天
    </p>
    
  </div>
</div>
</div>
  </body>
  <footer style="text-align:center;color:#ff7256;">白首如新，倾盖如故</footer>
   <footer style="text-align:center;color:#ff7256;">现在的时间是<%=time.currentTime() %></footer>
 
</html>
