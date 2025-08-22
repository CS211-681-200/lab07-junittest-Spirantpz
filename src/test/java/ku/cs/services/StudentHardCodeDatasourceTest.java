package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    static StudentHardCodeDatasource s;
    static StudentList sl;
    @BeforeAll
    static void init() {
        s = new StudentHardCodeDatasource();
        sl = s.readData();
    }
    @Test
    @DisplayName("test data")
    void testData() {
        assertEquals("Second",sl.findStudentById("6710400002").getName());
        assertEquals("Third",sl.findStudentById("6710400003").getName());
    }
}