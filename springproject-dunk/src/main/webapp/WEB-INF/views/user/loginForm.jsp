<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="row">
	<div class="col-4">
	</div>
	<div class="col-4">
		<div class="row mt-5 mb-3 fw-bold fs-3">
			<div class="col text-center">
				<p>로그인</p>
			</div>
		</div>
		<form action="login" method="post">
			<div class="row">
				<div class="col">
					<input class="form-control" placeholder="아이디" name="id" id="id">
				</div>			
			</div>
			<div class="row">
				<div class="col">
					<input type="password" class="form-control my-2" placeholder="비밀번호" name="pass" id="pass">
				</div>			
			</div>
			<div class="row">
				<div class="col">
					<div class="d-grid gap-2">
						<input type="submit" class="btn btn-warning my-2" value="로그인" id="btnLogin">
					</div>
				</div>			
			</div>
		</form>
		<div class="row">
			<div class="col">			
				<p class="mt-5 mb-2 text-center">아직 회원이 아니신가요?</p>
			</div>			
		</div>
		<div class="row">
			<div class="col">
				<div class="d-grid gap-2">
					<input type="button" class="btn btn-outline-warning my-2" value="회원가입하기" id="btnJoin" onclick="location.href='joinForm'">
				</div>
			</div>			
		</div>
	</div>
	<div class="col-4">
	</div>
</div>