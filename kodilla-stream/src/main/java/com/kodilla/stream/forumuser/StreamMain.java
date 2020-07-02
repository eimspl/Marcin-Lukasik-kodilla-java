//7.3
package com.kodilla.stream.forumuser;

import java.time.*;

import java.util.Map;
import java.util.stream.Collectors;
public class StreamMain {

    public static void main(String[] args) {
        Forum forumUserList = new Forum();
        Map<Integer, ForumUser> listOfForumUser = forumUserList.getUserList().stream()
                .filter(user -> user.getSex() == Sex.M)
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getNumberOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("Number of elements: " + listOfForumUser.size());
        String showMap = listOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey().toString() + entry.getValue().toString())
                .collect(Collectors.joining(",\n", "~~~\n", "\n~~~"));
        System.out.println(showMap);
    }
}