package com.lohika.streams;

import com.lohika.streams.helpers.Helper;
import com.lohika.streams.helpers.User;

import java.util.List;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class MapExample {
    public static void main(String[] args) {
        List<User> users = Helper.populateUsers();

        // Find sum of all user ages
        int sum = users.stream().mapToInt(User::getAge).sum();
        System.out.println("Sum of all users ages: " + sum);

        // Multiply user age by 2 and print it
        users.stream().map(user -> user.getAge() * 2).forEach(System.out::println);
    }
}
