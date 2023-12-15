package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> findUserByMail(@Param("email") String email);

    @Query("SELECT count(u) FROM User u WHERE u.email =:email and u.password =:password")
    int validateCredentials(@Param("email")String email, @Param("password")String password);
}
