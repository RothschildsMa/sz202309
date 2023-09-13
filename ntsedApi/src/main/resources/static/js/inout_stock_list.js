// 将参数id传递到入出庫情報登録界面
function goToAdd() {
	var id = document.getElementById("idValue").value;
	window.location.href = '/' + id + '/stockioregister';
}

// 返回在庫情報一覧界面
function goBack() {
	window.location.href = '/inventory'; //待更新
}
