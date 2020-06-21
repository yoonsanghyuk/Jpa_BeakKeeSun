package com.example.springjpaexample;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Transactional
@Component
public class JpaRunner implements ApplicationRunner {

    @Autowired
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Account account = Account.builder()
                .username("yoonsh_latest")
                .password("helloworld")
                .email("ysh@wmp.com")
//                .homeAddress(new Address("zipcode","city","street"))
//                .officeAddress(new Address("zipcode","city","street"))
//                .studies(studies)
                .build();

        Study study = new Study();
        study.setName("yoonsh");
        study.setOwner(account);

        Study study2 = new Study();
        study2.setName("ysh22");
        study2.setOwner(account);

//        Set<Study> studies = new HashSet<>();
//        studies.add(study);
//        studies.add(study2);



        Session session = entityManager.unwrap(Session.class);

        session.save(account);
        session.save(study);
        session.save(study2);

//        entityManager.persist(account);
//        entityManager.persist(study);
    }
}
