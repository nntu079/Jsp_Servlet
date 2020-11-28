package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;



@WebFilter(urlPatterns= {"/servlet1"})
public class Logger0 implements Filter{
	
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void doFilter(ServletRequest req,ServletResponse res, FilterChain mid)
		throws IOException, ServletException{
		//Xử lý các request đến
		System.out.println("Filter 3");
		
		//Cho phép đến filter tiếp theo
		mid.doFilter(req, res);
		
		
	}
	
	@Override
	public void init(FilterConfig filcon)
		throws ServletException{
		
	}
}
