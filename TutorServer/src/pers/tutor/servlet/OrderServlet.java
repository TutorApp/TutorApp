package pers.tutor.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import pers.tutor.entity.DemandEntity;
import pers.tutor.model.OrderModel;
import pers.tutor.service.OrderService;


/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月21日 下午5:07:34
    * 类说明	教师用户发布教学信息表示层
 */

@WebServlet("/Order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StringBuffer jb = new StringBuffer();
		String line = null;
		try
		{
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		JSONObject json = new JSONObject();
		json = JSONObject.parseObject(jb.toString());
		
		OrderService orderService = new OrderService();
		OrderModel orderModel = new OrderModel();
		DemandEntity demandEntity = new DemandEntity();
		demandEntity = orderService.demandInfo(json.getIntValue("id"));
		PrintWriter out = response.getWriter();
		int student_id = orderService.getStudentId(json.getString("username"));
		if(demandEntity.getState() == 2 || student_id == -1) {
			out.write("error");
		}else {
			orderModel.setId(json.getInteger("id"));
			orderModel.setStudent_id(student_id);
			orderModel.setStudent_address(json.getString("student_address"));
			orderModel.setStudent_phone(json.getString("student_phone"));
			orderModel.setStudent_name(json.getString("student_name"));
			
			int result = orderService.order(orderModel,demandEntity);
			
			if(result == 0) {
				out.write("successful");
			}else {
				out.write("failed");
			}
		}
		
		out.flush();
		out.close();

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
