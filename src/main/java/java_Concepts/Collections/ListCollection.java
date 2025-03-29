package java_Concepts.Collections;

import java.util.*;

public class ListCollection {
    public static void main(String[] args) {

        System.out.println("List - ArrayList :"+returnArrayList());
        System.out.println("List - LinkedList :"+returnLinkedList());
        System.out.println("Set - LinkedHashSet :"+returnLinkedHashSet());
        System.out.println("Set - HashSet :"+returnLinkedHashSet());
        System.out.println("Set - TreeSet :"+returnTreeSet());
        System.out.println("Map - HashMap :"+returnHashMap() );
        System.out.println("Map - TreeMap :"+returnTreeMap());
        System.out.println("Map - LinkedHashMap :"+returnLinkedHashMap());

    }

    public static List<String> returnArrayList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Naveen");
        stringList.add("Christy");
        stringList.add("Kala");
        stringList.add("Yuva");

        return stringList;
    }

    public static List<String> returnLinkedList(){
        List<String> stringList = new LinkedList<>();
        stringList.add("Naveen");
        stringList.add("Christy");
        stringList.add("Kala");
        stringList.add("Yuva");

        return stringList;
    }

    public static Set<String> returnSetHashSet(){
        Set<String> stringList = new HashSet<>();
        stringList.add("Naveen");
        stringList.add("Christy");
        stringList.add("Kala");
        stringList.add("Yuva");

        return stringList;
    }

    public static Set<String> returnLinkedHashSet(){
        Set<String> stringList = new LinkedHashSet<>();
        stringList.add("Naveen");
        stringList.add("Christy");
        stringList.add("Kala");
        stringList.add("Yuva");

        return stringList;
    }

    public static Set<String> returnTreeSet(){
        Set<String> stringList = new TreeSet<>();
        stringList.add("Naveen");
        stringList.add("Christy");
        stringList.add("Kala");
        stringList.add("Yuva");

        return stringList;
    }

    public static Map<String,String> returnHashMap(){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Me","Naveen");
        stringMap.put("Wife","Christy");
        stringMap.put("Mother","Kala");
        stringMap.put("Sister","Yuva");

        return stringMap;
    }

    public static Map<String,String> returnTreeMap(){
        Map<String,String> stringMap = new TreeMap<>();
        stringMap.put("Me","Naveen");
        stringMap.put("Wife","Christy");
        stringMap.put("Mother","Kala");
        stringMap.put("Sister","Yuva");

        return stringMap;
    }

    public static Map<String,String> returnLinkedHashMap(){
        Map<String,String> stringMap = new LinkedHashMap<>();
        stringMap.put("Me","Naveen");
        stringMap.put("Wife","Christy");
        stringMap.put("Mother","Kala");
        stringMap.put("Sister","Yuva");

        return stringMap;
    }
}
