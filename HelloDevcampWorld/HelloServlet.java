package HelloDevcampWorld;

package com.devcamp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "helloServlet", urlPatterns = "/api/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        String now = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
        resp.getWriter().write("Hello devcamper, now it is " + now + ".");
    }
}
