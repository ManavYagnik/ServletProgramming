package test;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.Scanner;
@WebServlet("/p")



public class ServletProgram extends HttpServlet {
	
	  public static String  FileRead() throws IOException{
	        System.out.println("Not Main Program is running");
	        File myFile=new File("D:\\Study\\Selfstudy\\DSAandCoding\\syntaxpractice\\java\\data2.txt");

	        Scanner myData = new Scanner(myFile);
	        String data =myData.nextLine();
	        while (myData.hasNextLine()){
	        	return data;

	        }
	        myData.close();
	        return data;
	        }
	
	
	
	
	public void init() {}
	
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
PrintWriter pw =res.getWriter();
res.setContentType("text/html");

ServletProgram obj = new ServletProgram();
String Data =obj.FileRead();




pw.println(""+ Data);

	
	}
public void destroy() {}
}