<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="resources/bootstrap/bootstrap-icons.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="resources/css/header.css">
	<script src="resources/js/jquery-3.2.1.min.js"></script>
	<script src="resources/js/formcheck.js"></script>
	<script src="resources/js/teamrecruitformcheck.js"></script>
	<script src="resources/js/user.js"></script>
</head>
<body>

<div class="container">
	<%@ include file="template/header.jsp" %>
	<jsp:include page="${param.body}" />
	<%@ include file="template/footer.jsp" %>
</div>
	<script src="resources/bootstrap/bootstrap.bundle.min.js"></script>	
</body>
</html>