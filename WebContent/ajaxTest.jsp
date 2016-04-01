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
        $("#user_vaildate").html("") ;
    }



    function ajaxVaildateUser() {
        var vaildate = true;
        $("label").each(function() {
            var labelval = $(this).html();
            /*alert("labelval="+labelval);*/
            if($.trim(labelval) == $.trim("请输入手机号")||$.trim(labelval) == $.trim("手机号有误")){
                vaildate = false;
                return false;
                /*return false;——跳出所有循环；相当于 javascript 中的 break 效果。
                return true;——跳出当前循环，进入下一个循环；相当于 javascript 中的 continue 效果*/

            }
        });

        if(vaildate) {
            $.ajax({
                data:"username="+$("#username").val(),
                type:"GET",
                dataType:'json',
                url:"user/vaildateUser.do",
                error:function(data) {

                },
                success: function(data) {
                    $("#user_vaildate").html(data.msg); 
                }
            });
        }

    }


</script>  
</head>  
<body>  
    <input type="text" name="username" id="username" onblur="ajaxVaildateUser()" onfocus="reset()"/>  
    <label id="user_vaildate" ></label>
    
    <label for="password" generated="true" class="error">aa</label>
    <label for="telphone" generated="true" class="error">qq</label>
    <!-- <input type="submit" value="登录" onclick="ajaxTest();"/>   -->
    <!-- <div id="result"></div> -->  
</body>  
</html>  