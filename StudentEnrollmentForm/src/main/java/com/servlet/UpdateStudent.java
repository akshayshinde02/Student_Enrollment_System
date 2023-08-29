package com.servlet;

import com.entity.Student;
import com.entity.Update;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/update")
public class UpdateStudent extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        
        int rollNo = Integer.parseInt(request.getParameter("rollNo"));
        String fullName = request.getParameter("name");
        String className = request.getParameter("class");
        String bstring =  request.getParameter("date");
        String add = request.getParameter("address");
        String enroll = request.getParameter("enroll");
        

        Student student = new Student(rollNo,fullName,className,bstring,add,enroll);

        Update updateManager = new Update();
        updateManager.updateEmployee(rollNo, student);

        request.setAttribute("responseMsg", HttpServletResponse.SC_OK);

        request.getRequestDispatcher("update.jsp").forward(request, response);
       // response.sendRedirect("read.jsp");
    }
}
