package com.lohika.streams;

import com.lohika.streams.helpers.Helper;
import com.lohika.streams.helpers.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class CollectExamples {

    public static void main(String[] args) {
        System.out.println("Hello from Natasha");
        System.out.println("Hello from another girl.");
        List<User> users = Helper.populateUsers();

        // Group users by age:
        Map<Integer, List<User>> groupedUsers = users.stream().collect(Collectors.groupingBy(User::getAge));
        groupedUsers.forEach((age, people) -> System.out.format("Age=%d:  %s\n", age, people));


        // Join strings with separator, prefix and suffix
        String result = users.stream().filter(user -> user.getAge() >= 23)
                            .map(User::getFirstName).limit(5)
                            .collect(Collectors.joining(" and ", "In USA or Canada", " can buy alcohols."));
        System.out.println(result);

    }
}
