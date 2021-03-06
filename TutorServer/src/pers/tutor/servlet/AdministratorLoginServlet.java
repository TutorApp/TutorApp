package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.service.AdministratorLoginService;
import pers.tutor.service.impl.AdministratorLoginServcieImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午3:46:12
    * 类说明	管理员登录请求和响应处理
 */
@WebServlet("/AdministratorLogin")
public class AdministratorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//获取前端参数
		String password = request.getParameter("password");//获取前端参数
		System.out.println(username+password);
		AdministratorLoginService administratorLoginService = new AdministratorLoginServcieImpl();
		PrintWriter out = response.getWriter();
		if(administratorLoginService.administratorLogin(username,password) == 0) {
			out.write(username);
		}else {
			out.write("failed");
		}
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ServletInputStream in = request.getInputStream();
//		BufferedReader reader = null;
//		StringBuffer sb = new StringBuffer();
//		String line = "";
//		reader = new BufferedReader(new InputStreamReader(in));
//		while((line = reader.readLine()) != null) {
//			sb.append(line);
//			System.out.println(sb);
//			System.out.print("POST");
//		}
		doGet(request,response);
	}

}
