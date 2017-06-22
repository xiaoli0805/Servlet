package com.situ.web.TimeServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.student.Entity.Student;
import com.situ.student.Service.IStudentService;
import com.situ.student.Service.Impl.StudentServiceImpl;

@SuppressWarnings("serial")
public class FindStudentServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//super.service(req, resp);
		//1.接收参数
		//2.业务处理
		IStudentService studentService = new StudentServiceImpl();
		List<Student> list = studentService.findAll();
		//3.输出响应，返回结果
		//乱码问题
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<table border='1' cellspacing='0' align='center'>");
		printWriter.println("    <tr>");
		printWriter.println("        <td>编号</td>");
		printWriter.println("        <td>姓名</td>");
		printWriter.println("        <td>年龄</td>");
		printWriter.println("        <td>性别</td>");
		printWriter.println("    </tr>");
		for (Student student : list) {
			printWriter.println("<tr>");
			printWriter.println("    <td>"+ student.getId()+"</td>");
			printWriter.println("    <td>"+ student.getName()+"</td>");
			printWriter.println("    <td>"+ student.getAge()+"</td>");
			printWriter.println("    <td>"+ student.getGender()+"</td>");
			printWriter.println("</tr>");
		}
		printWriter.println("</table>");
	}
}
