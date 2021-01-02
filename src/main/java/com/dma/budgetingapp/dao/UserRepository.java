package com.dma.budgetingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dma.budgetingapp.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
