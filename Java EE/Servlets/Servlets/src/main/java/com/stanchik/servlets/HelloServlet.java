package com.stanchik.servlets;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>Hello from HelloServlet</h2>");
        }
        finally {
            writer.close();
        }
    }

}