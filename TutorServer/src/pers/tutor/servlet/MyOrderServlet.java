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

import pers.tutor.entity.OrderEntity;
import pers.tutor.service.MyOrderService;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月2日 下午3:33:31
    * 类说明   	查看订单表示层
 */
@WebServlet("/MyOrder")
public class MyOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		
		MyOrderService myOrderService = new MyOrderService();
		int id = myOrderService.getUserId(username);
		List<OrderEntity> orderList = myOrderService.getMyOrder(id);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(orderList.size() != 0) {
			String jsonstr = JSONObject.toJSONString(orderList);
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
