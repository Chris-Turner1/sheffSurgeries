<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | Home page </title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

      <div class="row">
      <h1>Sreda Student Enrolment System</h1>
      <formset>
      <legend>Search for Patients(Simple)</legend>
      <g:form action="results">
      <label for="name">Patient Name</label>
      <g:textField name="name"/>
      <g:submitButton name="search" value="Search" />
      </g:form>
      </formset>
      </div>
</body>
</html>
