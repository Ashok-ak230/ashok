package com.sba.task.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sba.task.model.DxcUsers;

@Component
@Transactional
public class DxcUsersDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String saveUser(DxcUsers dxcUsers) {
    	try {
    	Session session=sessionFactory.getCurrentSession();
    	session.save(dxcUsers);
    	return "user created";
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return "cannot create user";
    }
	
	public DxcUsers getUserById(int userId){
		try{
			Session session=sessionFactory.getCurrentSession();
		DxcUsers dxcUsers=(DxcUsers)session.get(DxcUsers.class,userId);
		return dxcUsers;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return null;
		}
	
	
	
	public String updateUserById(DxcUsers dxcUsers) {
		try {
			Session session=sessionFactory.getCurrentSession();
			System.out.println("dxcUsers"+dxcUsers);
			session.update("DxcUsers",dxcUsers);
			return "Password has been updated";
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "Cannot update Password";
			
		}
	public String updatePassword(int userId, String password) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("update DxcUsers set password=:password where userId=:userId");
			query.setParameter("userId", userId);
			query.setParameter("password", password);
			int res=query.executeUpdate();
			if(res>0)
				return "Updated";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot update";
	}
	}


