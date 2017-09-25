package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloServlet
 */
@WebServlet(description = "첫번째 서블릿", urlPatterns = { "/hello" })
public class helloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public helloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	//입력데이터 처리
	request.setCharacterEncoding("utf-8");	
		
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	System.out.printf("id : %s, name : %s\n", id, name);
	//출력데이터 content type 설정
	response.setContentType("text.html; charset= utf-8");
	//response.setCharacterEncoding("utf-8");
	PrintWriter out = response.getWriter();
	
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Servlet Test</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>Hello, SerVlet</h1>");
	out.println("<h1>안녕, 서블릿</h1>");
	out.println("<h2>id : "+id + ",name : "+ name+ "</h2>");
	out.println("</body>");
	out.println("</html>");
	
	out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost() 호출됨");
		doGet(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	System.out.println("init 호출");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 호출");
		super.service(req, resp);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	//메모리에서 해제 호출됨
		//서버를 중지시키거나, 소스가 변경된 경우
		System.out.println("destroy() 호출111");
	}

}
