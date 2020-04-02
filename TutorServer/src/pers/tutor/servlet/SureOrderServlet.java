package pers.tutor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.tutor.service.SureOrderService;


/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��3��21�� ����5:07:34
    * ��˵��	��ʦ�û�ȷ�϶�����ʾ��
 */

@WebServlet("/SureOrder")
public class SureOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		
		SureOrderService sureOrderService = new SureOrderService();
		int result = sureOrderService.sureOrder(id);
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
