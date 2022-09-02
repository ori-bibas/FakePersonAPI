package com.fakepersonapi.Repositories;

import com.fakepersonapi.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Long> {}
