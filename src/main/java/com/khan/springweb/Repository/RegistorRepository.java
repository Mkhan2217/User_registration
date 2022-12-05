package com.khan.springweb.Repository;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.khan.springweb.entity.Register;



@Component
public class RegistorRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Register register) {
		Session session=sessionFactory.openSession();
		try {
			Transaction transaction=session.beginTransaction();
			session.merge(register);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Register> findAll(){
		Session session=sessionFactory.openSession();
		try {
			String hql="from Register";
			@SuppressWarnings("rawtypes")
			Query query=session.createQuery(hql);
			return query.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		return Collections.EMPTY_LIST;
	}
	
	


}
