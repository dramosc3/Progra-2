package com.curso.estudiantes.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.curso.estudiantes.model.Student;
import com.curso.estudiantes.repository.StudentRepository;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;





@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    void testGetAllStudents() {
        // Arrange
        List<Student> students = Arrays.asList(
                new Student(1L, "John Doe", "john.doe@example.com"),
                new Student(2L, "Jane Smith", "jane.smith@example.com")
        );
        when(studentRepository.findAll()).thenReturn(students);

        // Act
        List<Student> result = studentService.findAll();
        assertEquals(students.size(), result.size());
        assertNotNull(result);
        assertTrue(result.containsAll(students));
        verify(studentRepository).findAll();


    }
}