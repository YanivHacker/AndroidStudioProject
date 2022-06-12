package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.Date;
// TODO: MAKE ID AUTOMATICALLY INCREMENTAL
@Entity
public class Post {
    @PrimaryKey
    @NonNull
    private long postID; //make this incremental
    private String userName; //(user) one to many (post)
    private String content;

    //post date
    private String postDate;

    @Ignore
    private Bitmap picture; //photo will be binary, then convert with function that I guess exists
    //TODO add video
    private Boolean isDeleted;
    //TODO add location
    // enter location? then with google maps
    // amount of likes, comments...?
    // add videos

    public Post(@NonNull String postID, String userName, String content, Bitmap picture)
    {
        this.userName = userName;
        this.postID = postID;
        this.postDate = dateParse();
        this.content = content;
        this.commentsIDs = picture;
        this.isDeleted = false;
    }

    private String dateParse(){
        String[] fullDate= new Date().toString().split(" ");
        return fullDate[1]+" "+fullDate[2]+" "+fullDate[5];
    }
    
    //getters
    public long getPostID() {
        return postID;
    }

    public String getUserName() {
        return userName;
    }

    public String getContent() {
        return content;
    }

    public String getPostDate() {
        return postDate;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }


    //setters
    public void setPostID(long postID) {
        this.postID = postID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
