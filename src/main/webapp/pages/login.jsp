
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="display: flex;align-items: center;justify-content: center">
      <form action="/login">
        <div>
          <h2>管理员登录</h2>
        </div>
        <div>
          账号：<input type="text" name="name" value="li">
        </div>
        <div>
          密码：<input type="text" name="password" value="li">
        </div>
        <div style="color: #FF0000">
          ${requestScope.error}
        </div>
        <div>
          <input type="submit" value="登录">
        </div>
      </form>

    </div>
</body>
</html>
