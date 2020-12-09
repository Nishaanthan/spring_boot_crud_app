package com.nisanthank.crudapp.repository;

import com.nisanthank.crudapp.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ComputerRepository extends JpaRepository<Computer, BigInteger> {
}
