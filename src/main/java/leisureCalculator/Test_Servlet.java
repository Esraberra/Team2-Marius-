package leisureCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class Test_Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String activityType = request.getParameter("type");
        String weather = request.getParameter("wetter");
        String cost = request.getParameter("kosten");


        System.out.println("Aktivitätsform: " + activityType);

        System.out.println("Wetter: " + weather);
        System.out.println("Kosten: " + cost);

        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Your username is: " + username + "<br/>";
//        htmlRespone += "Your password is: " + password + "</h2>";
//        htmlRespone += "</html>";

        // return response
       // writer.println(htmlRespone);

    }

}