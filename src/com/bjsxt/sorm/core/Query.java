package com.bjsxt.sorm.core;

import java.util.List;

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
	
	/**
	 * 删除clazz表示类对应的表中的记录(指定主键id对应的值)
	 * @param clazz 跟表对应类的Class对象
	 * @param id 主键值
	 * @return 
	 */
	public void delete(Class clazz,int id);
	
	/**
	 * 删除和表对应的对象的值
	 * @param object
	 */
	public void delete(Object object);
	
	/**
	 * 更新对象对应字段的值
	 * @param obj 所要更新的对象
	 * @param fieldNames 更新属性的列表
	 * @return 执行sql语句后，影响的行数
	 */
	public int update(Object obj,String[] fieldNames); //update user where username = ? and ...
	
	/**
	 * 查询返回多行记录，并将每行记录封装到clazz指定的类的对象中
	 * @param sql
	 * @param clazz 封装数据的javabean类的Class对象
	 * @param params sql参数
	 * @return
	 */
	public List queryRows(String sql,Class clazz,Object[] params);
	
	/**
	 * 查询返回一行记录，并将该记录封装到clazz指定的类的对象中
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	public Object queryUniqueRow(String sql,Class clazz,Object[] params);
	
	/**
	 * 查询返回一个值(一行一列)，并将该值返回
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object queryValue(String sql,Object[] params);
	
	/**
	 * 查询返回一个数字(一行一列)，并将该值返回
	 * @param sql 查询语句
	 * @param params sql的参数
	 * @return 查询到的数字
	 */
	public Number queryNumber(String sql,Object[] params);
}
