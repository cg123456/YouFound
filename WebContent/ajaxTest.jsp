<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>   
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=utf8">  
<title>Insert title here</title>  
<script type="text/javascript">  
    function ajaxTest(){  
        $.ajax({  
        data:"name="+$("#name").val(),  
        type:"GET",  
        dataType: 'json',  
        url:"user/login.do",  
        error:function(data){  
            /*alert("出错了！！:"+data.msg);*/  
        },  
        success:function(data){  
            /*alert("success:"+data.msg);*/  
            $("#result").html(data.msg) ;  
        }  
        });  
    }  

    function reset() {
        $("#result").html("") ;
    }
</script>  
</head>  
<body>  
    <input type="text" name="name" id="name" onblur="ajaxTest()" onfocus="reset()"/>  
    <!-- <input type="submit" value="登录" onclick="ajaxTest();"/>   -->
    <div id="result"></div>  
</body>  
</html>  