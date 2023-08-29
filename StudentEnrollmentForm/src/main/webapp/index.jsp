<!DOCTYPE html>
<html>
<head>
    <title>Student Enrollment Form</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

   <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input[type="text"],
        input[type="date"],
        input[type="number"],
        textarea,
        input[type="tel"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        button[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button[type="submit"]:hover {
            background-color: #45a049;
        }
        
        </style>

<body>
<div class="container">

	<h1> Student Details</h1>
    <form action="studentservlet" method="post">
        <label>Roll No:</label>
        <input type="text" name="rollNo"/>
        <label>Full-Name:</label>
        <input type="text" name="name" />
        <label>Class:</label>
        <input type="text" name="class" />
       
        <label>Birth-Date:</label>
         <input type="text" name="date" />
        <label>Address:</label>
        <input type="text" name="address" />
        <label>Enrollment-Date:</label>
        <input type="text" name="enroll" />
        
        <button type="submit" >Submit</button>
        <button type="reset">Reset</button>
        <button type="button" class="btn btn-warning " onclick="window.location='read.jsp'"><i class="fas fa-list"></i> Read</button>
        
    </form>
    </div>
    
     
</body>
</html>
