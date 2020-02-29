package com.example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String vc = request.getParameter("verifycode");
		
		String verifyText = (String) request.getSession().getAttribute("verifyText");
		if(!("admin".equals(name) && "123".equals(pwd))) {
			request.setAttribute("errMsg", "用户名密码错误！");
			return mapping.findForward("index");
		}
		if(!verifyText.equalsIgnoreCase(vc)) {
			request.setAttribute("errMsg", "验证码错误！");
			return mapping.findForward("index");
		}
		request.setAttribute("name", name);
		return mapping.findForward("result");
	}	
}
