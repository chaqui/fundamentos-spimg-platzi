package com.fundamentosplatzi.springboot.fundamentos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fundamentosplatzi.springboot.fundamentos.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email = ?1")
    Optional<User> findByUserEmail(String email);

    @Query("select u from User u where u.name LIKE ?1%")
    List<User> findAndSort(String nanme, Sort sort);
		
		List<User> findByName(String name);

		Optional<User> findByEmailAndName(String email, String name);


}
    

