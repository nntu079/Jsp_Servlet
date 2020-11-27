package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException{
		System.out.println("Start Servelet");
	}
	
	@Override
	public void destroy() {
		System.out.println("End Servelet");
	}
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		super.service(req,res);
		
		System.out.println("Method: "+req.getMethod());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
			
		res.setContentType("text/html");
		
		PrintWriter writer = res.getWriter();
		
		writer.println("<h1>Xin chào servlet - Trung tâm java</h1>");
		
		writer.close();
	}
}
