package com.nagarro.aqib.Library.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.aqib.Library.Management.System.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
