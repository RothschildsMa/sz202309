function login() {
    var id = document.getElementById('login').elements['id'].value; // 获取id参数值
    var url = '/login'; // 构建URL
    document.getElementById('login').action = url; // 设置表单的action属性
    document.getElementById('login').submit(); // 提交表单，进行跳转
}