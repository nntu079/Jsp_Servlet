package Tu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//anotation ky hieu voi chu @
@WebServlet(urlPatterns= {"/refresh"})
public class AutoRefresh extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		
		res.setHeader("Refresh", "1");
		
		PrintWriter printwriter =res.getWriter();
		
		printwriter.println("Thoi gian hien tai: "+new Date());
		
		printwriter.close();
	}
}
