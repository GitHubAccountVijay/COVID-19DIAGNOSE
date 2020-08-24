package com.covid.scan;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covid.factory.HibernateUtil;

public class ServletDAO {
	public int check(String name, String coviddetails)
	
	{
		Session session=null;
		Pojo pojo=null;
		Transaction transaction=null;
		int result = 0;
		try{
			session= HibernateUtil.getSession();
			transaction = session.beginTransaction();
			int id=1;
			pojo = session.get(Pojo.class, id);
			if(pojo.getDetails().equals(coviddetails))
			{
				result=1;
				System.out.println("1");
			}
			else
			{
				result=0;
				System.out.println("0");
			}
			transaction.commit();
						
		} catch (Exception e) {

		}
		
		finally {
			session.close();
		}
		return result;
		
	}

}
