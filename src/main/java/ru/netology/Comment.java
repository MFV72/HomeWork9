package ru.netology;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;

public class Comment {
    long commentID;
    long commentAutorID;
    long parentCommentID;
    String textComment;
    Timestamp timeOfComment;
}
