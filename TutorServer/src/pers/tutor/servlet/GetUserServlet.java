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
import pers.tutor.service.impl.GetUserServiceImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月5日 下午5:32:54
    * 类说明	管理员获取用户信息请求和响应处理
 */
@WebServlet("/GetUser")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int type = Integer.parseInt(request.getParameter("type"));

		GetUserService getUserService = new GetUserServiceImpl();
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
