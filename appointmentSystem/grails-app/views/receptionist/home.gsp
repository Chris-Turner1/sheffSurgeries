<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | Home page </title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

   <div id="content" role="main">


</div><g:loginToggle/>


<div class ="row">


	<div class="first"> 

          <h3>Doctor Management</h3>
          <p>lorem ipsum test test test </p>
          <button type="button" class="btn btn-success">
          <g:link controller="doctor" action="create">Add doctor</g:link>
          </button>


        <div class="second"> 


	<h3>Nurse Management</h3> 
        <p>lorem ipsum test test test</p>
        <button type="button" class="btn btn-success">
        <g:link controller="nurse" action="create">Add Nurse</g:link>
        </button>

</div>


<div class="first"> 


	<h3> Patient Management</h3> 
        <p>lorem ipsum test test test</p>
        <button type="button" class="btn btn-success">
        <g:link controller="patient" action="create">Add Patient</g:link>
        </button>

</div>

<div class="second"> 

     
       <h3>Receptionist Management</h3> 
       <p>lorem ipsum test test test</p>
       <button type="button" class="btn btn-success">
       <g:link controller="receptionist" action="create">Add Receptionist</g:link>
       </button>

<div class="first"> 

     
       <h3>Search</h3> 
       <p>lorem ipsum test test test</p>
       <button type="button" class="btn btn-success">
       <g:link controller="patient" action="search">Search Patient</g:link>
       </button>

</div>

</div> 

</div>

</body>

</html>
