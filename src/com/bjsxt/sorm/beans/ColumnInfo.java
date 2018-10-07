package com.bjsxt.sorm.beans;


/**
 * 封装表中一个字段信息
 * @author admin
 *
 */
public class ColumnInfo {
  
	//字段的数据类型
	private String dataType;
	
	//字段名称
	private String name;
	
	//字段的键类型（0：普通键，1：主键，2：外键）
	private int keyType;

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKeyType() {
		return keyType;
	}

	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}

	public ColumnInfo(String dataType, String name, int keyType) {
		super();
		this.dataType = dataType;
		this.name = name;
		this.keyType = keyType;
	}

	public ColumnInfo() {
	}
	
	
}
