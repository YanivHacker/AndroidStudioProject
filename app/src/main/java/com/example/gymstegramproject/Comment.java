package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

import java.util.Date;
// TODO: MAKE ID AUTOMATICALLY INCREMENTAL
public class Comment {
//    @PrimaryKey
    @NonNull
    private String commentID;
    private String commenterUserName;
    private String postID;
    private String content;
    private Boolean isDeleted;

    public Comment(String CommentID, String commenterUserName, String postID, String content)
    {
        this.commentID = commentID;
        this.commenterUserName = commenterUserName;
        this.postID = postID;
        this.content = content;
        this.isDeleted = false;
    }
}
