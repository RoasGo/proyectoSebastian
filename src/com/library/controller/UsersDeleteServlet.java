package com.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.library.service.AuthService;

/**
 * Servlet implementation class UsersDeleteServlet
 */
@WebServlet("/user-delete")
public class UsersDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersDeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		// la sentencia sql debe ser algo asi: delete from users where id = codigo;
		// Llamar al service (deleteUser) -> pasar un parametro(codigo de usuario)
		// Si se elimina correctamente. Refrescar la pagina.
		
        int rs=new AuthService().deleteUser(codigo);
        if (rs==0) {
			
		} 
      
        request.getRequestDispatcher("principal.jsp").forward(request, response);
         
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
}
