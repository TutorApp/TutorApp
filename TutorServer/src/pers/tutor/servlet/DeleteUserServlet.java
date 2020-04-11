package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.service.DeleteUserService;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月6日 下午9:20:17
    * 类说明	管理员删除用户表示层
 */
@WebServlet("/DeleteUser")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setHeader("Access-Control-Allow-Origin", "http://39.97.237.96:8081");
		int id = Integer.parseInt(request.getParameter("id"));
		
//		System.out.println(username+" "+password+" "+sex+" "+age+" "+type+" "+phone);
		DeleteUserService deleteUserService = new DeleteUserService();
//		UserEntity userEntity = new UserEntity();
//		userEntity.setUsername(username);
//		userEntity.setPassword(password);
//		userEntity.setAge(age);
//		userEntity.setSex(sex);
//		userEntity.setPhone(phone);
//		userEntity.setType(type);
		
		PrintWriter out = response.getWriter();
		int result = deleteUserService.deleteUser(id);
		if(result == 1) {
			out.write("0");
		}else {
			out.write("-1");
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
