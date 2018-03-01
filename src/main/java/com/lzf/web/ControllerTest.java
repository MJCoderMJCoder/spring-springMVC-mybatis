/**
 * 
 */
package com.lzf.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "sysConfigs", method = RequestMethod.GET)
	private String selectSysConfig(Model model) {
		List<SysConfig> sysConfigs = serviceTest.selectSysConfig();
		System.out.println(sysConfigs.toString());
		model.addAttribute("sysConfigs", sysConfigs);
		// list.jsp + model = ModelAndView
		return "controller";// WEB-INF/jsp/"list".jsp
	}
}
