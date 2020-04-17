<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록 등록 양식</title>
</head>
<body>
	<h2>주소록:: 등록</h2>
	<form action="addrbook_control.jsp" method="post">
		<input type="hidden" name="action" value="insert">
		<div>
			<label for="ab_name">Name: </label>
		<input type="text" name="ab_name">
	</div>
		<div>
			<label for="ab_email">Email: </label>
		<input type="text" name="ab_email">
	</div>
		<div>
			<label for="ab_birth">Birth: </label>
		<input type="text" name="ab_birth">
	</div>
		<div>
			<label for="ab_tel">Telephone: </label>
		<input type="text" name="ab_tel">
	</div>
		<div>
			<label for="ab_comdept">Company: </label>
		<input type="text" name="ab_comdept">
	</div>
		<div>
			<label for="ab_memo">Memo: </label>
		<input type="text" name="ab_memo">
	</div>
		<input type="submit" value="등록"> 
		<input type="reset" value="취소">

	</form>
</body>
</html>