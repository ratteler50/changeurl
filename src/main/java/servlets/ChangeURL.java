package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation to change URL
 */
public class ChangeURL extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangeURL()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String oldURL = request.getParameter("URL");
		String regex = request.getParameter("REGEX");
		String replacement = request.getParameter("REPLACE");
		String allString = request.getParameter("ALL");
		boolean all = Boolean.parseBoolean(allString);
		String newURL;
		if(all)
			newURL = oldURL.replaceAll(regex, replacement);
		else
			newURL = oldURL.replaceFirst(regex, replacement);

		System.out.println(newURL);
		response.sendRedirect(newURL);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String oldURL = request.getParameter("URL");
		String regex = request.getParameter("REGEX");
		String replacement = request.getParameter("REPLACE");
		String allString = request.getParameter("ALL");
		boolean all = Boolean.parseBoolean(allString);
		String newURL;
		if(all)
			newURL = oldURL.replaceAll(regex, replacement);
		else
			newURL = oldURL.replaceFirst(regex, replacement);

		RequestDispatcher dispatch = request.getRequestDispatcher(newURL);
		dispatch.forward(request, response);
	}

}
