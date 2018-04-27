<%@include file="../commons/header.jspf"%>
<%@include file="../commons/nav.jspf"%>
<div class="container">
	<h1>Personal Projects</h1>
	<table class="table table-striped">
		<!--  <caption>Personal Projects</caption>-->
		<thead>
			<th>Name</th>
			<th>Description</th>
			<th>Technologies</th>
			<th>Github Repository</th>
		</thead>
		<tbody>
			<c:forEach items="${projects}" var="project">
				<tr>
					<td><a href="${project.appUrl}" target="_blank">${project.name}</a></td>
					<td>${project.description}</td>
					<td>${project.technologies}</td>
					<td>&nbsp;&nbsp;&nbsp;<a href="${project.githubUrl}" target="_blank">Link</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@include file="../commons/footer.jspf"%>