// 捕获用户选择的入出庫タイプ值
function redirectToInOutStockList() {
    var id = document.getElementById('myForm').elements['id'].value; // 获取id参数值
    var url = '/' + id + '/inoutstocklist'; // 构建URL
    document.getElementById('myForm').action = url; // 设置表单的action属性
    document.getElementById('myForm').submit(); // 提交表单，进行跳转
}