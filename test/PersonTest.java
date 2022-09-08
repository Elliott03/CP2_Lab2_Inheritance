import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "first1", "last1", "Mr.", 2000);
    }

    @Test
    void setFirstName() {
        p1.setFirstName("JUNIT");
        assertEquals("JUNIT", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("JUNIT");
        assertEquals("JUNIT", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("JUNIT");
        assertEquals("JUNIT", p1.getTitle());
    }

    @Test
    void fullName() {
        assertEquals("first1 last1", p1.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mr. first1 last1", p1.formalName());
    }

    @Test
    void getAge() {
        assertEquals("15", p1.getAge(2015));
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("000001,first1,last1,Mr.,2000", p1.toCSVDataRecord());
    }
}