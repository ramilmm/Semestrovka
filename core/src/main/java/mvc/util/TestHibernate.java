package mvc.util;

import org.hibernate.Session;


public class TestHibernate {

    public static void main(String[] args) {
        try {
            testConnection();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!HibernateUtil.getSessionFactory().isClosed())
                HibernateUtil.getSessionFactory().close();
        }
    }

    public static void testConnection() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e) {
            System.err.println("Error in testConnection(): " + e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
