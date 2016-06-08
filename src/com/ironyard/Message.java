package com.ironyard;

/**
 * Created by illladell on 6/8/16.
 */
public class Message {
    int id;
    int replyId;
    String author;
    String text;

    public Message(int id, int replyId, String text, String author) {
        this.id = id;
        this.replyId = replyId;
        this.text = text;
        this.author = author;
    }
}
