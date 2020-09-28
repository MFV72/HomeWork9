package ru.netology;

public class Like {
    private long parentID;

    public long getLikeAutorID() {
        return likeAutorID;
    }

    public void setLikeAutorID(long likeAutorID) {
        this.likeAutorID = likeAutorID;
    }

    public long getParentID() {
        return parentID;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
    }

    private long likeAutorID;
}
