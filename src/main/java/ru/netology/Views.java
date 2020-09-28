package ru.netology;

public class Views {
    private long parentPostID;
    private long userID; //автор репоста

    public long getParentPostID() {
        return parentPostID;
    }

    public void setParentPostID(long parentPostID) {
        this.parentPostID = parentPostID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
