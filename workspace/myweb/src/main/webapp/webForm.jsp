<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webForm</title>
</head>
<body>
	<h2>웹 폼 사례</h2>
	
	<form action="" method="get">
		<table border=1px>
			<tr>
				<th>사용자 이름</th>
				<th><input type="text" id='name' placeholder='이름을 입력하세요.'></th>
			</tr>
			<tr>
				<th>이메일</th>
				<th><input type="text" id='email' placeholder='메일주소를 입력하세요.'></th>
			</tr>
			<tr>
				<th>검색단어</th>
				<th><input type="text" id='search' placeholder='검색어를 입력하세요.'></th>
			</tr>
			<tr>
				<th>취미</th>
				<th>
					<input type=checkbox>운동
					<input type=checkbox>악기
					<input type=checkbox>여행
				</th>
			</tr>
			<tr>
				<th>성별</th>
				<th>
					<input type="radio" name="sex" value="male">남자
					<input type="radio" name="sex" value="female">여자
				</th>
			</tr>
			<tr>
			
				<th>점심메뉴</th>
				<th>
					<select name="menu">
						<option value="1">점심메뉴 선택</option>
						<option value="2">짜장면</option>
						<option value="3">짬뽕</option>
						<option value="4">탕수육</option>
						<option value="5">볶음밥</option>
					</select>
				</th>
			</tr>
		</table>
		<button>Submit</button>
	</form>
	
</body>
</html>