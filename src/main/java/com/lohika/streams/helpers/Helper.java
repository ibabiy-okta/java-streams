package com.lohika.streams.helpers;

import java.util.Arrays;
import java.util.List;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class Helper {
    public static List<User> populateUsers() {
        return Arrays.asList(new User("John", "Snow", 17, User.Gender.MALE),
                new User("Duke", "Nukem", 30, User.Gender.MALE),
                new User("John", "Smith", 40, User.Gender.MALE),
                new User("Neo", "Anderson", 35, User.Gender.MALE),
                new User("Will", "Smith", 35, User.Gender.MALE),
                new User("Corben", "Dallas", 35, User.Gender.MALE),
                new User("Lilu", "Dallas", 25, User.Gender.FEMALE),
                new User("Frodo", "Baggins", 20, User.Gender.MALE),
                new User("Saruman", "White", 60, User.Gender.MALE),
                new User("Gendalf", "Grey", 60, User.Gender.MALE),
                new User("Sasha", "Grey", 23, User.Gender.FEMALE),
                new User("Lisa", "Ann", 32, User.Gender.FEMALE),
                new User("Jesse", "Jane", 26, User.Gender.FEMALE),
                new User("Janice", "Griffith", 23, User.Gender.FEMALE),
                new User("Sylvester", "Stallone", 55, User.Gender.MALE),
                new User("Bilbo", "Baggins", 60, User.Gender.MALE),
                new User("David", "Bwoie", 68, User.Gender.MALE),
                new User("Arnold", "schwarzenegger", 68, User.Gender.MALE),
                new User("Chuck", "Norris", 99999, User.Gender.MALE),
                new User("Morgan", "Freeman", 72, User.Gender.MALE));
    }
}
