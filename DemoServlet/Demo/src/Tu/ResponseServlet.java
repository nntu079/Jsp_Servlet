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
@WebServlet(urlPatterns= {"/test-response"})
public class ResponseServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/plain");//tra ve dang text khong phai html
		
		PrintWriter printWriter = res.getWriter();
		
		printWriter.println("<h1>Xin chao</h1>");
		
		res.addHeader("Tu", "Dep trai");
		res.sendError(200); //200 la noi dung tra ve thanh cong nho truyen luon ma code vi du 401 noi nguoi dung chua authentication
		
		printWriter.close();
	}
}
