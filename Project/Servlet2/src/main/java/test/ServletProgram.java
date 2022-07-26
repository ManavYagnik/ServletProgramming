package test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.Scanner;

@WebServlet("/p")

public class ServletProgram extends HttpServlet {

	public static String FileRead() throws IOException {

		FileReader myFile = new FileReader("D:\\Study\\Selfstudy\\DSAandCoding\\syntaxpractice\\java\\data.txt");

		BufferedReader reader = new BufferedReader(myFile);
		String key = "";
		String line = reader.readLine();
		while (line != null) {
			key += line;
			line = reader.readLine();
		}
		return key;
	}

	public void init() {
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		ServletProgram obj = new ServletProgram();
		String Data = obj.FileRead();

		pw.print(Data);

	}

	public void destroy() {
	}
}