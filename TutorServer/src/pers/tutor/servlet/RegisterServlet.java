package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.entity.UserEntity;
import pers.tutor.service.RegisterService;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����4:49:48
    * ����ѧ����¼����
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//��ȡǰ�˲���
		String password = request.getParameter("password");//��ȡǰ�˲���
		String  usertype = request.getParameter("type");//��ȡǰ�˲���
		int type = Integer.parseInt(usertype);
		
		//װ������
		UserEntity studentEntity = new UserEntity();
		RegisterService studentRegister_service = new RegisterService();
		studentEntity.setUsername(username);
		studentEntity.setPassword(password);
		studentEntity.setType(type);
		
		int result = studentRegister_service.register(studentEntity);
		PrintWriter out = response.getWriter();
		if(result == 0) {
			out.write("successful");
		}else if(result == 2){
			out.write("exist");
		}else {
			out.write("failed");
		}
		
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
