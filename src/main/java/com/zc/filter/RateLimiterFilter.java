package com.zc.filter;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 *   @创建人  zc
 *   @创建时间 2020/9/12 23:04
 *   @包名: com.zc.filter
 *   @描述：
 */
@Component
public class RateLimiterFilter extends OncePerRequestFilter {

    private RateLimiter rateLimiter = RateLimiter.create(1);

    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        ///greet/cc/cc
        String requestURI = httpServletRequest.getRequestURI();
        if (requestURI.equalsIgnoreCase("/Test")){
            if(rateLimiter.tryAcquire()){
                httpServletResponse.sendRedirect("http://baidu.com/");
            }else {
                httpServletResponse.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                httpServletResponse.getWriter().write("too many request!!!");
                httpServletResponse.getWriter().flush();
                return;
            }
        }else {
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }
    }
}
