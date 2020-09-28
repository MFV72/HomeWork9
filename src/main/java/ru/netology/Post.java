package ru.netology;

import java.util.Date;

public class Post {
    long postID;
    long postAuthorID; //* автор
    long groupID; // в чьей группе пост
    Logo logo;
    String headerCaption;
    Date dateOfPost;
    DropDownMenu nemu;
    String textPost;
    long views;
}
