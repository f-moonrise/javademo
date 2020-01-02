package com.controller;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/31 10:29
 */
public class HomeService implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("得到一个请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
