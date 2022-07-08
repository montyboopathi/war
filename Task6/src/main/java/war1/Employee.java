package war1;

import java.io.IOException;
import java.io.PrintWriter;

import com.kmbtask6.DisplayData;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.setContentType("application/json");
	int Id = Integer.parseInt(request.getParameter("Id"));
	PrintWriter prw = response.getWriter();
prw.println(DisplayData.display(Id));

}}
