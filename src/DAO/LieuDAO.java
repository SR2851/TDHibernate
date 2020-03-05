package DAO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import fr.adaming.model.Lieu;

public class LieuDAO implements ILieuDAO {
	

	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	@Override
	public int addLieu(Lieu lieu) {
		
		
		
			try {
				session.beginTransaction();
				session.save(lieu);
				session.getTransaction().commit();
				System.out.println("Lieu ajouté");
				return 1;
			} catch (HibernateException e) {
				System.out.println("Lieu non ajouté");
				e.printStackTrace();
			}
			return 0;
		
	}

	@Override
	public List<Lieu> getLieu() {
		
	
		List<Lieu> liste= new ArrayList<Lieu>();
		try {
			session.beginTransaction();
			String q="Select * from Lieu";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Lieu.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}

	}}
