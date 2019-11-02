<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="Styles/base.css" />
    <link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="Scripts/index.js"></script>
    <style type="text/css">
    	#msg{
    		width: 555px;
    		height: 420px;
    		font-size:30px;
    		font-weight:bold;
    		color:white;
    		border: 10px solid grey;
    		background:gray;
    		position: fixed;
    		top: 100px;
    		left: 500px;
    		z-index: 9999;
    	}
    	#msg form{  
    		font-weight:bold; 
    		position: fixed;
    		top: 130px;
    		left:620px;
    	}
    	#msg form label{
    		margin:10px;
    		font-size:20px;
    		font-weight:bold;
    	}
    	#msg form input{
    		width:300px;
    		height: 40px;
    	}
    	#x{
    		width: 30px;
    		height:30px;
    		float: right;
    	}
    	
    	
    </style>
    <script type="text/javascript">
    	function show(){
    		 $("#msg").show();
    	 }
    	function hide(){
   		 $("#msg").hide();
   	 }
    </script>
</head>
<body> 
    <div class="warp">
        <!--头部开始-->
        <div class="top_c">
               <div class="top-nav">欢迎 <a href="#">${uname}</a>, 
              &nbsp;&nbsp;<a href="#" id="m" onclick="show()">修改密码</a> | <a href="exit">安全退出</a></div>
        <div  id="msg">
        	<button id="x" onclick="hide()">X</button>
        		<form action="modifyPwd" method="post">
        			<label>用户名：</label><input type="text" value="${uname}" name="name" readonly="readonly">
        			<label>旧密码：</label><input type="password" name="password" placeholder="请输入您的原始密码">
        			<label>新密码：</label><input type="password" name="pwd" pattern="\w{6,20}" placeholder="请输入6—20位数字、单词">
        			<br><br><input id="bt" type="submit" value="确认修改">
        		</form>
        </div>
        <script type="text/javascript">
        	$("#msg").hide();
        </script> 
        </div>
        <!--头部结束-->
        <!--左边菜单开始-->
        <div class="left_c left">
            <h1>系统操作菜单</h1>
            <div class="acc">

              <!-- 房源管理区域-->
                <div>
                    <a class="one">房源管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="searchHouse.jsp">搜索</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="addHouse.jsp">录入</a></li>

                    </ul>
                </div>
                <div>

                      <!-- 客户管理区域  扩展网页自己创，模仿房源管理-->
                    <a class="one">我的客户</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href=" a">查询客户</a></li>
                        <li><b class="tip"></b><a target="Conframe" href=" a">添加客户</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="a">黑名单</a></li>
                    </ul>
                </div>
                <div>
                    <!-- 工作区域 扩展网页自己创，模仿房源管理-->
                    <a class="one">工作区域</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="a">看房签到</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="a">合同录入</a></li>
                        <li><b class="tip"></b><a target="Coframe" href="a">合同查询</a></li>
                	</ul>
                </div>

                <div>
                    <a class="one">业绩查询</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="a">房源录入记录</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="a">已完成合同</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="a">引入的客户</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="a">看房记录</a></li>
                    </ul>
                </div>
                <div id="datepicker"></div>
            </div>

        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>

        </div>
        <div class="Conframe">
            <iframe name="Conframe" id="Conframe"></iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">Copyright &copy;2019 中国铁塔股份有限公司® 版权所有</div>
        <!--底部结束-->
    </div>
</body>
</html>
