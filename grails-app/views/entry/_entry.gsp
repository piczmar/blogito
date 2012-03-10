<div class="entry">
	<span class="entry-date"> <g:longDate
			value="${entryInstance.lastUpdated}" /> : ${entryInstance.author} </span>
	<h2>
		<g:link action="show" id="${entryInstance.id}">
			${entryInstance.title}
		</g:link>
	</h2>
	<p>
		${entryInstance.summary}
	</p>
</div>