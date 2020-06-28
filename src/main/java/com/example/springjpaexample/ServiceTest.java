package com.example.springjpaexample;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

//@Service
@Transactional
public class ServiceTest {

//    @Autowired
    EntityManager entityManager;

    public Account transactionTest() {
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


        Account keesun = session.load(Account.class , account.getId());
        keesun.setUsername("yoonsh update?");
        keesun.setUsername("yoonsh update?2");

        System.out.println(keesun.getUsername());
        return keesun;
    }
}
