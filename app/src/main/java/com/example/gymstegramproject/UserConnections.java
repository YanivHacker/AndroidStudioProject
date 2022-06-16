package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;


@Entity(primaryKeys = {"userId", "secondUserId"})
public class UserConnections {
    private long userId;
    private long secondUserId;

    public UserConnections(long userId, long secondUserId) {
        this.userId = userId;
        this.secondUserId = secondUserId;
    }

    }