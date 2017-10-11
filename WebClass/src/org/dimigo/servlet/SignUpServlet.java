//package org.dimigo.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.dimigo.vo.UserVO;
//
///**
// * Servlet implementation class SignUp
// */
//@WebServlet("/signup")
//public class SignUpServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	  /**
//     * @see HttpServlet#HttpServlet()
//     */
//	
///**
// * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
// */
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
//		rd.forward(request, response);
//}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
//		String name = request.getParameter("name");
//		String nickname = request.getParameter("nickname");
//
//		
//		
//		System.out.printf("id : %s, pwd : %s, name : %s, nickname : %s\n", id, pwd, name, nickname);
//
//		response.setContentType("application/json;charset=utf-8");
//		PrintWriter out = response.getWriter();
//
//		boolean result =false;
//
//		if (result) {
//			// 세션에 사용자 정보를 생성해서 담기
//			HttpSession session = request.getSession();
//
//			UserVO user = new UserVO();
//			user.setId(id);
//			user.setName("홍길동");
//			user.setNickname("의적");
//
//			session.setAttribute("user", user);
//
//			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
//			rd.forward(request, response);
//		} else {
//			request.setAttribute("id", id);
//			request.setAttribute("pwd", pwd);
//			request.setAttribute("name", name);
//			request.setAttribute("nickname", nickname);
//			request.setAttribute("msg", "error");
//			RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
//			rd.forward(request, response);
//		}
//
//	}
//
//}
package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public SignUpServlet() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
      rd.forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      
      request.setCharacterEncoding("utf-8");
      String email = request.getParameter("email");
      String pwd = request.getParameter("pwd");
      String name = request.getParameter("name");
      String nickName = request.getParameter("nickName");
      System.out.printf("email : %s, pwd: %s, name : %s, nickName : %s\n", email, pwd, name, nickName);
      
      Boolean result = false;
      
      response.setContentType("application/json;charset=utf-8");
      PrintWriter out = response.getWriter();
      
      Gson gson = new Gson();
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("email", email);
      map.put("pwd", pwd);
      map.put("name", name);
      map.put("nickName", nickName);
      map.put("result", result);
      
      System.out.println(gson.toJson(map));
      out.write(gson.toJson(map));
   }

}