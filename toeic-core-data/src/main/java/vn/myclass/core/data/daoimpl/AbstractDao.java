package vn.myclass.core.data.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.Transaction;

import vn.myclass.core.common.utils.HibernateUtil;
import vn.myclass.core.data.dao.GenericDao;

public class AbstractDao <ID extends Serializable, T> implements GenericDao<ID, T>{
	private Class<T> persistenceClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao() {
        this.persistenceClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	public String getPersistenceClassName() {
		return persistenceClass.getSimpleName();
	}
	protected Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public List<T> findAll() {
		
		return null;
	}
}
