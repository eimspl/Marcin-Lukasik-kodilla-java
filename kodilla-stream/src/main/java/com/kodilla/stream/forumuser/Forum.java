package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();
    public Forum() {
        forumUserList.add(new ForumUser(1, "kiper34",  1992, 1, 3, 5, Sex.F));
        forumUserList.add(new ForumUser(2, "alfons15",  1945, 4, 5, 11, Sex.M));
        forumUserList.add(new ForumUser(3, "kiker55",  2003, 5, 2, 39, Sex.F));
        forumUserList.add(new ForumUser(4, "pepper2",  2000, 1, 12, 8, Sex.M));
        forumUserList.add(new ForumUser(5, "Janina2",  1978, 6, 11, 6, Sex.M));
        forumUserList.add(new ForumUser(6, "Olaf",  2010, 3, 1, 0, Sex.M));
        forumUserList.add(new ForumUser(7, "Admin",  1993, 4, 10, 10, Sex.F));
        forumUserList.add(new ForumUser(8, "Modi43", 1991, 5, 13, 31,Sex.M));
        forumUserList.add(new ForumUser(9, "Elfina22",  1987, 6, 24, 29, Sex.F));
        forumUserList.add(new ForumUser(10, "Katalonia",  1920, 1, 5, 10, Sex.M));
        forumUserList.add(new ForumUser(11, "Misterka",  1955, 1, 16, 24, Sex.M));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}