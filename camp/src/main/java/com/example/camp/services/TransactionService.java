package com.example.camp.services;


import com.example.camp.entities.Transaction;
import com.example.camp.entities.User;
import com.example.camp.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private TransactionRepository transactionRepository;




    public long balance;

    public void deposit(Transaction transaction, User user) {

        if(transaction != null)

             balance = user.getBalance() + transaction.getAmount();

            transaction.setUser(user);

            user.setBalance(balance);
            transactionRepository.save(transaction);
            userService.addUser(user);
        }




        public void withdraw(Transaction transaction, User user){


                long balance = user.getBalance() - transaction.getAmount();
                transaction.setUser(user);
                user.setBalance(balance);
                transactionRepository.save(transaction);
                userService.addUser(user);

        }
    }

