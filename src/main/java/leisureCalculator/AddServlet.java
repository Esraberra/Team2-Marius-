package leisureCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/add")
public class AddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException{


    }


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {


        //String activity = new LeisureCalculator("", "", "haallo").calculateLeisure();
        //request.setAttribute("number", activity);
        //getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        String type = request.getParameter("type");
        String weather = request.getParameter("weather");
        String cost = request.getParameter("cost");

        //String activity = new LeisureCalculator(type, weather, cost).calculateLeisure();
        //request.setAttribute("error", "dff");
        doGet(request,response);

        response.setContentType("text/html");
        String number = request.getParameter("number");

        PrintWriter writer = response.getWriter();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.include(request,response);

        request.setAttribute("number", number);
        writer.println(type + " " + weather + " " + cost );

        //writer.println("Number is "+ activity);
        //writer.flush();


        //String result = request.getParameter("checkboxActivity");
        //System.out.println("Hallo ich bin das Result: " + result);


        // read form fields
//        String activityType = request.getParameter("type");
//        String weather = request.getParameter("wetter");
//        String cost = request.getParameter("kosten");
//
//
//        System.out.println("Aktivitätsform: " + activityType);
//
//        System.out.println("Wetter: " + weather);
//        System.out.println("Kosten: " + cost);

        // do some processing here...

        // get response writer
        //PrintWriter writer = response.getWriter();

        // build HTML code
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Your username is: " + username + "<br/>";
//        htmlRespone += "Your password is: " + password + "</h2>";
//        htmlRespone += "</html>";

        // return response
       // writer.println(htmlRespone);

    }

}