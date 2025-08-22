package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void init() {
        s = new Student("62xxxxx", "test");
    }
    @Test
    void testCalculateScore() {
        Student s = new Student("62xxxxx", "test");
        s.addScore(60);
        assertEquals("C", s.getGrade());
    }

    @Test
    @DisplayName("Add Student Score 49 and 2")
    void testAddScore() {
        Student s = new Student("67xxxxx", "test");
        s.addScore(49);
        assertEquals(49,s.getScore());
        s.addScore(2);
        assertEquals(51, s.getScore());
    }

    @Test
    void testChangeName() {
        Student s = new Student("67xxxxx" , "test");
        s.changeName("test1");
        assertEquals("test1", s.getName());
    }

    @Test
    void testIsId() {
        Student s = new Student("67123" , "test");
        assertEquals(true, s.isId("67123"));
        assertTrue(s.isId("67123"));
    }

    @Test
    void testIsNameContains() {
        Student s = new Student("67xxxxx" , "test2");
        assertEquals(true,s.isNameContains("test2"));
        assertTrue(s.isNameContains("test2"));
    }
}