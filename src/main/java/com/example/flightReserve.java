package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class flightReserve extends HttpServlet {
    private boolean[] seats = {false, false, false, false, false, false, false, false, false, false};
    private int ec = 5;
    private int fc = 0;
    private boolean flag = true;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST requests (e.g., form submissions)

        // Retrieve the user's choice from the form
        String choice = request.getParameter("seatChoice");

        // Process the choice
        if (flag) {
            if ("firstClass".equals(choice)) {
                bookFirstClassSeat(response);
            } else if ("economyClass".equals(choice)) {
                bookEconomyClassSeat(response);
            }
        } else {
            // Plane is full, handle accordingly
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("The Plane is now full");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests (e.g., displaying the form)

        // Generate an HTML form for seat selection
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (flag) {
            out.println("<html><body>");
            out.println("<form method='post'>");
            out.println("Please select a seat class:<br>");
            out.println("<input type='radio' name='seatChoice' value='firstClass'> First Class<br>");
            out.println("<input type='radio' name='seatChoice' value='economyClass'> Economy Class<br>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body></html>");
        } else {
            out.println("The Plane is now full");
        }
    }

    private void bookFirstClassSeat(HttpServletResponse response) throws IOException {
        if (fc < 5) {
            seats[fc] = true;
            fc++;
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("First Class. Seat #" + fc);
        } else {
            response.sendRedirect("index.jsp"); // Redirect back to the form
        }
    }

    private void bookEconomyClassSeat(HttpServletResponse response) throws IOException {
        if (ec < 10) {
            seats[ec] = true;
            ec++;
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Economy Class. Seat #" + ec);
        } else {
            response.sendRedirect("index.jsp"); // Redirect back to the form
        }
    }
}
