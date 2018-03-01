/**
 * 
 */
package com.lzf.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzf.dao.IDaoTest;
import com.lzf.entity.SysConfig;
import com.lzf.service.IServiceTest;

/**
 * @author MJCoder
 *
 */
@Service
public class ServiceTest implements IServiceTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// 注入dao
	@Autowired
	private IDaoTest daoTest;

	/**
	 * 
	 */
	public ServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SysConfig> selectSysConfig() {
		// TODO Auto-generated method stub
		return daoTest.selectSysConfig();
	}

}
