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
}
