  
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item DBUTIL class to store the details
* 
*/
package com.cg.myproject.DBUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil {

	static EntityManager em =null;
	public static EntityManager getConnection() {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myprojectjpa");
		 em = emf.createEntityManager();
		em.getTransaction().begin();

		return em;
	}
} 
 
