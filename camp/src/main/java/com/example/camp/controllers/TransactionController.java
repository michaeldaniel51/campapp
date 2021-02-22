package com.example.camp.controllers;

import com.example.camp.entities.Transaction;
import com.example.camp.entities.User;
import com.example.camp.services.TransactionService;
import com.example.camp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    UserService userService;

    @PostMapping("withdrawal/{id}")
    public void withdraw(@RequestBody Transaction transaction , @PathVariable long id) throws Exception {

        User user = userService.findById(id);

        transactionService.withdraw(transaction,user);
    }

    @PostMapping("/deposit/{id}")
    public void deposit (@RequestBody Transaction transaction,@PathVariable long id) throws Exception {

        User user = userService.findById(id);
        transactionService.deposit(transaction,user);
 }

}
