package com.fakepersonapi.Repositories;

import com.fakepersonapi.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {}
