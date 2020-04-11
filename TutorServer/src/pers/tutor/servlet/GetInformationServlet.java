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

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��4�� ����11:03:40
    * ��˵��	��ȡ������Ϣ��ʾ��
 */
@WebServlet("/GetInformation")
public class GetInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//��ȡǰ�˲���
		GetInformationService getInformation = new GetInformationService();
		response.setCharacterEncoding("utf-8");
		List<String> list = new ArrayList<>();
		List<EvaluateEntity> list1 = getInformation.getEvaluation(username);
		UserEntity userEntity = getInformation.getPersonal(username);
		
		if(userEntity != null) {
			String jsonstr = JSONObject.toJSONString(userEntity);
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
