package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class DbConnecttion {
	public static EntityManagerFactory enf = null;
	
	static {
		try {
            enf = jakarta.persistence.Persistence.createEntityManagerFactory("QUANLY");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static EntityManager getEntityManager() {
		return enf.createEntityManager();
	}
	
	public static void close() {
		enf.close();
	}
		

}
