package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String realName;
    private final String username;

    public ForumUser(final String realName, final String username) {
        this.realName = realName;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}