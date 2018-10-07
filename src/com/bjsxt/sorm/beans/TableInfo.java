package com.bjsxt.sorm.beans;

import java.util.List;
import java.util.Map;

/**
 * 存储表结构信息
 * @author admin
 *
 */
public class TableInfo {
	
	//表名
	private String tname;
	
	//所有字段信息
	private Map<String,ColumnInfo> colums;
	
	//唯一主键
	private ColumnInfo onlyPriKey;
	
	//联合主键
	private List<ColumnInfo> priKeys;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Map<String, ColumnInfo> getColums() {
		return colums;
	}

	public void setColums(Map<String, ColumnInfo> colums) {
		this.colums = colums;
	}

	public ColumnInfo getOnlyPriKey() {
		return onlyPriKey;
	}

	public void setOnlyPriKey(ColumnInfo onlyPriKey) {
		this.onlyPriKey = onlyPriKey;
	}

	public List<ColumnInfo> getPriKeys() {
		return priKeys;
	}

	public void setPriKeys(List<ColumnInfo> priKeys) {
		this.priKeys = priKeys;
	}

	public TableInfo() {
	}

	public TableInfo(String tname, Map<String, ColumnInfo> colums, ColumnInfo onlyPriKey) {
		super();
		this.tname = tname;
		this.colums = colums;
		this.onlyPriKey = onlyPriKey;
	}

	public TableInfo(String tname, Map<String, ColumnInfo> colums, List<ColumnInfo> priKeys) {
		super();
		this.tname = tname;
		this.colums = colums;
		this.priKeys = priKeys;
	}
	
	
	
}
