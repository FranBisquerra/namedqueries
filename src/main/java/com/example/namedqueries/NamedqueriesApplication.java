package com.example.namedqueries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

@SpringBootApplication
public class NamedqueriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamedqueriesApplication.class, args);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
        EntityManager em = emf.createEntityManager();

        em.createNamedQuery("Foo.findAll").getResultList();

        Query query = em.createNamedQuery("Foo.findById");
        query.setParameter("id", 2);
        query.getSingleResult();

        em.createNamedQuery("Bar.findAll").getResultList();

        Query queryBar = em.createNamedQuery("Bar.findById");
        queryBar.setParameter("id", 2);
        queryBar.getSingleResult();

        em.close();
    }
}
