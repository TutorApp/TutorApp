package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddUserService;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午11:05:01
    * 类说明	管理员添加用户表示层
 */
@WebServlet("/AddUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Access-Control-Allow-Origin", "http://39.97.237.96:8081");
		String username = request.getParameter("username");//获取前端参数
		String password = request.getParameter("password");//获取前端参数
		int sex = Integer.parseInt(request.getParameter("sex"));
		int age = Integer.parseInt(request.getParameter("age"));
		int type = Integer.parseInt(request.getParameter("type"));
		String phone = request.getParameter("phone");
		
//		System.out.println(username+" "+password+" "+sex+" "+age+" "+type+" "+phone);
		AddUserService addUserService = new AddUserService();
		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(username);
		userEntity.setPassword(password);
		userEntity.setAge(age);
		userEntity.setSex(sex);
		userEntity.setPhone(phone);
		userEntity.setType(type);
		
		PrintWriter out = response.getWriter();
		int result = addUserService.addUser(userEntity);
		if(result == 1) {
			out.write("0");
		}else if(result == -1){
			out.write("1");
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
