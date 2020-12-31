package com.example.spring_demo.execution;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ExecutionRepository extends JpaRepository<Executions, Integer> {

}
