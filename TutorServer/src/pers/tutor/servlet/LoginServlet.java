package pers.tutor.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.service.LoginService;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午2:07:19
    * 接受登录请求
 */

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//获取前端参数
		String password = request.getParameter("password");//获取前端参数
		LoginService loginService = new LoginService();
		PrintWriter out = response.getWriter();
		if(loginService.login(username,password) == 0) {
			out.write("successful");
		}else {
			out.write("failed");
		}
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletInputStream in = request.getInputStream();
		BufferedReader reader = null;
		StringBuffer sb = new StringBuffer();
		String line = "";
		reader = new BufferedReader(new InputStreamReader(in));
		while((line = reader.readLine()) != null) {
			sb.append(line);
			System.out.println(sb);
			System.out.print("POST");
		}
	}

}
