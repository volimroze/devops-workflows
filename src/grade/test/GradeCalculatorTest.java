package grade.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import grade.impl.Calculation;
import grade.impl.Grade;

class GradeCalculatorTest {

    
    @Test
    void fullGrade() throws Exception {
        Grade grade = Calculation.calculateGrade(50, 10);
        
        assertTrue(grade.isApproved());
        assertEquals(30, grade.getPoints());
        assertFalse(grade.isCumLaude());
    }

    
    @Test
    void fullLabPointsAndGoodGrade() throws Exception {
        Grade grade = Calculation.calculateGrade(50, 8);
        
        assertTrue(grade.isApproved());
        assertEquals(27, grade.getPoints());
        assertFalse(grade.isCumLaude());
    }

    
    @Test
    void fullExamAndOkLabGrade() throws Exception {
        Grade grade = Calculation.calculateGrade(40, 10);
        
        assertTrue(grade.isApproved());
        assertEquals(27, grade.getPoints());
        assertFalse(grade.isCumLaude());
    }

    
    @Test
    void invalidExamGrade() throws Exception {
        assertThrows(Exception.class, () -> Calculation.calculateGrade(50, 11));
        assertThrows(Exception.class, () -> Calculation.calculateGrade(50, -1));
    }

    
    @Test
    void invalidPoints() throws Exception {
        assertThrows(Exception.class, () -> Calculation.calculateGrade(-1, 10));
    }

    
    @Test
    void notPass() throws Exception {
        Grade grade = Calculation.calculateGrade(25, 5);
        
        assertThrows(Exception.class, () -> grade.getPoints());
        assertFalse(grade.isApproved());
        assertFalse(grade.isCumLaude());
    }

    
    @Test
    void cumLaude() throws Exception {
        Grade grade = Calculation.calculateGrade(55, 10);
        
        assertTrue(grade.isApproved());
        assertEquals(30, grade.getPoints());
        assertTrue(grade.isCumLaude());
    }

    
    @Test
    void labBonus() throws Exception {
        Grade grade = Calculation.calculateGrade(60, 6);
        
        assertTrue(grade.isApproved());
        assertEquals(26, grade.getPoints());
        assertFalse(grade.isCumLaude());
    }

    
    @Test
    void roundingTest() throws Exception {
        Grade grade1 = Calculation.calculateGrade(24, 8);
        assertEquals(19, grade1.getPoints());

        Grade grade2 = Calculation.calculateGrade(35, 8);
        assertEquals(22, grade2.getPoints());

        Grade grade3 = Calculation.calculateGrade(45, 8);  
        assertEquals(25, grade3.getPoints());
    }
}
