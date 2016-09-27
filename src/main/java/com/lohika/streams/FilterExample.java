package com.lohika.streams;

import com.lohika.streams.helpers.Helper;
import com.lohika.streams.helpers.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class FilterExample {
    public static void main(String[] args) {
        System.out.println("Hello from Igor!");
        List<User> users = Helper.populateUsers();

        // Filter and print users which are older that 40 years
        System.out.println("Users, older that 40 years:");
        users.stream().filter(user -> user.getAge() > 40).forEach(System.out::println);

        // Filter and collect users which are older that 40 years
        System.out.println("\nUsers, older that 40 years:");
        List<User> filteredUsers = users.stream().filter(user -> user.getAge() > 40).collect(Collectors.toList());
        filteredUsers.stream().forEach(System.out::println);

        // Find and print all women
        System.out.println("\nWomen:");
        users.stream().filter(user -> user.getGender().equals(User.Gender.FEMALE)).forEach(System.out::println);

        // Find users which lastname starts with B symbol
        users.stream().filter(user -> user.getLastName().startsWith("B")).forEach(System.out::println);

        // Find count of female users
        long count = users.stream().filter(user -> user.getGender().equals(User.Gender.FEMALE)).count();
        System.out.println(count);

    }


}
