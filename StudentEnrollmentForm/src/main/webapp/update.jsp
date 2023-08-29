<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Response</title>
</head>
<body>
<script>
var responseMessage = '<%= request.getAttribute("responseMsg") %>';
if(responseMessage)
alert('Success: '+responseMessage+', Successfully Upadated');
    
    </script>
 <script>
        
        setTimeout(function() {
            window.location.href = "read.jsp"; // Redirect to the desired page
        }, 1000); 
    </script>
</body>
</html>
