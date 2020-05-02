package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.entity.UserEntity;
import pers.tutor.service.GetInformationService;
import pers.tutor.service.impl.GetInformationServiceImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月4日 下午11:03:40
    * 类说明	获取个人信息请求和响应处理
 */
@WebServlet("/GetInformation")
public class GetInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//获取前端参数
		GetInformationService getInformation = new GetInformationServiceImpl();
		response.setCharacterEncoding("utf-8");
		List<String> list = new ArrayList<>();
		List<EvaluateEntity> mylist = getInformation.getMyEvaluation(username);
		List<EvaluateEntity> otherlist = getInformation.getOtherEvaluation(username);
		UserEntity userEntity = getInformation.getPersonal(username);
		
		if(userEntity != null) {
			String jsonstr = JSONObject.toJSONString(userEntity);
			list.add(jsonstr);
		}
		
		String json = null;
		if(mylist.size() != 0) {
			String start = "{\"mydata\":";
			json = JSON.toJSONString(mylist);
			json = start + json;
			
		}

		if(mylist.size() != 0) {
			String start = ",\"otherdata\":";
			String end = "}";
			String json1 = JSON.toJSONString(otherlist);
			json += (start + json1 + end);
			list.add(json);
		}
		
		PrintWriter out = response.getWriter();

		out.write(list.toString());
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ServletInputStream in = request.getInputStream();
//		BufferedReader reader = null;
//		StringBuffer sb = new StringBuffer();
//		String line = "";
//		reader = new BufferedReader(new InputStreamReader(in));
//		while((line = reader.readLine()) != null) {
//			sb.append(line);
//			System.out.println(sb);
//			System.out.print("POST");
//		}
		doGet(request,response);
	}

}
