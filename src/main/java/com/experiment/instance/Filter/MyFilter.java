package com.experiment.instance.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * @author hanwen.dong
 * @date 2019/4/13 09:32
 * @Description auto
 */
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter 前...");
        filterChain.doFilter(request,response);
        System.out.println("doFilter 后 ...");

    }

    @Override
    public void destroy() {
        System.out.println("destory ...");
    }
}
