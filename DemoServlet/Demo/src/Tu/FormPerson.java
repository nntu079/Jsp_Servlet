package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotation ky hieu voi chu @
@WebServlet(urlPatterns= {"/form-person"})
public class FormPerson extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter printwriter =res.getWriter();
		
		printwriter.println("<form action='/Demo/test-request' method='post'>");
		printwriter.println("ten: <input type='text' name='name'>");
		printwriter.println("<br>");
		printwriter.println("<button type='submit' style='height:50px; width:50px'> </button>");
		printwriter.println("</form>");
	
		printwriter.close();
	}
}
