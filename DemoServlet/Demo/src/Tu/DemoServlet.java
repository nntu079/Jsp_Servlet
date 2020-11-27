package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		
		PrintWriter printwriter =res.getWriter();
		
		printwriter.println("<h2>Hello Servlet </h2>");
		printwriter.println("<p>Servlet rat la hay</p>");
		
		printwriter.close();
	}
}
