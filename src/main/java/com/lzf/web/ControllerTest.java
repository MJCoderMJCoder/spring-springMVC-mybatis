/**
 * 
 */
package com.lzf.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzf.entity.SysConfig;
import com.lzf.service.IServiceTest;

/**
 * 控制层
 * 
 * @author MJCoder
 *
 */
@Controller
@RequestMapping("controller") // url:/模块/资源/{id}/细分 /seckill/list
public class ControllerTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// 注入Service
	@Autowired
	private IServiceTest serviceTest;

	/**
	 * 
	 */
	public ControllerTest() {
		// TODO Auto-generated constructor stub
	}

	// @RequestMapping(value = "sysConfigs", method = RequestMethod.GET)
	@RequestMapping(value = "sysConfigs")
	// @ResponseBody
	private String selectSysConfig(HttpServletRequest request) {
		List<SysConfig> sysConfigs = serviceTest.selectSysConfig();
		System.out.println(request.getParameter("nickname"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getAttribute("nickname"));
		System.out.println(request.getAttribute("password"));
		System.out.println(sysConfigs.toString());
		if (sysConfigs == null) {
			request.setAttribute("nickname", "昵称得对");
			request.setAttribute("password", "密码也得对");
			request.setAttribute("errorMsg", "这样才行。");
			return "index";
		} else {
			request.setAttribute("sysConfigs", sysConfigs.toString());
			return "controller";
		}
		// list.jsp + model = ModelAndView
		// return "controller";// WEB-INF/jsp/"list".jsp
	}
}
