package com.steeka.atmospot.persistence;


public class PersistenceApplicationListener implements ServletContextListener {


    private EntityManagerFactory entityManagerFactory;

    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        entityManagerFactory = Persistence.createEntityManagerFactory("atmospot.persistence.manager1");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        entityManagerFactory.close();
    }
}

