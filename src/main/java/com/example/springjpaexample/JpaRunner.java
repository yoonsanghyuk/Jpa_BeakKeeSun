package com.example.springjpaexample;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private Keesun keesun;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        postRepository.
        System.out.println(keesun.getName());
        System.out.println(keesun);
    }
}
