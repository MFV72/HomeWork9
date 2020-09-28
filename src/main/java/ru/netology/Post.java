package ru.netology;

import java.util.Date;

public class Post {
    private long postID;
    private long postAuthorID; //* автор
    private long groupID; // в чьей группе пост
    private long adminID; //* ID администратора, разместившего запись
    private Logo logo;
    private String headerCaption;
    private Date dateOfPost;
    private DropDownMenu menu;
    private String textPost;
    private long replyAuthorID;
    private long replyPostID;

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

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
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

    public DropDownMenu getMenu() {
        return menu;
    }

    public void setMenu(DropDownMenu menu) {
        this.menu = menu;
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
}
