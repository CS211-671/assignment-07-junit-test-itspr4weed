package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeEach
    void init() {
        s = new Student("661040xxxx", "John", 50);
    }

    @Test
    void testChangeName() {
        String testName = "Johny";
        s.changeName(testName);
        assertEquals(testName, s.getName());
    }

    @Test
    void testAddScore() {
        s = new Student("661040xxxx", "Johny");
        s.addScore(40);
        assertEquals(40, s.getScore());
        s.addScore(30);
        assertEquals(70, s.getScore());
    }

    @Test
    void testCalculateGrade() {
        s.addScore(10);
        assertEquals("C", s.grade());
    }

    @Test
    void testIsId() {
        String testId = "661040xxxx";
        assertTrue(s.isId(testId));
    }
}