package com.example.camp.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private long id;

    @NotNull(message = "Please Enter FirstName")
    @Column(name = "FIRSTNAME")
    private String firstName;

    @NotNull(message = "Please Enter LastName")
    @Column(name = "LASTNAME")
    private String lastName;

    @NotNull(message = "Please Enter a Valid Email")
    @Column(name = "EMAIL",unique = true)
    private String email;

    @NotNull(message = "Please Enter a Valid Password")
    @Column(name = "PASSWORD")
    private String password;

    @NotNull(message = "Please Enter Your Occupation")
    @Column(name = "OCCUPATION")
    private String occupation;

    @NotNull(message = "Please Enter Your Age")
    @Column(name = "AGE")
    private String age;

    @NotNull(message = "Please Enter Date Of Birth")
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;


    @NotNull(message = "Your Balance Is!!!!")
    @Column(name = "BALANCE")
    private long balance;

    @NotNull(message = "Enter Your PhoneNumber")
    @Column(name = "PHONE_NUMBER")
    private long phoneNumber;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }



    public User(long id, @NotNull(message = "Please Enter FirstName") String firstName, @NotNull(message = "Please Enter LastName") String lastName, @NotNull(message = "Please Enter a Valid Email") String email, @NotNull(message = "Please Enter a Valid Password") String password, @NotNull(message = "Please Enter Your Occupation") String occupation, @NotNull(message = "Please Enter Your Age") String age, @NotNull(message = "Please Enter Date Of Birth") String dateOfBirth,@NotNull long balance,@NotNull long phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age='" + age + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", balance=" + balance +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
