package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.entity.TeacherEntity;
import pers.tutor.service.TeacherRegisterService;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月20日 下午7:22:07
    * 类说明
 */
@WebServlet("/TeacherRegister")
public class TeacherRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//获取前端参数
		String password = request.getParameter("password");//获取前端参数
		
		//装载数据
		TeacherEntity teacherEntity = new TeacherEntity();
		TeacherRegisterService teacherRegister_service = new TeacherRegisterService();
		teacherEntity.setUsername(username);
		teacherEntity.setPassword(password);
		int result = teacherRegister_service.register(teacherEntity);
		
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
