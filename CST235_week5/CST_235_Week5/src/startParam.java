


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class startParam
 */
@WebServlet(
		urlPatterns = { "/startParam" }, 
		initParams = { 
				@WebInitParam(name = "paramOne", value = "TimmyOne"), 
				@WebInitParam(name = "paramTwo", value = "SallyTwo"), 
				@WebInitParam(name = "paramThree", value = "BillyThree"),
				@WebInitParam(name = "paramFour", value = "FrankFour")
		})
public class startParam extends HttpServlet {
 
 protected void doGet(
   HttpServletRequest request, 
   HttpServletResponse response
   ) throws ServletException, IOException {
 
  response.setContentType("text/html");
 
  PrintWriter out = response.getWriter();
 
  try {
   out.println("<html>");
   out.println("<body>");
   out.println("<h2>Hello " + getServletConfig().getInitParameter("paramOne")  + "</h2>");
   out.println("<h2>Hello " + getServletConfig().getInitParameter("paramTwo")  + "</h2>");
   out.println("<h2>Hello " + getServletConfig().getInitParameter("paramThree")  + "</h2>");
   out.println("<h2>Hello " + getServletConfig().getInitParameter("paramFour")  + "</h2>");
   out.println("</body>");
   out.println("</html>");
  } finally {
   out.close();
  }
 
 }
 
}

