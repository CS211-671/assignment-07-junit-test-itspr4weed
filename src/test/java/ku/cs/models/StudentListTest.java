package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
    }

    @Test
    @DisplayName("User should be able to find student's data by id")
    void testFindStudentById() {
        students.addNewStudent("6610400001", "Jack", 50);
        students.addNewStudent("6610400002", "Jeng", 40);
        assertEquals("Jack", students.findStudentById("6610400001").getName());
        assertEquals(40, students.findStudentById("6610400002").getScore());
    }

    @Test
    @DisplayName("User should be able to give score to specific id")
    void giveScoreToId() {
        students.addNewStudent("6610400001", "John", 50);
        students.giveScoreToId("6610400001", 20);
        assertEquals(70, students.findStudentById("6610400001").getScore());
    }

    @Test
    @DisplayName("User should be able to view grade of specific id")
    void viewGradeOfId() {
        students.addNewStudent("6610400001", "John", 85);
        assertEquals("A", students.viewGradeOfId("6610400001"));
    }
}