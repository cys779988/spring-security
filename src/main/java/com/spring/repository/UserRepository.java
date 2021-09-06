package com.spring.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   @EntityGraph(attributePaths = "authorities")
   // @EntityGraph : Lazy 조회가 아닌 Eager 조회로 authorities 정보를 같이 가져옴
   Optional<User> findOneWithAuthoritiesByUsername(String username);
}