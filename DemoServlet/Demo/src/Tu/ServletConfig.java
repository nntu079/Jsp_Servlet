package Tu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@WebServlet(urlPatterns= {"/test-config"}, initParams= {
		@WebInitParam(name="Tu",value="dep trai")
})
*/

public class ServletConfig extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		String deptrai= super.getServletConfig().getInitParameter("Tu");
		String Diem=super.getServletConfig().getInitParameter("Diem");
		res.setContentType("text/plain");//tra ve dang text khong phai html
		
		PrintWriter printWriter = res.getWriter();
		
		printWriter.println("Tu thi "+deptrai);
		printWriter.println("Tu thi co diem so "+Diem);
		
		printWriter.close();
	}
}
