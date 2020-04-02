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
import pers.tutor.service.ReleaseDemandService;

/**
 * Servlet implementation class ReleaseOrderServlet
 */
/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年3月21日 下午5:07:34
    * 类说明	教师用户发布教学信息表示层
 */
@WebServlet("/ReleaseDemand")
public class ReleaseDemandServlet extends HttpServlet {
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
		
		ReleaseDemandService releaseDemandService = new ReleaseDemandService();
		int teacher_id = releaseDemandService.getTeacherId(json.getString("username"));
		PrintWriter out = response.getWriter();
		if(teacher_id != -1) {
		
			DemandEntity demandEntity = new DemandEntity();
			demandEntity.setGrade(json.getString("grade"));
			demandEntity.setSubject(json.getString("subject"));
			demandEntity.setDate(json.getString("date"));
			demandEntity.setStart_time(json.getString("start_time"));
			demandEntity.setEnd_time(json.getString("end_time"));
			demandEntity.setSalary(Integer.parseInt(json.getString("salary")));
			demandEntity.setTeacher_address(json.getString("teacher_address"));
			demandEntity.setName(json.getString("name"));	
			demandEntity.setTeacher_phone(json.getString("teacher_phone"));
			demandEntity.setOther(json.getString("other"));
			demandEntity.setTeacher_id(teacher_id);
	
			int result = releaseDemandService.release(demandEntity);
			if(result == 0) {
				out.write("successful");
			}else {
				out.write("failed");
			}
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
