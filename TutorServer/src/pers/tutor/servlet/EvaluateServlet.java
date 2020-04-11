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

import pers.tutor.entity.EvaluateEntity;
import pers.tutor.service.EvaluateService;

/**
 * Servlet implementation class ReleaseOrderServlet
 */
/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��21�� ����5:07:34
    * ��˵��	���۱�ʾ��
 */
@WebServlet("/Evaluate")
public class EvaluateServlet extends HttpServlet {
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
		
		EvaluateService evaluateService = new EvaluateService();
		EvaluateEntity evaluateEntity = new EvaluateEntity();
		
		evaluateEntity.setEvaluation(json.getString("evaluation"));
		evaluateEntity.setUser_id(Integer.parseInt(json.getString("user_id")));
		evaluateEntity.setWho_id(Integer.parseInt(json.getString("who_id")));
		
		int result = evaluateService.evaluate(evaluateEntity);
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
