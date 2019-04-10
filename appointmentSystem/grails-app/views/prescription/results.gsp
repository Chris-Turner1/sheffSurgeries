<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | Home page </title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

   <div class="row">
   <h1>Medicine Results</h1>
   <h3>Search Results for Medicine</h3>
  <p>
   Searched ${totalPrescriptions} records
   for items matching <em>${term}</em>.
   Found <strong>${prescriptions.size()}</strong> prescriptions.
  </p>
  <ul>
  <g:each var="prescription" in="${prescriptions}">
  <li><g:link controller="patient" action="show"
  id="${prescription.id}">${prescription.medicine}</g:link></li>
  </g:each>
  </ul>
  <button type="button" class="btn btn-success">
  <g:link action='search'>Search Again</g:link>
  </button>

</div>
</body>
</html>


