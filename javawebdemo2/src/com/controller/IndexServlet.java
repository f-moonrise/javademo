package com.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 15:37
 */
//@WebServlet(name = "IndexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//模块一
//        String s = "fengsheng";
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (s.equals(username)){
//            response.getWriter().write("ok");
//        }else {
//            response.getWriter().write("no");
//        }

//模块二
        ServletConfig config = getServletConfig();

        String servletName = config.getServletName();
        System.out.println("servletName=" + servletName);

        String address = config.getInitParameter("address");
        System.out.println("address=" + address);

        Enumeration<String> names = config.getInitParameterNames();

        while(names.hasMoreElements()){
            String key = (String)names.nextElement();
            String value = config.getInitParameter(key);
            System.out.println("key==" + key + " value=" + value);
        }
        System.out.println("get");
     }
}
