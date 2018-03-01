/**
 * 
 */
package com.lzf.dao;

import java.util.List;

/**
 * 持久层
 * 
 * org.apache.ibatis.annotations.Param
 * 有两个或以上的参数，一定要给方法的参数添加@Param("")注解，不然mybatis识别不了。注解的参数会自动封装成map集合，括号内即为键。
 * 只有一个参数，可以不用加 @Param注解，当然加了也无所谓。
 * 
 * @author MJCoder
 *
 */
public interface IDaoTest {
	List<com.lzf.entity.SysConfig> selectSysConfig();
}
