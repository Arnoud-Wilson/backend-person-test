package nl.novi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void testPersonWithoutNameShouldBeNamedJohn() {
        //Given (arrange)
        Person noName = new Person();
        //When (act)

        //Then (assert)
        assertEquals("John", noName.getName());
    }

    @Test
    void testAgeShouldAddOneYear() {
        //Given (arrange)
        Person pieterPost = new Person("Pieter");
        pieterPost.setAge(40);

        //When (act)
        pieterPost.age();

        //Then (assert)
        assertEquals(41, pieterPost.getAge());
    }
    @Test
    void testChildShouldBeAdded() {
        //Given (arrange)
        Person pieterPost = new Person("Pieter");
        Person childPost = new Person("Child Post");
        List<Person> children = new ArrayList<>();

        //When (act)
        pieterPost.addChild(childPost);
        children.add(childPost);

        //Then (assert)
        assertEquals(children, pieterPost.getChildren());
    }

    @Test
    void testLastNameShouldStartWithUpperCaseWhenLowerCaseWasGiven() {
        //Given (arrange)
        Person pieterPost = new Person("Pieter");

        //When (act)
        pieterPost.setLastName("post");

        //Then (assert)
        assertEquals("Post", pieterPost.getLastName());
    }

}

//TODO: Zie lesopdracht afbeelding in assets.