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
import pers.tutor.service.DemandListService;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月1日 下午3:42:22
    * 类说明 查看需求列表
 */
@WebServlet("/DemandList")
public class DemandListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DemandListService demandListService = new DemandListService();

		List<DemandEntity> list = demandListService.demandList();
		
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
