package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

import java.util.ArrayList;


// do rating by number of posts - for example, trainee with over 200 posts is "experienced trainee" or something

public class Trainee {
//    @PrimaryKey
    @NonNull
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String bio;
    private int age;
    private ArrayList<String> connections; // will contain usernames, it's mutual
    private ArrayList<String> postsIDs;
    private int gender; // 0 - male, 1 - female
    private Boolean isDeleted; // default: false
    private String phoneNumber;
    private String profilePicture; // binary photo
    // anything else?

    public Trainee(String username, String firstName, String lastName, String email, String bio, int age, int gender, String phoneNumber, String profilePicture)
    {
        this.userName = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.bio = bio;
        this.connections = new ArrayList<>();
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.postsIDs = new ArrayList<>();
        this.isDeleted = false;
        this.profilePicture = profilePicture;
    }
}


