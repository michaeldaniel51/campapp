package com.example.camp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    User user1 = new User(1, "john", "michael", "john@gmail.com", "1234", "tailor", "12", "27-03-2003",0);
    User user2 = new User(2, "mary", "jane", "mary2gmail.com", "4321", "teacher", "16", "29-06-2004", 0);

    List<User> users = new ArrayList<>(Arrays.asList(user1,user2));


    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public List<User>getSomeUser() {

     return users;
 }
    public void addSomeUser(User user){
         users.add(user);
    }

    public User findSomeUserById(String id){

        User user = users.stream().filter(t-> id.equals(t.getId())).findFirst().orElse(null);

        return user;

    }

    public void deleteSomeUserById(String id){

        users.removeIf(t->id.equals(t.getId()));


    }

    public void updateSomeUser(User u) throws Exception {
        System.out.println(users);
        User uu = users.stream().filter(user -> user.getId() == u.getId())
                .findAny().orElseThrow(() -> new Exception(String.format("User with id: %s does not exist", u.getId())));

        users.remove(uu);
        users.add(u);
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

    public void findById(long id) {

        userRepository.findById(id);

    }

    public void deleteById(long id) {

        userRepository.deleteById(id);

    }

    public void updateUser(User user) {

        userRepository.save(user);

    }
}
