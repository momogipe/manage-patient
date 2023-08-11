package com.example.Gestion_Cabinet.Services;

import com.example.Gestion_Cabinet.Entities.Course;
import com.example.Gestion_Cabinet.Entities.Student;
import com.example.Gestion_Cabinet.Entities.User;
import com.example.Gestion_Cabinet.Register.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAlluser();
    public User registerUser(RegistrationRequest registrationRequest);
    public User findByEmail( String email);
    public Student registerStudent(Student student);
    public Course registerCourses(Course course);
    public  List<Course> GetFeeLessThaN(Double fee);
    public  List<Student> GetNameContain(String name);
    public  Student  findById(Long id);
    public List<Student>   getAllStudent();
    public  List<Course> getAllCourse();
    public  Course getCourseByid(Long id);
}
