package com.fin.proj.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.fin.proj.member.model.vo.Member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CheckLoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		Member loginUser = (Member)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			String url = request.getRequestURI();
			
			String msg = "로그인 후 이용하세요";
			
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write("<script>alert('"+ msg +"'); location.href='loginView.me';</script>");
			
			return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
