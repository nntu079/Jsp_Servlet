package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotation ky hieu voi chu @
@WebServlet(urlPatterns= {"/servlet1"})
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
	
		
		PrintWriter printWriter =res.getWriter();
		
		printWriter.println("Hello");
		
		Cookie cookie = new Cookie("Full_Name","Nguyen Ngoc Tu");
		cookie.setMaxAge(10);
		res.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("Birth_Day","1994");
		cookie2.setMaxAge(10);
		res.addCookie(cookie2);
		
		
		
	}
	
	
}