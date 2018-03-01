/**
 * 
 */
package com.lzf;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzf.dao.IDaoTest;

/**
 * @author MJCoder
 *
 */
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-dao.xml" })
public class DaoTest {

	@Autowired
	private IDaoTest sysConfig;

	/**
	 * 
	 */
	public DaoTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testMyBatis() {
		List<com.lzf.entity.SysConfig> sysConfigs = sysConfig.selectSysConfig();
		System.out.println(sysConfigs.toString());
	}

}
