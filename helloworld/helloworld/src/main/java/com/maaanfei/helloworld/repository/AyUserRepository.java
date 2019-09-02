package com.maaanfei.helloworld.repository;

import com.maaanfei.helloworld.pojo.AyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AyUserRepository extends JpaRepository<AyUser, String> {

}
