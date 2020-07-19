<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login - First Web Application</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Todos for ${name}</h1>
<br>

<table>
    <caption>Your todos are:</caption>
    <thead>
    <tr>
        <th>Description</th>
        <th>Date</th>
        <th>Done</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todos}" var="item">
        <tr>
            <td>${item.desc}</td>
            <td>${item.targetDate}</td>
            <td>${item.done}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="/add-todo">Add a Todo</a>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>