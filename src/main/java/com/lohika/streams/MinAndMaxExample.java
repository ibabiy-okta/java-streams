package com.lohika.streams;

import com.lohika.streams.helpers.Helper;
import com.lohika.streams.helpers.User;

import java.util.Comparator;
import java.util.List;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class MinAndMaxExample {
    public static void main(String[] args) {
        List<User> users = Helper.populateUsers();

        // Find the youngest person
        User user = users.stream().min(Comparator.comparing(User::getAge)).get();
        System.out.println("The youngest: " + user);


        // Find the oldest person
        user = users.stream().max(Comparator.comparing(User::getAge)).get();
        System.out.println("The oldest: " + user);


        // Find user with the longest last name
        user = users.stream().max(Comparator.comparing(u -> u.getLastName().length())).get();
        System.out.println("The longest last name: " + user);
    }
}
