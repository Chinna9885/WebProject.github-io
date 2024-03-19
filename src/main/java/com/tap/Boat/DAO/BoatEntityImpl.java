package com.tap.Boat.DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoatEntityImpl implements BoatEntity{
	@Autowired
	private SessionFactory sessionFactory;
	

	public BoatEntityImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		System.err.println("Sesseion Factory has been created ");
	}

	@Override
	public boolean SaveBoatEntityData(BoatEntityTable boatEntityTable) {
		  System.out.println("Invoked BoatEntity");
		  Session session=null;
		  boolean isDataSaved=false;
		
		try {
			 session=sessionFactory.openSession();
			 session.beginTransaction();
			session.save(boatEntityTable);
			 session.getTransaction().commit();
			 System.out.println("boatentity has been saved");
			 if( session.save(boatEntityTable) !=null)
			 {
				 isDataSaved=true;
			 }
		}
		finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			}
			
		}
		return isDataSaved;
	}

}
