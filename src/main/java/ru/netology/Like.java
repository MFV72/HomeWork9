package ru.netology;

public class Like {
    private long parentID;
    private long likeAutorID;
    private long count;

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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
