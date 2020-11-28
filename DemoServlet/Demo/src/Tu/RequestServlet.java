package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotation ky hieu voi chu @
@WebServlet(urlPatterns= {"/test-request"})
public class RequestServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println(req.getMethod());
		
		System.out.println(req.getContentType());
		System.out.println(req.getContextPath());
		System.out.println(req.getServerName());
		System.out.println(req.getServletPath());
		System.out.println( req.getHeaderNames() );
		System.out.println(req.getParameter("name"));
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println(req.getMethod());
		System.out.println(req.getParameter("name"));
		
		Cookie cookie= new Cookie("name",req.getParameter("name"));
		cookie.setMaxAge(5);
		
		res.addCookie(cookie);
		
	}
	
}
