<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<form action="eventList" method="post">
	<input type="hidden" name="type" value="title">
<div class="row mt-5">
	<div class="col-4 offset-4">		
		<input class="form-control" placeholder="제목" name="keyword">
		<c:if test="${searchOption}">
			<div class="mt-3 text-center">
				"${keyword}" 검색 결과
			</div>
		</c:if>			
	</div>
	<div class="col-4">
		<input type="submit" class="btn btn-dark" value="검색">		
	</div>	
</div>
</form>

<c:if test="${not searchOption}">
<div class="row my-3">
	<div class="col-2">		
	</div>
	<div class="col-8 text-end">	
		<a href="eventWriteForm" class="btn btn-outline-secondary">글쓰기</a>	
	</div>
	<div class="col-2">		
	</div>
</div>
</c:if>

<div class="row mt-5">
	<div class="col-2">
	</div>
	<div class="col-8">
		<table class="table">
			<tr class="text-center">
				<th>No</th>
				<th>제목</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			
			<c:if test="${not searchOption and empty eList}">
				<p>게시글이 존재하지 않습니다.</p>
			</c:if>
			
			<c:if test="${searchOption and empty eList}">
				<p>"${keyword}"가 포함된 게시글이 존재하지 않습니다.</p>
			</c:if>
			
			<c:if test="${not empty eList}">
				<c:forEach var="e" items="${eList}">
					<tr>
						<td>${e.no}</td>
						<c:if test="${not searchOption}">
						<td><a href="eventDetail?no=${e.no}&pageNum=${pageNum}" class="text-decoration-none link-dark">${e.title}</a></td>
						</c:if>
						<c:if test="${searchOption}">
						<td><a href="eventDetail?no=${e.no}&pageNum=${pageNum}&type=${type}&keyword=${keyword}" class="text-decoration-none link-dark">${e.title}</a></td>
						</c:if>
						<td>${e.regDate}</td>
						<td>${e.readCount}</td>
						</tr>
				</c:forEach>
			</c:if>		
		</table>
	</div>
	<div class="col-2">
	</div>
</div>

<c:if test="${not searchOption}">
<div class="row">
	<div class="col">
		<nav>
		  <ul class="pagination  justify-content-center">
		  	<c:if test="${pageGroup<startPage}">
			    <li class="page-itemd">
			      <a class="page-link" href="eventList?pageNum=${startPage-1}">Pre</a>
			    </li>
		    </c:if>
		 	<c:forEach var="i" begin="${startPage}" end="${endPage}">
		 		<c:if test="${pageNum==i}">
				    <li class="page-item active" aria-current="page">
				      <span class="page-link">${i}</span>
				    </li>
			    </c:if>
			    <c:if test="${pageNum !=i}">
				    <li class="page-item"><a class="page-link" href="eventList?pageNum=${i}">${i}</a></li>
			    </c:if>
		    </c:forEach>
		    <li class="page-item">
		      <a class="page-link" href="eventList?pageNum=${endPage+1}">Next</a>
		    </li>
		  </ul>
		</nav>
	</div>
</div>
</c:if>


<c:if test="${searchOption}">
<div class="row">
	<div class="col">
		<nav>
		  <ul class="pagination  justify-content-center">
		  	<c:if test="${pageGroup<startPage}">
			    <li class="page-itemd">
			      <a class="page-link" href="eventList?pageNum=${startPage-1}&type=${type}&keyword=${keyword}">Pre</a>
			    </li>
		    </c:if>
		 	<c:forEach var="i" begin="${startPage}" end="${endPage}">
		 		<c:if test="${pageNum==i}">
				    <li class="page-item active" aria-current="page">
				      <span class="page-link">${i}</span>
				    </li>
			    </c:if>
			    <c:if test="${pageNum !=i}">
				    <li class="page-item"><a class="page-link" href="eventList?pageNum=${i}&type=${type}&keyword=${keyword}">${i}</a></li>
			    </c:if>
		    </c:forEach>
		    <c:if test="${endPage<pageCount}">		    
			    <li class="page-item">
			      <a class="page-link" href="eventList?pageNum=${endPage+1}&type=${type}&keyword=${keyword}">Next</a>
			    </li>
		    </c:if>
		  </ul>
		</nav>
	</div>
</div>
</c:if>