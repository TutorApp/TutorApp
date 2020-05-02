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
import pers.tutor.service.GetOtherInformationService;
import pers.tutor.service.impl.GetOtherInformationServiceImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月8日 下午1:42:40
    * 类说明	获取他人个人信息请求和响应处理
 */
@WebServlet("/GetOtherInformation")
public class GetOtherInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));//获取前端参数
		GetOtherInformationService getOtherInformation = new GetOtherInformationServiceImpl();
		response.setCharacterEncoding("utf-8");
		List<String> list = new ArrayList<>();
		List<EvaluateEntity> list1 = getOtherInformation.getEvaluation(id);
		UserEntity userEntity = getOtherInformation.getPersonal(id);
		String jsonstr = null;
		if(userEntity != null) {
			jsonstr = JSONObject.toJSONString(userEntity);
			list.add(jsonstr);
		}
		
		if(list1.size() != 0) {
			String start = "{data:";
			String end = "}";
			String json = JSON.toJSONString(list1);
			json = start + json + end;
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
