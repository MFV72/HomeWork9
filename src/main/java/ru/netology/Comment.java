package ru.netology;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;

public class Comment {
    private long commentID;
    private long commentAutorID;
    private long parentCommentID;
    private String textComment;
    private Timestamp timeOfComment;
}
