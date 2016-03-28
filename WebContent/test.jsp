<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=cd73b4c03223ddc97b49b9f72b09afc5"></script>
<title>Success Page</title>
<style>
#container {width:1080px; height: 800px; }  
</style>
</head><coordx>113.41069793701172</coordx>
  <coordy>23.04681396484375</coordy>
<body>
<div id="container"></div>
<script type="text/javascript">
	var map = new AMap.Map('container',{
        zoom: 10,
        center: [113.41069793701172,23.04681396484375]
    });
    var marker = new AMap.Marker({
        position: [113.41069793701172, 23.04681396484375],
        map:map
    });
</script>
<!-- <div style="text-align:center;">
<p><img src="images/banner.jpg" style="text-align:center;"></img></p>
</div> -->
</body>
</html>