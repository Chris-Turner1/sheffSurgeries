<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | Home page </title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

   <div id="content" role="main">


<div class ="row">


	<div class="first"> 

          <h3>Prescription Management</h3>
          <p>lorem ipsum test test test </p>
          <button type="button" class="btn btn-success">
          <g:link controller="doctor" action="create">Add doctor</g:link>
          </button>


        <div class="second"> 


	<h3>Prescription List</h3> 
        <p>lorem ipsum test test test</p>
        <button type="button" class="btn btn-success">
        <g:link controller="nurse" action="index">List Prescription</g:link>
        </button>

</div>


<div class="third"> 


	<h3> Patient List</h3> 
        <p>lorem ipsum test test test</p>
        <button type="button" class="btn btn-success">
        <g:link controller="patient" action="index">List Patient</g:link>
        </button>

</div>

<div class="forth"> 

     
       <h3>Appointment List</h3> 
       <p>lorem ipsum test test test</p>
       <button type="button" class="btn btn-success">
       <g:link controller="appointment" action="index">List Appointment</g:link>
       </button>

</div>

</div> 

</div>

</div><g:doctorloginToggle/>

</body>

</html> 
