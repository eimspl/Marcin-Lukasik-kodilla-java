package com.kodilla.testing.forum.statistics;

import java.util.List;

class CalculateStatistic {

    private Statistics statistics;
    private int numbersOfUsers;
    private int numbersOfPosts;
    private int numbersOfComments;
    private double averageNumbersCommentsOfPost;
    private double averageNumbersCommentsOfUser;
    private double averageNumbersPostOfUser;

    public CalculateStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();
        numbersOfPosts = statistics.postsCount();
        numbersOfComments = statistics.commentsCount();
        if (numbersOfUsers == 0) {
            averageNumbersPostOfUser = 0.0;
            averageNumbersCommentsOfUser = 0.0;
        } else {
            averageNumbersPostOfUser = (double) numbersOfPosts / (double) numbersOfUsers;
            averageNumbersCommentsOfUser = (double) numbersOfComments / (double) numbersOfUsers;
        }
        if (numbersOfPosts == 0) {
            averageNumbersCommentsOfPost = 0.0;
        } else {
            averageNumbersCommentsOfPost = (double) numbersOfComments / (double) numbersOfPosts;
        }
    }
    public void showStatistics() {
        System.out.println("Number of users: " + numbersOfUsers);
        System.out.println("Number of posts: " + numbersOfPosts);
        System.out.println("Number of comments: " + numbersOfComments);
        System.out.println("Avarage posts per user: " + averageNumbersPostOfUser);
        System.out.println("Avarage comments per user: " + averageNumbersCommentsOfUser);
        System.out.println("Avarage comments per post: " + averageNumbersCommentsOfPost);
    }

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumberOfPosts() {
        return numbersOfPosts;
    }

    public int getNumbersOfComments() {
        return numbersOfComments;
    }

    public double getAverageNumbersCommentsOfPost() {
        return averageNumbersCommentsOfPost;
    }

    public double getAverageNumbersCommentsOfUser() {
        return averageNumbersCommentsOfUser;
    }

    public double getAverageNumbersPostOfUser() {
        return averageNumbersPostOfUser;
    }
}