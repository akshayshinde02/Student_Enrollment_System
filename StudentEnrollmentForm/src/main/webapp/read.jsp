<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.List" %>
<%@page import="com.entity.Student" %>
<%@page import="com.entity.Display" %>

<%
	Display r = new Display();
	List<Student> student = r.getStudent();
	
	
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<style>

table {
    width: 100%;
    border-collapse: collapse;
    border: 1px solid #ccc;
}

th, td {
    padding: 10px;
    text-align: left;
    border-bottom: 1px solid #ccc;
}

th {
    background-color: #f2f2f2;
    font-weight: bold;
}

tbody tr:nth-child(even) {
    background-color: #f2f2f2;
}

.uq{
	
	text-align:center;
}

tbody tr:hover {
    background-color: #ddd;
}

 .center-button {
            display: flex;
            justify-content: center;
            margin-top:8px;
        }


</style>

<body>

<h1>Student Information</h1>

<table border="1" cellspacing="0">
	
		<tr>
		<th>Roll No</th>
		<th>Full Name</th>
		<th>Father Name</th>
		<th>CLass Name</th>
		<th>Birth Date</th>
		<th>Address</th>
		<th>Enrollment Date</th>
		
		</tr>
		
		<% for(Student emp : student)  {%>
		
			<tr>
				
				<td><%= emp.getRollNo() %></td>
				<td><%= emp.getFullName() %></td>
				<td><%= emp.getClassName() %></td>
				<td><%= emp.getBirthDate() %></td>
				<td><%= emp.getAddress() %></td>
				<td><%= emp.getEnrollmentDate() %></td>
				<td>
			
			<form onsubmit="return confirm('Are you sure you want to Update this employee?');" action="newupdate.jsp" method="post">
            <input type="hidden" name="studId" value="<%= emp.getRollNo() %>" >
            <button type="submit"  class="btn btn-warning">Update</button>
        		</form>
        		
        		
				
				</td>
				
				
			</tr>
			
		<% } %>
		
		
</table>

<div class="center-button">
                
                <button type="submit" class="btn btn-primary " onclick="fun()">Back</button>
            </div>



<script>
        function goToPage2() {
            // Redirect to page2.jsp when the button is clicked
            window.location.href = "update.jsp";
        }
        function fun(){
        	
        	window.location.href = 'index.jsp';
        }
    </script>

</body>

</html>