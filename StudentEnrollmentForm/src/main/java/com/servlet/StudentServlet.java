package com.servlet;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Student;
import com.provider.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */


@WebServlet("/studentservlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }
   
//        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            String rollNo = request.getParameter("rollNo");
//                        
////            Roll-No, Full-Name, Class, Birth-Date, Address, Enrollment-Date
//            
//            Session session = FactoryProvider.getFactory().openSession();
//            
//            Student student = session.get(Student.class, rollNo);
//            session.close();
//            
//            request.setAttribute("student", student);
//            request.getRequestDispatcher("student-form.jsp").forward(request, response);
//        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int rollNo =Integer.parseInt(request.getParameter("rollNo"));
            String fullName = request.getParameter("name");
            String className = request.getParameter("class");
            String bstring =  request.getParameter("date");
            String add = request.getParameter("address");
            String enroll = request.getParameter("enroll");
            
            // ... (Retrieve other parameters)

            Session session = FactoryProvider.getFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Student student = new Student(rollNo,fullName,className,bstring,add,enroll);
           

            session.save(student);
            transaction.commit();
            session.close();
            
            request.setAttribute("responseMessage", HttpServletResponse.SC_CREATED);


	        request.getRequestDispatcher("response.jsp").forward(request, response);

           // response.sendRedirect("StudentServlet?rollNo=" + rollNo);
        }
    }

