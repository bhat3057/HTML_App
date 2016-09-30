import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FormSrv extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		
		//read the form data 
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String add=req.getParameter("add");
		String qlfy=req.getParameter("qlfy");
		String phno=req.getParameter("phno");
		String gen=req.getParameter("gn");
		String crs[]=req.getParameterValues("crs");
		String hb[]=req.getParameterValues("hb");

		pw.print("<body bgcolor=skyblue><table align=center bgcolor=gray><B>");
		if(gen.equals("male"))
		{
			if(age<=5)
			{
				pw.print("<tr><th align=center>"+name +" You are baby boy</th><tr>");
			}
			else if(age<=11)
			{
				pw.print("<tr><th align=center>"+name +" You are boy</th><tr>");
			}
			else if(age<=19)
			{
				pw.print("<tr><th align=center>"+name +" You are Teenager</th><tr>");
			}
			else if(age<=35)
			{
				pw.print("<tr><th align=center>"+name +" You are Young Man</th><tr>");
			}
			else if(age<=50)
			{
				pw.print("<tr><th align=center>"+name +" You are Middle aged Man</th><tr>");

			}
			else
			{
				pw.print("<tr><th align=center>"+name +" You are old Man</th><tr>");
			}
		}
		else
		{
			if(age<=5)
			{
			
				pw.print("<tr><th align=center>"+name +" You are baby Girl</th><tr>");
			}
			else if(age<=11)
			{
				pw.print("<tr><th align=center>"+name +" You are Girl</th><tr>");
			}
			else if(age<=19)
			{
				pw.print("<tr><th align=center>"+name +" You are Teenager</th><tr>");
			}
			else if(age<=35)
			{
				pw.print("<tr><th align=center>"+name +" You are Young Woman</th><tr>");
			}
			else if(age<=50)
			{
				pw.print("<tr><th align=center>"+name +" You are Middle aged WoMan</th><tr>");

			}
			else
			{
				pw.print("<tr><th align=center>"+name +" You are old WoMan</th><tr>");
			}
		}


		//display data
		pw.print("<br><tr colspan=2><th> Your Name is </th><th>"+name+"</th>");
		pw.print("<br><tr colspan=2><th> Your Age is </th><th>"+age+"</th>");
		pw.print("<br><tr colspan=2><th> Your Address is </th><th>"+add+"</th>");
		pw.print("<br><tr colspan=2><th> Your Gender is </th><th>"+gen+"</th>");
		pw.print("<br><tr colspan=2><th> Your Context is </th><th>"+phno+"</th>");
		pw.print("<br><tr colspan=2><th> Your selected cources are </th><th>");
		if(crs!=null)
		{
			for (int i=0;i<crs.length ;i++ )
			{
			pw.print(crs[i]+"....");
			}
			pw.print("</th>");
		}
		pw.print("<br><tr colspan=2><th> Your Hobbies are </th><th>");
		if(hb!=null)
		{
			for (int i=0;i<hb.length ;i++ )
			{
			pw.print(hb[i]+"....");
			}
		pw.print("</th>");
		}
		pw.print("</table>");
	
	}
	
}
