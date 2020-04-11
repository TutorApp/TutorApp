package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.entity.UserEntity;
import pers.tutor.service.AlterUserService;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��7�� ����3:30:06
    * ��˵��	����Ա�޸��û���ʾ��
 */
@WebServlet("/AlterUser")
public class AlterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Access-Control-Allow-Origin", "http://39.97.237.96:8081");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		String username = request.getParameter("username");//��ȡǰ�˲���
		String net_name = request.getParameter("net_name");//��ȡǰ�˲���
		int id = Integer.parseInt(request.getParameter("id"));
		int age = Integer.parseInt(request.getParameter("age"));
		int sex = Integer.parseInt(request.getParameter("sex"));
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		//װ������
		UserEntity studentEntity = new UserEntity();
		studentEntity.setId(id);
		studentEntity.setAge(age);
		studentEntity.setSex(sex);
		studentEntity.setPhone(phone);
		studentEntity.setUsername(username);
		studentEntity.setAddress(address);
		studentEntity.setNet_name(net_name);
		
		AlterUserService alterUserService = new AlterUserService();
		int result = alterUserService.alterUser(studentEntity);
		PrintWriter out = response.getWriter();
		if(result == 0) {
			out.write("0");
		}else {
			out.write("-1");
		}
		
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
