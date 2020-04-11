package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetUserService;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��5�� ����5:32:54
    * ��˵��	����Ա��ȡ�û���Ϣ��ʾ��
 */
@WebServlet("/GetUser")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Access-Control-Allow-Origin", "http://39.97.237.96:8081");
		int type = Integer.parseInt(request.getParameter("type"));

		GetUserService getUserService = new GetUserService();
		List<UserEntity> list = getUserService.getUser(type);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(list.size() != 0) {
			String jsonstr = JSONObject.toJSONString(list);
			out.write(jsonstr);
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