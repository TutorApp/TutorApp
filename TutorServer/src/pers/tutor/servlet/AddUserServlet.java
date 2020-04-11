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
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����11:05:01
    * ��˵��	����Ա����û���ʾ��
 */
@WebServlet("/AddUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Access-Control-Allow-Origin", "http://39.97.237.96:8081");
		String username = request.getParameter("username");//��ȡǰ�˲���
		String password = request.getParameter("password");//��ȡǰ�˲���
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
