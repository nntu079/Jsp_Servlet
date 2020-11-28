package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//anotation ky hieu voi chu @
@WebServlet(urlPatterns= {"/xin-chao","/hello"})
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		
		PrintWriter printwriter =res.getWriter();
		
		printwriter.println("Xin chao cac ban <br>");
		
		Cookie[] cookies=req.getCookies();
		
		for (Cookie c:cookies) {
			printwriter.println(c.getName()+ " : "+c.getValue()+"<br>");
		}
				
		printwriter.close();
	}
}
