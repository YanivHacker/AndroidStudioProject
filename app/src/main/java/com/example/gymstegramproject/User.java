package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;


@Entity
public class User {
    @PrimaryKey
    @NonNull
    //login info
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private string password;

    //personal info
    private String bio;
    private int age;
    private int gender; // 0 - male, 1 - female
    private String sexualPreferences; // 0 - male, 1 - female, 2 - both
    //private List<String> moreInfo;

    //helpful
    private List<String> connections; // will contain usernames, it's mutual
    private Boolean isDeleted; // default: false
    private Bitmap profilePicture; // binary photo
    // anything else?


    public User(@NonNull String userName, String firstName, String lastName, String email, String phoneNumber, string password, String bio, int age, int gender, String sexualPreferences, List<String> moreInfo, List<String> connections, List<String> postsIDs, String profilePicture) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.bio = bio;
        this.age = age;
        this.gender = gender;
        this.sexualPreferences = sexualPreferences;
        this.moreInfo = moreInfo;
        this.connections = connections;
        this.isDeleted = false;
        this.profilePicture = profilePicture;
    }

    //getters
    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public string getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getSexualPreferences() {
        return sexualPreferences;
    }

    public List<String> getMoreInfo() {
        return moreInfo;
    }

    public List<String> getConnections() {
        return connections;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    //setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(string password) {
        this.password = password;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setSexualPreferences(String sexualPreferences) {
        this.sexualPreferences = sexualPreferences;
    }

    public void setMoreInfo(List<String> moreInfo) {
        this.moreInfo = moreInfo;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}