package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldController
 */
@WebServlet("/HelloWorld")
public class HelloWorldController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	//private String greetMsg;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorldController() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//greetMsg = "Hello ";
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		//if(request.getHeader("TOKEN") !=null){
			String userName = (String) request.getParameter("name");
			String greetMsg = (String) request.getParameter("greet");

			response.setContentType("text/html");

			response.getWriter().append("<h1>"+greetMsg+" "+userName+"!,</h1>");
			//response.getWriter().append("")
		//}else{
		//	response.setContentType("text/html");

		//	response.getWriter().append("<h1>Please login agian to continue.</h1>");

		//}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getHeader("Host"));

		doGet(request, response);



	}

}
