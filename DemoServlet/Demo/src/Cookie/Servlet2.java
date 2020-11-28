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
@WebServlet(urlPatterns= {"/servlet2"})
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		
		PrintWriter printWriter =res.getWriter();
		
		printWriter.println("Thong tin");
		
		Cookie[] cookies= req.getCookies();
		
		
		for(Cookie c: cookies) {
			printWriter.println(c.getName()+ " : " + c.getValue() + "<br>" )	;
		}
		
		printWriter.close();
		
	}	
}