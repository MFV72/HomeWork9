package ru.netology;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;

public class Comment {
    private long commentID;
    private long commentAutorID;
    private long parentCommentID;
    private String textComment;
    private long count;

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public long getParentCommentID() {
        return parentCommentID;
    }

    public void setParentCommentID(long parentCommentID) {
        this.parentCommentID = parentCommentID;
    }

    public long getCommentAutorID() {
        return commentAutorID;
    }

    public void setCommentAutorID(long commentAutorID) {
        this.commentAutorID = commentAutorID;
    }

    public long getCommentID() {
        return commentID;
    }

    public void setCommentID(long commentID) {
        this.commentID = commentID;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
