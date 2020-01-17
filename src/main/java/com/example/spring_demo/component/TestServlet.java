package com.example.spring_demo.component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestServlet
 *
 * @author lizengcai
 * @date 2019/12/26
 */
@WebServlet(name = "userServlet",urlPatterns = "/test/customs")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("userServlet");
        super.doGet(req, resp);
    }
}
