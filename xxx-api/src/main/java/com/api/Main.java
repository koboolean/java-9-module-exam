package com.api;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        try {
            Class<Person> personClass = Person.class;
            Field name = personClass.getDeclaredField("name");
            name.setAccessible(true); // 리플렉션을 통한 접근 허용
            name.set(person, "Koboolean");
            System.out.println("Reflection Succeeded: " + person);
        } catch (Throwable e) {
            System.out.println("Reflection Failed: " + e.getMessage());
        }
    }
}

class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}
