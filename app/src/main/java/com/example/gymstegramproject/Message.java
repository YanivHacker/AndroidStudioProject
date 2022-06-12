package com.example.gymstegramproject;
import androidx.annotation.NonNull;
//import androidx.room.PrimaryKey;

@Entity
public class Message {
    @PrimaryKey
    @NonNull
    private long messageId;
    private long senderId;
    private long receiverId;
    private String content;

    public long getMessageId() {
        return messageId;
    }

    public long getSenderId() {
        return senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public String getContent() {
        return content;
    }

    public Message(long messageId, long senderId, long receiverId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
    }
}
