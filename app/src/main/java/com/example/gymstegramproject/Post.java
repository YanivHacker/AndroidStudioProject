package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.Date;
// TODO: MAKE ID AUTOMATICALLY INCREMENTAL
public class Post {
//    @PrimaryKey
    @NonNull
    private String postID; //make this incremental
    private String userName;
    private Date postDate;
    private String content;
    private ArrayList<String> commentsIDs;
    private ArrayList<String> photos; // photo will be binary, then convert with function that I guess exists
    private Boolean isDeleted;
    // enter location? then with google maps
    // amount of likes, comments...?
    // add videos

    public Post(String postID, String userName, Date postDate, String content, String[] photos)
    {
        this.userName = userName;
        this.postID = postID;
        this.postDate = postDate;
        this.content = content;
        this.photos = new ArrayList<>();
        this.commentsIDs = new ArrayList<>();
        this.isDeleted = false;
    }
}
