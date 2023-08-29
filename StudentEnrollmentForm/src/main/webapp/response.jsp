<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Response</title>
</head>
<body>
<script>
var responseMessage = '<%= request.getAttribute("responseMessage") %>';
if(responseMessage)
alert('Success: '+responseMessage+', Successfully Created');
    
    </script>
 <script>
        
        setTimeout(function() {
            window.location.href = "index.jsp"; // Redirect to the desired page
        }, 1000); 
    </script>
</body>
</html>
