<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | Home page </title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

      <div class="row">
      <h1>Sheffield Surgeries</h1>
      <formset>
      <legend>Search for Prescription</legend>
      <g:form action="results">
      <label for="name">Medicine Name</label>
      <g:textField name="name"/>
      <g:submitButton name="search" value="Search" />
      </g:form>
      </formset>
      </div>
</body>
</html>
 
