package com.tarking.microservice.repository;

import com.tarking.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tuojinguo on 2018/2/27.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
