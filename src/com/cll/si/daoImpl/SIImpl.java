package com.cll.si.daoImpl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.cll.si.dao.SI;
import com.cll.si.model.Person;

public class SIImpl extends SqlMapClientDaoSupport implements SI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cll.si.dao.SI#insert(com.cll.si.model.Person)
	 */
	@Override
	public void insert(Person person) {
		getSqlMapClientTemplate().insert("sql_insert", person);
	}
	/*
	 * dao类一般都继承SqlMapClientDaoSupport类，用它提供的getSqlMapClientTemplate()方法
	 * 类对数据库进行相应的操作。
	 * */
}
