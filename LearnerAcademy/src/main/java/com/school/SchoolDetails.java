package com.school;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/SchoolDetails")
public class SchoolDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SchoolDetails() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			List<Student> list = session.createQuery("from Student").list();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			
			HttpSession newsession = request.getSession(false);
			String userName = null;
			
			if(newsession.getAttribute("username")!=null)
				userName = (String) newsession.getAttribute("username");
			
			if(userName==null) {
			
				out.println("No userid found!");
				
			} else {
				
				out.println("<br>USER : "+ userName + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + 
				"<a href='logout'>Logout of session</a><br>" );
				
				out.println("<br><br><b> Student Listing </b><br>");
				
				for(Student p:list) {
					out.println("STUDENT ID : " + String.valueOf(p.getSTUDENT_ID())+ "<br>" +
							"Name : " + p.getFirstname() + "&nbsp" + p.getLastname() + "<br>" );
							
					Set<Classroom> classroom = p.getClassroom();
					out.println("CLASSROOM : ");
					for(Classroom c: classroom) {
						out.print(c.getClassname() + "&nbsp;" + "<br>");
						
					}
					
					Set<Teacher> teacher = p.getTeacher();
					out.println("TEACHER : ");
					for(Teacher t: teacher) {
						out.print(t.getTeachername() + "&nbsp;" + "<br>");
					
					}				
					 
					Set<Subject> subject = p.getSubject();
					out.println("SUBJECT : ");
					for(Subject s: subject) {
						out.print(s.getSubjectname() + "&nbsp;" + "<br>");
					}	
					
					out.println("<hr>");
					
				}
			
			}
			
			session.close();
			
			
			out.println("</body></html>");
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
