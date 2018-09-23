package com.bjsxt.sorm.core;

/**
 * 负责查询，对外提供服务的核心类
 * @author gaoqi
 *
 */
public interface Query {
	
	/**
	 * 直接执行一个DML语句
	 * @param sql sql语句
	 * @param params 参数
	 * @return 执行sql语句后影响记录的行数
	 */
	public int executeDML(String sql,Object[] params);
	
	/**
	 * 将一个对象存储到数据库中
	 * 把对象中不为null的属性往数据库中存储！如果数字为null则放0
	 * @param obj
	 * @return
	 */
	public int insert(Object obj);
}
