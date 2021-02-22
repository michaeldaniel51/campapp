package com.example.camp.services;


import com.example.camp.entities.Otp;
import com.example.camp.entities.User;
import com.example.camp.repositories.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OtpService {

    @Autowired
    private UserService userService;

    @Autowired
    private OtpRepository otpRepository;

    public List<Otp> getAllOtp(long id){
      List<Otp> otp = new ArrayList<>();
      otpRepository.findAll().forEach(otp::add);
      return otp;
    }


    public void saveOtp(Otp otp){
        otpRepository.save(otp);

    }


    public void deleteById(long id){

        otpRepository.deleteById(id);

    }


    public Otp findById (long id) throws Exception {
        return otpRepository.findById(id).orElseThrow(()-> new Exception("id not found"));


    }

    public void updateOtp(Otp otp){

        otpRepository.save(otp);
    }


    public void sendOtp(Otp otp){

        User user = otp.getUser();
         user.setPhoneNumber(otp.getToken());
        otpRepository.save(otp);
        userService.addUser(user);
        }


}
