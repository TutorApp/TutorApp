package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.service.TeacherLoginService;


/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��20�� ����2:07:19
    * ���ܽ�ʦ��¼����
 */

@WebServlet("/TeacherLogin")
public class TeacherLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");//��ȡǰ�˲���
		String password = request.getParameter("password");//��ȡǰ�˲���
		TeacherLoginService teacherLogin_service = new TeacherLoginService();
		PrintWriter out = response.getWriter();
		if(teacherLogin_service.login(username,password) == 0) {
			out.write("successful");
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
