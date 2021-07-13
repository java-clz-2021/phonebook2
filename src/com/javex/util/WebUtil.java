package com.javex.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebUtil {

	//메소드-일반
	//forword
	public static void forword( HttpServletRequest request, 
								HttpServletResponse response,
								String path) throws ServletException, IOException {
		
		RequestDispatcher rd =request.getRequestDispatcher(path);
		rd.forward(request, response);
		
	}
	
	
	
	//redirect
	public static void redirect(	HttpServletRequest request, 
									HttpServletResponse response,
									String url) throws IOException {
		
		response.sendRedirect(url);
		
		
	}
	
	
	
}
