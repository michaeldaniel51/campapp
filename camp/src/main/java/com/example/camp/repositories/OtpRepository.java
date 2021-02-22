package com.example.camp.repositories;


import com.example.camp.entities.Otp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpRepository extends CrudRepository <Otp,Long> {
}
