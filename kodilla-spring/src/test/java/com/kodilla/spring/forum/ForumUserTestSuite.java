package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Autowired
    private ForumUser forumUser;

    @Test
    public void testGetUsername() {
        // Given
        // ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        // ForumUser forumUser = context.getBean(ForumUser.class);
        // Autowired to realizuje razem ze SBT
        // When
        String username = forumUser.getUsername();
        // Then
        Assert.assertEquals("John Smith", username);
    }
}