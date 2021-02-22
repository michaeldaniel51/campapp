package com.example.camp.repositories;


import com.example.camp.entities.Transaction;
import com.example.camp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository <Transaction, Long> {
}
