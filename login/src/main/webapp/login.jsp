<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<jsp:include page="/WEB-INF/pages/plugins/include_basepath.jsp" />
<jsp:include page="/WEB-INF/pages/plugins/include_javascript.jsp" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script type="text/javascript" src="jquery/jquery.backstretch.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</head>
<%
	String loginUrl = "" ;
%>
<body>
	<div class="top-content">
		<div class="inner-bgx">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top"> 
							<div class="form-top-left">
								<h3>系统授权</h3>
							</div> 
							<div class="form-top-right">
								<i class="fa fa-lock"><img src="images/login-lock.png"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="<%=loginUrl%>" method="post" class="form-horizontal" id="memberForm">
								<div class="form-group" id="midDiv">
									<div class="col-md-12">
										<!-- 定义表单输入组件 -->
										<input type="text" id="mid" name="mid" class="form-control"
											placeholder="请输入用户编号...">
									</div>
								</div>
								<div class="form-group" id="passwordDiv">
									<div class="col-md-12">
										<!-- 定义表单输入组件 -->
										<input type="password" id="password" name="password" class="form-control"
											placeholder="请输入登录密码...">
									</div>
								</div>
								<div class="form-group" id="codeDiv">
									<div class="col-md-10">
										<!-- 定义表单输入组件 -->
										<input type="text" id="code" name="code" class="form-control"
											placeholder="验证码..." size="4" maxlength="4">
									</div> 
									<div class="col-md-2 col-md-pull-1">
										<img src="ImageCode">
									</div>
								</div> 
								<button type="submit" class="btn">登录系统</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
