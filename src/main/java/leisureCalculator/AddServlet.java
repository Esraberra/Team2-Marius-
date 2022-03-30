package leisureCalculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/index.jsp")
public class AddServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

//        PrintWriter writer = response.getWriter();
//        //response.setContentType("text/html");
//        String type = request.getParameter("type");
//        String weather = request.getParameter("weather");
//        String cost = request.getParameter("cost");
//
//        String calc = new LeisureCalculator(type, weather, cost).calculateLeisure();
//        //String calc2 = new LeisureCalculator("Sport", "Sonne", "12").calculateLeisure();
//        List list = new LinkedList();
//        if(calc.length()==0) {
//            list.add(calc);
//        }
//
//        request.setAttribute("results", list);
//        request.getRequestDispatcher("/dropdown-menu-form.jsp").forward(request, response);
        //System.out.println(calc);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException{



        //response.getWriter().append("Served at: ").append(request.getContextPath());

       //writer.println(type+ " " + weather + " " + cost);
//        //response.setContentType("index.jsp");
//        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
//        //requestDispatcher.include(request,response);
//
//
//
//        //request.setAttribute("type", type);
//        //request.setAttribute("weather", weather);
//        //request.setAttribute("cost", cost);
//        writer.println(type + " " + weather + " " + cost );
    }


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        String type = request.getParameter("type");
        String weather = request.getParameter("weather");
        String cost = request.getParameter("cost");



        String calc = new LeisureCalculator(type, weather, cost).calculateLeisure();
        //String calc2 = new LeisureCalculator("Sport", "Sonne", "12").calculateLeisure();

        //request.setAttribute("results", calc);
        //request.getRequestDispatcher("/dropdown-menu-form.jsp").forward(request, response);
        writer.println(calc);
        System.out.println(calc);








        //writer.println((type.length()));
        //writer.println(calc2);
        //writer.println(calc);
        //System.out.println(calc);
        //String type = request.getParameter("type");
        //String weather = request.getParameter("weather");

        //System.out.println(type);
        //System.out.println(weather);
        //String activity = new LeisureCalculator("", "", "haallo").calculateLeisure();
        //request.setAttribute("number", activity);
        //getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        //doGet(request,response);

//        response.setContentType("text/html");
//
//        String type = request.getParameter("type");
//        String weather = request.getParameter("weather");
//        String cost = request.getParameter("cost");
//
//
//        PrintWriter writer = response.getWriter();
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
//        requestDispatcher.include(request,response);
//
//        request.setAttribute("type", type);
//        request.setAttribute("weather", weather);
//        request.setAttribute("cost", cost);
//        writer.println(type + " " + weather + " " + cost );

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