package task3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpList
 */
public class HttpList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HttpList() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		if (request.getParameter("login").equals(config.getInitParameter("login"))
				& request.getParameter("password").equals(config.getInitParameter("password"))) {
			writer.println(
					"<h1> Альбом </h1>" +
					"<table class='table'>" +  
					"  <tr style='background-color: #ededed;'>" + 
					"    <th>№ п/п</th>" + 
					"    <th>Пісня</th>" + 
					"    <th>Тривалість</th>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>1</td>" + 
					"    <td>Sgt. Pepper's Lonely Hearts Club Band</td>" + 
					"    <td>2:42</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>2</td>" + 
					"    <td>With a Little Help From My Friends</td>" + 
					"    <td>2:43</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>3</td>" + 
					"    <td>Lucy in the Sky With Diamonds</td>" + 
					"    <td>2:44</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>4</td>" + 
					"    <td>Getting Better</td>" + 
					"    <td>2:45</td>" + 
					"  </tr>" +
					"  <tr>" + 
					"    <td>5</td>" + 
					"    <td>Fixing a Hole</td>" + 
					"    <td>2:46</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>6</td>" + 
					"    <td>She's Leaving Home</td>" + 
					"    <td>2:47</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>7</td>" + 
					"    <td>Being for the Benefit of Mr. Kite!</td>" + 
					"    <td>2:48</td>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>8</td>" + 
					"    <td>Within You Without You</td>" + 
					"    <td>2:49</td>" + 
					"  <tr>" + 
					"    <td>9</td>" + 
					"    <td>When І'm Sixty-Four</td>" + 
					"    <td>2:50</td>" + 
					"  </tr>" + 
					"  </tr>" + 
					"  <tr>" + 
					"    <td>10</td>" + 
					"    <td>Lovely Rita</td>" + 
					"    <td>2:51</td>" + 
					"  </tr>" + 
					"</table>");
		} else {
			writer.println("<a href='index.html'>Incorrect login or password. Try one more</a>");
		
		}
		writer.close();
	}
}
