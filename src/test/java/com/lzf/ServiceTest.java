/**
 * 
 */
package com.lzf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzf.service.IServiceTest;

/**
 * @author MJCoder
 *
 */
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" })
public class ServiceTest {
	@Autowired
	private IServiceTest serviceTest;

	/**
	 * 
	 */
	public ServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void selectSysConfig() {
		System.out.println(serviceTest.selectSysConfig());
	}

}
