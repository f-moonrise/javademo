package com.demotest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/2 15:49
 */
@WebServlet(name = "BServlet", value = "/b")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        Object key = sc.getAttribute("key");
        System.out.println(key);
        Object money = sc.getAttribute("money");
        System.out.println(money);
        Object happy = sc.getAttribute("happy");
        System.out.println(happy);

    }
}
