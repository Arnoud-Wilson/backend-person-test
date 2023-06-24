package nl.novi;

import org.testng.annotations.Test;
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
    void ageShouldAddOneYear() {
        //Given (arrange)
        Person pieterPost = new Person("Pieter");
        pieterPost.setAge(40);

        //When (act)
        pieterPost.age();

        //Then (assert)
        assertEquals(41, pieterPost.getAge());
    }


}

//TODO: Zie lesopdracht afbeelding in assets.