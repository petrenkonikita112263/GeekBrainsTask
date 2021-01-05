package com.vtb.java.setmaps.bonus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<Human, List<MobilePhone>> phoneBookList = new HashMap<>();

    public void getPhoneNumber(Human humanName) {
        if (phoneBookList.containsKey(humanName)) {
            List<MobilePhone> mobilePhones = phoneBookList.get(humanName);
            mobilePhones.forEach(System.out::println);
        } else {
            System.out.println(humanName.getFirstName() + " "
                    + humanName.getLastName() + " don't exist or don't have phone number");
        }
    }

    public void addInfo(Human human, List<MobilePhone> phoneNumber) {
        if (phoneBookList.containsKey(human)) {
            phoneBookList.get(human).add((MobilePhone) phoneNumber);
        }
        phoneBookList.put(human, phoneNumber);
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookList=" + phoneBookList +
                '}';
    }
}
