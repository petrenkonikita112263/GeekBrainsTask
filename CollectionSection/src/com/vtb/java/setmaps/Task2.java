package com.vtb.java.setmaps;

import com.vtb.java.setmaps.bonus.Human;
import com.vtb.java.setmaps.bonus.MobilePhone;
import com.vtb.java.setmaps.bonus.PhoneBook;

import java.util.HashMap;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Human person1 = new Human("Duncan", "Jones");
        Human person2 = new Human("Sanjay", "Rabari");
        List<MobilePhone> phoneList1 = List.of(new MobilePhone("1842349"),
                new MobilePhone("42399432"));
        List<MobilePhone> phoneList2 = List.of(new MobilePhone("294240"));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addInfo(person1, phoneList1);
        phoneBook.addInfo(person2, phoneList2);
        Human person3 = new Human("Ray", "May");
        phoneBook.getPhoneNumber(person3);
        phoneBook.getPhoneNumber(person1);
    }
}
