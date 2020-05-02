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

import pers.tutor.entity.DemandEntity;
import pers.tutor.service.MyReleaseService;
import pers.tutor.service.impl.MyReleaseServiceImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月7日 下午8:49:36
    * 类说明	教师用户查看已发布的教学信息请求和响应处理
 */
@WebServlet("/MyRelease")
public class MyReleaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		
		MyReleaseService myReleaseService = new MyReleaseServiceImpl();
		int id = myReleaseService.getUserId(username);
		List<DemandEntity> list = myReleaseService.getMyRelease(id);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		System.out.println(list.size());
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
