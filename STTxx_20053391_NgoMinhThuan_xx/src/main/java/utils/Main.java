package utils;

import jakarta.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = DbConnecttion.getEntityManager();
		
		try {
			em = DbConnecttion.getEntityManager();
			if (em.isOpen()) {
                System.out.println("Ket noi CSDL thanh cong");
            } else {
                System.out.println("Ket noi CSDL that bai ");
			
            }
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			em.close();
			
			
		}

	}

}
