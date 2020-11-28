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

@WebServlet(urlPatterns = { "/error" })
public class HandleError extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter printwriter = res.getWriter();
		printwriter.println("Khong tim thay");

		printwriter.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		PrintWriter printwriter = res.getWriter();
		printwriter.println("Khong tim thay");

		printwriter.close();

	}

}
