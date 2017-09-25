function menu_over(e) {
	e.setAttribute("calss", "nav-item active");
}
function menu_out(e) {
	e.setAttribute("calss", "nav-item"); // <li class="nav-item">
}
function greeting(nation) {
	console.log("greeting 함수 시작");
	if (nation == 'k') {
		document.getElementById("result").innerHTML = "01055834963";
	} else if (nation == 'e') {
		document.getElementById("result").innerHTML = "hana4963@naver.com";
	} else {
		document.getElementById("result").innerHTML = "경기도 시흥시 장곡동 우성아파트";
	}
	console.log("greeting 함수 끝");
}

$(document).ready(function() {
	$('#loginForm').submit(function(event) {
		event.preventDefault();

		var id = $('#id').val();
		var pwd = $('#pwd').val();
		console.log(id, pwd);

		$.post("http://httpbin.org/post", {
			"id" : id,
			"pwd" : pwd
		}, function(data) {
			var myModal = $('#myModal');
			myModal.modal();
			myModal.find('.modal-body').text(data.form.id + '님 로그인 되었습니다.');
		});
	});
});


$(document).ready(function() {
	$('#joinForm').submit(function(event) {
		event.preventDefault();

		var id = $('#joinId').val();
		var pwd = $('#joinPwd').val();
		console.log(id, pwd);

		$.post("http://httpbin.org/post", {
			"id" : id,
			"pwd" : pwd
		}, function(data) {
			var myModal = $('#joinModal');
			myModal.modal();
			myModal.find('.modal-body').text(data.form.id + '님 회원가입 되었습니다.');
		});
	});
});
