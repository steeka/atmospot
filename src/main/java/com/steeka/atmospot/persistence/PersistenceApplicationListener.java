package com.steeka.atmospot.persistence;


@WebListener
public class PersistenceApplicationListener implements ServletContextListener {

    private EntityManagerFactory entityManagerFactory;

    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        entityManagerFactory = Persistence.createEntityManagerFactory("atmospot.persistence.manager1");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        entityManagerFactory.close();
    }
  
}

