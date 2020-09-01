import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SrvColl")
public class SrvColl extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String playerNames=new String();

String playerNames1="rohit,rahul,virat,dk,hardik,kedar";


HttpSession session= request.getSession();

session.setAttribute("playerNames", playerNames1);

RequestDispatcher rd= request.getRequestDispatcher("Jstldemo.jsp");
rd.forward(request, response);

}


}