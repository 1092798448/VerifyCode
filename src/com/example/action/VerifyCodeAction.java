package com.example.action;

import java.awt.image.BufferedImage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.example.verifycode.VerifyCode;

public class VerifyCodeAction extends DispatchAction {

	public ActionForward verify(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.getImage();
		HttpSession session = request.getSession();
		session.setAttribute("verifyText", vc.getText());
		//保存图片
		VerifyCode.output(image, response.getOutputStream());
		System.out.println(vc.getText());
		return null;
	}

}
