package com.example.goodn.myapplication;

/**
 * Created by goodn on 2017-06-12.
 */

public class MessageModel {

    /**
     * MessageModel : 채팅 메시지 Model
     * String Message : 메시지 내용
     * boolean ChatType : 본인(true) / 상대방(false) 필요에 의해 int 로 변환하여 여러 타입으로 쓸 수 있음(날짜, 공지 기타 등등)
     */
    private String message;

    private boolean chatType;


    public MessageModel(String message, boolean chatType) {
        this.message = message;
        this.chatType = chatType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isChatType() {
        return chatType;
    }

    public void setChatType(boolean chatType) {
        this.chatType = chatType;
    }
}