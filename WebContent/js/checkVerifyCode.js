/*-----------------------------------------------------------------------------
* @Description: 验证码 
* @author: 	xuyihong(xuyihong@163.com)
* @date		2015.09.24
* ---------------------------------------------------------------------------*/
function showCheck(code,color){/* 显示验证码图片 */
	var c = document.getElementById("myCanvas");
  var ctx = c.getContext("2d");
	ctx.clearRect(0,0,1000,1000);
	ctx.font = "70px Arial";
	for(var i=0;i<5;i++) {
		ctx.fillStyle = color[i];
		createRandomLine(ctx);
		ctx.fillText(code[i],i*50,100);

	}
}

function createRandomLine(ctx) {
	for(var i=0;i<2;i++) {
		var start = new Object();
		var control = new Object();
		var end = new Object();
		start.x = Math.floor(Math.random()*200);
		start.y = Math.floor(Math.random()*160);
		control.x = Math.floor(Math.random()*400);
		control.y = Math.floor(Math.random()*160);
		end.x = Math.floor(Math.random()*200);
		end.y = Math.floor(Math.random()*160);
		ctx.beginPath();
		ctx.moveTo(start.x,start.y);
		ctx.quadraticCurveTo(control.x,control.y,end.x,end.y);
		ctx.stroke();
	}
}

var code =new Array(5); //在全局 定义验证码   
var color =new Array(5); 
function createCode(){       
    /*code = "";   */   
    var codeLength = 5;//验证码的长度
    var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z');      
    var selectColor = ["#FFC1C1","#FFA07A","#FF6347","#FF0000","#FF4040","#F08080","#EEAD0E","#EE00EE","#DEB887","#DB7093",
    							"#DAA520","#DA70D6","#D2B48C","#D2691E","#CDCD00","#CDAD00","#CD5555","#CD2990","#B23AEE","#999999",
    							"#8B4789","#8B2323","#7D26CD","#0F0F0F","#1E90FF","#212121","#00008B","#388E8E","#3D3D3D","#4169E1",
    							"#00CED1","#00688B"];
    for(var i=0;i<codeLength;i++) {
       var charIndex = Math.floor(Math.random()*42);      
      code[i] =selectChar[charIndex];
    }
    for(var i=0;i<selectColor.length;i++) {
    	var charIndex = Math.floor(Math.random()*32);      
        color[i] =selectColor[charIndex];
    }
    if(code.length != codeLength){      
      createCode();      
    }
    showCheck(code,color);
}
          

function validate () {
    var inputCode = document.getElementById("J_codetext").value.toUpperCase();
    var codeToUp=code.toUpperCase();
    if(inputCode.length <=0) {
      document.getElementById("J_codetext").setAttribute("placeholder","Type Here");
      createCode();
      return false;
    }
    else if(inputCode != codeToUp ){
      document.getElementById("J_codetext").value="";
      document.getElementById("J_codetext").setAttribute("placeholder","Error");
      createCode();
      return false;
    }
    else {
      window.open(document.getElementById("J_down").getAttribute("data-link"));
      document.getElementById("J_codetext").value="";
      createCode();
      return true;
    }

}

//为确定按钮添加回车事件
// document.onkeydown=function(event){
//     var e = event || window.event || arguments.callee.caller.arguments[0];
//     if(e && e.keyCode==13){ // enter 键
//         validate();
//     }
// }; 