package com.youfound.base.util.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QueryOperation {
	public static final String allEq = "allEq";
	public static final String between = "between";
	public static final String eq = "eq";
	public static final String ge = "ge";
	public static final String gt = "gt";
	public static final String ilike = "ilike";
	public static final String in = "in";
	public static final String notIn = "notIn";
	public static final String le = "le";
	public static final String lt = "lt";
	public static final String ne = "ne";
	public static final String like = "like";
	public static final String isEmpty = "isEmpty";
	public static final String isNotEmpty = "isNotEmpty";
	public static final String isNotNull = "isNotNull";
	public static final String isNull = "isNull";
	private String operation;
	private String queryColumn;
	private Collection values;
	private Object value;
	public QueryOperation(String operation, String queryColumn, Collection values){
		this.setOperation(operation);
		this.setQueryColumn(queryColumn);
		this.values = values;
	}
	public QueryOperation(String operation, String queryColumn, Object value) {
		// TODO Auto-generated constructor stub
		this.setOperation(operation);
		this.setQueryColumn(queryColumn);
		this.setValue(value);
	}
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getQueryColumn() {
		return queryColumn;
	}
	public void setQueryColumn(String queryColumn) {
		this.queryColumn = queryColumn;
	}
	public Collection getValues() {
		return values;
	}
	public void setValues(Collection values) {
		this.values = values;
	}
}
