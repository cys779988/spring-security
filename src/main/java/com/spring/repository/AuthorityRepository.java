package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}