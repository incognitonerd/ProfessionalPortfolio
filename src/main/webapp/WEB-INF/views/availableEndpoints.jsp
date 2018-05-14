<%@include file="../commons/header.jspf"%>
<%@include file="../commons/navOtherPages.jspf"%>
<div class="container">
	<h1>Available Endpoints</h1>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<th>Endpoint Url</th>
				<th>Description</th>
				<th>Endpoint Query</th>
			</thead>
			<tbody>
				<c:forEach items="${endpoints}" var="endpoint">
					<tr>
						<td><a href="${endpoint.url}" target="_blank">${endpoint.name}</a></td>
						<td>${endpoint.description}</td>
						<td>${endpoint.query}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@include file="../commons/footer.jspf"%>