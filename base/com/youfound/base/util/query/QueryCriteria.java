package com.youfound.base.util.query;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("unchecked")
public class QueryCriteria {
	private Logger logger = Logger.getLogger(QueryCriteria.class);
	private Class type;
	private DetachedCriteria query;
	private List<QueryOperation> operations = new ArrayList<QueryOperation>();
	public QueryCriteria(Class cl){
		this.type = cl;
		query = DetachedCriteria.forClass(cl);
	}
	public QueryCriteria allEq(Map map){
		query.add(Restrictions.allEq(map));
		return this;
	}
	public QueryCriteria between(String propertyName, Object lo, Object hi){
		query.add(Restrictions.between(propertyName, lo, hi));
		QueryOperation qo = new QueryOperation(QueryOperation.between, propertyName, new Object[]{lo, hi});
		operations.add(qo);
		return this;
	}
	public QueryCriteria eq(String propertyName, Object value){
		query.add(Restrictions.eq(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.eq, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria ge(String propertyName, Object value){
		query.add(Restrictions.ge(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.ge, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria gt(String propertyName, Object value){
		query.add(Restrictions.gt(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.gt, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria ilike(String propertyName, Object value){
		query.add(Restrictions.ilike(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.ilike, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria in(String propertyName, Collection values){
		query.add(Restrictions.in(propertyName, values));
		QueryOperation qo = new QueryOperation(QueryOperation.in, propertyName, values);
		operations.add(qo);
		return this;
	}
	public QueryCriteria in(String propertyName, Object[] values){
		query.add(Restrictions.in(propertyName, values));
		QueryOperation qo = new QueryOperation(QueryOperation.in, propertyName, values);
		operations.add(qo);
		return this;
	}
	public QueryCriteria notIn(String propertyName, Collection values){
		query.add(Restrictions.not(Restrictions.in(propertyName, values)));
		QueryOperation qo = new QueryOperation(QueryOperation.notIn, propertyName, values);
		operations.add(qo);
		return this;
	}
	public QueryCriteria notIn(String propertyName, Object[] values){
		query.add(Restrictions.not(Restrictions.in(propertyName, values)));
		QueryOperation qo = new QueryOperation(QueryOperation.notIn, propertyName, values);
		operations.add(qo);
		return this;
	}
	public QueryCriteria le(String propertyName, Object value){
		query.add(Restrictions.le(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.le, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria lt(String propertyName, Object value){
		query.add(Restrictions.lt(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.lt, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria ne(String propertyName, Object value){
		query.add(Restrictions.ne(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.ne, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria like(String propertyName, Object value){
		query.add(Restrictions.like(propertyName, value));
		QueryOperation qo = new QueryOperation(QueryOperation.like, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria idEq(String propertyName, Object value){
		query.add(Restrictions.idEq(value));
		QueryOperation qo = new QueryOperation(QueryOperation.eq, propertyName, value);
		operations.add(qo);
		return this;
	}
	public QueryCriteria isEmpty(String propertyName){
		query.add(Restrictions.isEmpty(propertyName));
		QueryOperation qo = new QueryOperation(QueryOperation.isEmpty, propertyName, "");
		operations.add(qo);
		return this;
	}
	public QueryCriteria isNotEmpty(String propertyName){
		query.add(Restrictions.isNotEmpty(propertyName));
		QueryOperation qo = new QueryOperation(QueryOperation.isNotEmpty, propertyName, "");
		operations.add(qo);
		return this;
	}
	public QueryCriteria isNotNull(String propertyName){
		query.add(Restrictions.isNotNull(propertyName));
		QueryOperation qo = new QueryOperation(QueryOperation.isNotNull, propertyName, "");
		operations.add(qo);
		return this;
	}
	public QueryCriteria isNull(String propertyName){
		query.add(Restrictions.isNull(propertyName));
		QueryOperation qo = new QueryOperation(QueryOperation.isNull, propertyName, "");
		operations.add(qo);
		return this;
	}
	public QueryCriteria asc(String propertyName){
		query.addOrder(Order.asc(propertyName));
		return this;
	}
	public QueryCriteria desc(String propertyName){
		query.addOrder(Order.desc(propertyName));
		return this;
	}
	public DetachedCriteria getQuery(){
		return this.query;
	}
	public void clearQueryCriteria(){
		this.query = null;
		this.query = DetachedCriteria.forClass(this.type);
	}
	public Class getType() {
		return type;
	}
	public void setType(Class type) {
		this.type = type;
	}
	public List<QueryOperation> getOperations() {
		return operations;
	}
	public void setOperations(List<QueryOperation> operations) {
		this.operations = operations;
	}
	
	public boolean search(Object target){
		boolean hunt = false;
		Field[] fields = target.getClass().getFields();
		Object[] agrs = new Object[]{};
		for(Field f: fields){
			String fieldType = f.getType().getSimpleName();
			for(QueryOperation qo: this.getOperations()){
				if(qo.getQueryColumn().equalsIgnoreCase(f.getName())){
					try {
						String mname = "get" + f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);
						Method m = target.getClass().getMethod(mname,new Class[0]);
						Object value = m.invoke(target, agrs);
						if(null != value){
							if(qo.getOperation().equals(QueryOperation.eq)){
								if ("String".equals(fieldType)
										|| ("Integer".equalsIgnoreCase(fieldType) || "int".equalsIgnoreCase(fieldType))
										|| "Long".equalsIgnoreCase(fieldType)
										|| "Short".equalsIgnoreCase(fieldType)
										|| "Boolean".equalsIgnoreCase(fieldType)) {
									if(value.toString().equals(qo.getValue().toString())){
										hunt = true;
									}
								} else if ("Date".equalsIgnoreCase(fieldType)) {
			                    	java.util.Date d1 = (java.util.Date)value;
			                    	java.util.Date d2 = (java.util.Date)qo.getValue();
			                    	if(d1.getTime() == d2.getTime()){
			                    		hunt = true;
			                    	}
			                    }
							} else if(qo.getOperation().equals(QueryOperation.between)){
								if (("Integer".equalsIgnoreCase(fieldType) || "int".equalsIgnoreCase(fieldType))
										|| "Long".equalsIgnoreCase(fieldType)
										|| "Short".equalsIgnoreCase(fieldType)) {
									long v1 = Long.parseLong(value.toString());
									Object[] between = qo.getValues().toArray();
									long v21 = Long.parseLong(between[0].toString());
									long v22 = Long.parseLong(between[1].toString());
									if(v1 >= v21 && v1 <= v22){
										hunt = true;
									}
								} else if ("Date".equalsIgnoreCase(fieldType)) {
			                    	java.util.Date d1 = (java.util.Date)value;
			                    	Object[] between = qo.getValues().toArray();
			                    	java.util.Date d21 = (java.util.Date)between[0];
			                    	java.util.Date d22 = (java.util.Date)between[1];
			                    	if(d1.getTime() >= d21.getTime() && d1.getTime() <= d22.getTime()){
			                    		hunt = true;
			                    	}
			                    }
							} else if(qo.getOperation().equals(QueryOperation.ge)
									|| qo.getOperation().equals(QueryOperation.gt)){
								if (("Integer".equalsIgnoreCase(fieldType) || "int".equalsIgnoreCase(fieldType))
										|| "Long".equalsIgnoreCase(fieldType)
										|| "Short".equalsIgnoreCase(fieldType)) {
									long v1 = Long.parseLong(value.toString());
									long v2 = Long.parseLong(qo.getValue().toString());
									if((v1 >= v2 && qo.getOperation().equals(QueryOperation.ge))
											|| (v1 > v2 && qo.getOperation().equals(QueryOperation.gt))){
										hunt = true;
									}
								} else if ("Date".equalsIgnoreCase(fieldType)) {
			                    	java.util.Date d1 = (java.util.Date)value;
			                    	java.util.Date d2 = (java.util.Date)qo.getValue();
			                    	if((d1.getTime() >= d2.getTime() && qo.getOperation().equals(QueryOperation.ge))
											|| (d1.getTime() > d2.getTime() && qo.getOperation().equals(QueryOperation.gt))){
			                    		hunt = true;
			                    	}
			                    }
							} else if(qo.getOperation().equals(QueryOperation.le)
									|| qo.getOperation().equals(QueryOperation.lt)){
								if (("Integer".equalsIgnoreCase(fieldType) || "int".equalsIgnoreCase(fieldType))
										|| "Long".equalsIgnoreCase(fieldType)
										|| "Short".equalsIgnoreCase(fieldType)) {
									long v1 = Long.parseLong(value.toString());
									long v2 = Long.parseLong(qo.getValue().toString());
									if((v1 <= v2 && qo.getOperation().equals(QueryOperation.ge))
											|| (v1 < v2 && qo.getOperation().equals(QueryOperation.gt))){
										hunt = true;
									}
								} else if ("Date".equalsIgnoreCase(fieldType)) {
			                    	java.util.Date d1 = (java.util.Date)value;
			                    	java.util.Date d2 = (java.util.Date)qo.getValue();
			                    	if((d1.getTime() <= d2.getTime() && qo.getOperation().equals(QueryOperation.ge))
											|| (d1.getTime() < d2.getTime() && qo.getOperation().equals(QueryOperation.gt))){
			                    		hunt = true;
			                    	}
			                    }
							} else if(qo.getOperation().equals(QueryOperation.in)){
								if ("String".equals(fieldType)){
									Object[] in = qo.getValues().toArray();
									for(Object o: in){
										if(value.toString().equals(o.toString())){
											hunt = true;
											break;
										}
									}
								}
							}
						}
					} catch(Exception e){
						logger.error("search", e);
					}
					break;
				}
			}
		}
		return hunt;
	}
}
