package ru.netology;

import java.util.Date;

public class Post {
    private long postID;
    private long postAuthorID; //* автор
    private long groupID; // в чьей группе пост
    private long adminID; //* ID администратора, разместившего запись
    private String headerCaption;
    private Date dateOfPost;
    private String textPost;
    private long replyAuthorID;
    private long replyPostID;
    private Comment comment;
    private Like like;
    private Views view;

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public long getPostAuthorID() {
        return postAuthorID;
    }

    public void setPostAuthorID(long postAuthorID) {
        this.postAuthorID = postAuthorID;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

    public String getHeaderCaption() {
        return headerCaption;
    }

    public void setHeaderCaption(String headerCaption) {
        this.headerCaption = headerCaption;
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(Date dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public long getReplyAuthorID() {
        return replyAuthorID;
    }

    public void setReplyAuthorID(long replyAuthorID) {
        this.replyAuthorID = replyAuthorID;
    }

    public long getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(long replyPostID) {
        this.replyPostID = replyPostID;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Views getView() {
        return view;
    }

    public void setView(Views view) {
        this.view = view;
    }
}
