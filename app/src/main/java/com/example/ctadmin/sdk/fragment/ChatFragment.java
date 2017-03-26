package com.example.ctadmin.sdk.fragment;
import java.util.Date;
/**
 * Created by ctadmin on 26-03-2017.
 */

public class ChatFragment {
    private String messageText;
    private String messageUser;
    private long messageTime;

    public ChatFragment(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }

    public ChatFragment(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
