package com.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.beans.User;
import com.library.service.AuthService;

/**
 * Servlet implementation class AuthLoginServlet
 */
@WebServlet("/login")
public class AuthLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthLoginServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// VALIDACIONES PARA QUE EL EMAIL Y PASSWORD SEAN DATOS VALIDOS.
		
		User user = new AuthService().login(email, password);
		
		if (user != null) {
			System.out.println(user.getRolName());
			System.out.println(user.getEmail());
		}
		
		// REQUEST DISPATCHER PARA REDIRIGIR A LAS PAGINAS CORRESPONDIENTES
	}

}
