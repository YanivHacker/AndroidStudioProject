package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

@Entity (primaryKeys = {"messageId", "userId"})
public class MessageUserCrossRef {
    private long messageId;
    private long userId;
    
    public MessageUserCrossRef(long messageId, long userId) {
        this.messageId = messageId;
        this.userId = userId;
    }

    public long getMessageId() {
        return messageId;
    }

    public long getUserId() {
        return userId;
    }
}
