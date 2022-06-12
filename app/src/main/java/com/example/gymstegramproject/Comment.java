package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

import java.util.Date;

// TODO: MAKE ID AUTOMATICALLY INCREMENTAL
@Entity
public class Comment {
    @PrimaryKey
    @NonNull
    private long commentID;
    private String commenterUserName; //(user) one to many (comment)
    private String postID; //(post) one to many (comment)
    private String content;
    private Boolean isDeleted;

    public Comment(@NonNull long CommentID, String commenterUserName, String postID, String content)
    {
        this.commentID = commentID;
        this.commenterUserName = commenterUserName;
        this.postID = postID;
        this.content = content;
        this.isDeleted = false;
    }

    //getters
    public long getCommentID() {
        return commentID;
    }

    public String getCommenterUserName() {
        return commenterUserName;
    }

    public String getPostID() {
        return postID;
    }

    public String getContent() {
        return content;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    //setters

    public void setCommentID(long commentID) {
        this.commentID = commentID;
    }

    public void setCommenterUserName(String commenterUserName) {
        this.commenterUserName = commenterUserName;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
