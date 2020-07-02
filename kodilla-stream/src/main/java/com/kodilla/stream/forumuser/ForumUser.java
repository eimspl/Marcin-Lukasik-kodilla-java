//7.3
package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;
    private final Sex sex;

    public ForumUser(final int userID, final String userName, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts, final Sex sex) {
        //if(!"MF".contains(sex + ""))
        //    throw new IllegalStateException("Sex should be F or M");
        this.userID = userID;
        this.userName = userName;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
        this.sex = sex;
    }

    public int getUserID() {
        return userID;
    }

    public String userName(){
        return userName;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return
                ", name: '" + userName + '\'' +
                        ", sex: " + sex +
                        ", dateOfBirth: " + dateOfBirth +
                        ", numberOfPosts: " + numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID &&
                sex == forumUser.sex &&
                numberOfPosts == forumUser.numberOfPosts &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, sex, dateOfBirth, numberOfPosts);
    }
}