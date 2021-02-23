package com.example.camp.services;

import com.example.camp.entities.User;
import com.example.camp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {



    @Autowired
    private UserRepository userRepository;


    User user1 = new User(1, "john", "michael", "john@gmail.com", "1234", "tailor", "12", "27-03-2003",0, 0706);
    User user2 = new User(2, "mary", "jane", "mary2gmail.com", "4321", "teacher", "16", "29-06-2004", 0, 0705);

    List<User> someUser = new ArrayList<>(Arrays.asList(user1,user2));




    public List<User>getSomeUser() {

     return someUser;
 }
    public void addSomeUser(User user){
         someUser.add(user);
    }

    public User findSomeUserById(String id) throws Exception {

        User user = someUser.stream().filter(t-> id.equals(t.getId())).findFirst().orElseThrow(()->new Exception("not found"));

        return user;

    }

    public void deleteSomeUserById(String id){

        someUser.removeIf(t->id.equals(t.getId()));


    }

    public void updateSomeUser(User u) throws Exception {
        System.out.println(someUser);
        User uu = someUser.stream().filter(user -> user.getId() == u.getId())
                .findAny().orElseThrow(() -> new Exception(String.format("User with id: %s does not exist", u.getId())));

        someUser.remove(uu);
        someUser.add(u);


    }
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }



    public Optional<User> getUserByEmail(String email){

        return userRepository.findByEmail(email);
    }

    public Optional<User> getUserByFirstName(String firstname){

        return userRepository.findByFirstName(firstname);
    }

    public Optional<User> getUserByLastName(String lastname){
        return userRepository.findByLastName(lastname);
    }


    public void addUser(User user) {

        userRepository.save(user);

    }

    public User findById(long id) throws Exception {

        return userRepository.findById(id).orElseThrow(() -> new Exception("not found"));

    }

    public void deleteById(long id) {

        userRepository.deleteById(id);

    }

    public void updateUser(User user) {

        userRepository.save(user);

    }


}
