package org.example;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map locators = new HashMap();
        locators.put("Name","Naveen Kumar");
        locators.put("Name1","Christy Sheela");

        System.out.println(locators.get("Name"));

    }
}
