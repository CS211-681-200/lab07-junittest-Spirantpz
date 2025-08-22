package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList sl;
    @BeforeAll
    static void init() {
        sl = new StudentList();
        sl.addNewStudent("67xxxxx","test");
        sl.addNewStudent("67123", "testId");
        sl.addNewStudent("670000", "testName");
        sl.addNewStudent("6750","testScore",50);
    }

    @Test
    void testFindStudentById() {
        assertEquals("testId",sl.findStudentById("67123").getName());
    }

    @Test
    void testFilterByName() {
        StudentList s1 = sl.filterByName("testName");
        assertEquals(null,s1.findStudentById("67123"));
    }

    @Test
    void testGiveScoreToId() {
        sl.giveScoreToId("6750",50);
        assertEquals(100, sl.findStudentById("6750").getScore());
    }

    @Test
    void testViewGradeOfId() {
        assertEquals("A",sl.findStudentById("6750").getGrade());
    }
}