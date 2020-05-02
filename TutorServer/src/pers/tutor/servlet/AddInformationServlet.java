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

import pers.tutor.entity.UserEntity;
import pers.tutor.service.AddInformationService;
import pers.tutor.service.impl.AddInformationServiceImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午10:25:42
    * 类说明	用户维护个人信息请求和响应处理
 */
@WebServlet("/AddInformation")
public class AddInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
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
		
		//装载数据
		UserEntity studentEntity = new UserEntity();
		studentEntity.setAge(json.getIntValue("age"));
		studentEntity.setSex(json.getIntValue("sex"));
		studentEntity.setPhone(json.getString("phone"));
		studentEntity.setUsername(json.getString("username"));
		studentEntity.setAddress(json.getString("address"));
		studentEntity.setNet_name(json.getString("net_name"));
		
		AddInformationService addInformationService = new AddInformationServiceImpl();
		int result = addInformationService.addInformation(studentEntity);
		PrintWriter out = response.getWriter();
		if(result == 0) {
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
