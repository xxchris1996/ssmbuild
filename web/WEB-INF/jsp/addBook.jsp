<%--
  Created by IntelliJ IDEA.
  User: xchris
  Date: 2021/6/16
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <%--bootstrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="co-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookname">书籍名称：</label>
            <input type="text" name="bookName" class="form-control" id="bookname" required>
        </div>
        <div class="form-group">
            <label for="bookcounts">书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" id="bookcounts" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述：</label>
            <input type="text" name="detail" class="form-control" id="detail" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>


    </form>


</div>
</body>
</html>
