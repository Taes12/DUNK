<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

    <!-- header -->
<div class="row" id="dunk_header">
	<!-- 검색,로그인버튼부분 -->
	<div class="row">
				<div class="col">
					<ul class="nav justify-content-end">
							  <li class="nav-item">
							  	<form class="d-flex" role="search">
							      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
							      <button class="btn btn-outline-success" type="submit">Search</button>
							    </form>
							  </li>
							  <c:if test="${not sessionScope.isLogin}">
								  <li class="nav-item">
								    	<a class="nav-link" href="loginForm">로그인</a>
								  </li>								  
							  </c:if>
							  <c:if test="${sessionScope.isLogin}">
								  <li class="nav-item">
								    	<a class="nav-link" href="mypage?id=${sessionScope.id}">마이페이지</a>
								  </li>
								  <li class="nav-item">
								    	<a class="nav-link" href="logout">로그아웃</a>
								  </li>
							  </c:if>
					</ul>
				</div>
			</div>
			<!-- 메인로고부분 -->
			<div class="container text-center">
				<div class="row">
					<p>
						<a href="#">
							<img class="img-fluid" src="./resources/icon/dunk_main_icon.png" width="200px" height="200px">
						</a>
					</p>
				</div>
			</div>
			<!-- 메뉴바 시작  -->
			<div class="row" id="menu_bar">
				<ul class="nav nav-pills">
				<!-- 드롭다운영역 -->
				  <li class="nav-item dropdown">
				    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">
				    	<img data-bs-toggle="dropdown" aria-expanded="false" src="./resources/icon/basketballicon.png" width="25px;">
				    </a>
				    <ul class="dropdown-menu">
			    	  <li><a class="dropdown-item" href="teamRecruitmentList">팀모집</a></li>
				      <li><a class="dropdown-item" href="#">토너먼트</a></li>
				      <li><a class="dropdown-item" href="#">토너먼트</a></li>
				      <li><a class="dropdown-item" href="#">뉴스</a></li>
				      <li><a class="dropdown-item" href="#">이벤트</a></li>
				      
				      <li><hr class="dropdown-divider"></li>
				      <li><a class="dropdown-item" href="#">Separated link</a></li>
				    </ul>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="#">매치</a>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="#">장소</a>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="eventList">이벤트</a>
				  </li>
				</ul>
			</div>
</div>