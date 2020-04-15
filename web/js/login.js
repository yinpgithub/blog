function login() {

	var $userName = $("#userName").val();
	var $password = $("#password").val();
	if ($userName == null || $userName == "") {
		alert("请输入用户名");
		return;
	}
	if ($password == null || $password == "") {
		alert("请输入密码");
		return;
	}

	$.ajax({
		url: "http://127.0.0.1:8080/login",
		contentType: "application/json",
		type: "POST",
		async: false,
		data: JSON.stringify({
			"t": (new Date()).valueOf(),
			"userName": $userName,
			"password": $password
		}),
		dataType: "json",
		success: function(res) {
			alert(res.msg);
			if(res.result){
				window.location.href='/index.html';
			}
		},
		error: function(res) {
			alert(res.msg);
		}
	})
}
