<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Page</title>
<script language="javascript" type="text/javascript" src="http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js"></script>
<script type="text/javascript">
//var remote_ip_info = {"ret":1,"start":-1,"end":-1,"country":"\u4e2d\u56fd","province":"\u6cb3\u5357","city":"\u90d1\u5dde","district":"","isp":"","type":"","desc":""};
var add0 = remote_ip_info.country;
var add1 = remote_ip_info.province;
var add2 = remote_ip_info.city;
var add = add0+add1+add2;


document.writeln(add);
if( add1 == "河南"){
document.writeln("this is henan(河南)");
}else{
document.writeln("this is not henan(河南)");
}

</script>
</head>
<body>
</body>
</html>