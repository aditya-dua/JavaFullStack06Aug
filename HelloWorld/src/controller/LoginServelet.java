package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBConnection;
import db.DbUtility;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/login")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		response.getWriter().append("<h1>Sorry, get is not a supported type.</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userName = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");

		// I have to perform login operation..
		ResultSet rs= DbUtility.executeQuery(DBConnection.getDBInstance(), "select * from user_tab where userName = '"+userName+"';");
		
		try {
			//while(rs.next()){
			rs.next();
				String userPassword= rs.getString(3);
				
				if(userPassword.equals(password)){
					response.setContentType("text/html");

					response.getWriter().append("<h1> Hello "+rs.getString(1)+" "+userName+"!,</h1>");
				}else{
					response.setContentType("text/html");

					response.getWriter().append("<h1> Your login creds didn't work, Seems you are FIREDDD!</h1>");
	
				}
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//response.setContentType("text/html");

		//response.getWriter().append("<h1>"+greetMsg+" "+userName+"!,</h1>");

	}

}
