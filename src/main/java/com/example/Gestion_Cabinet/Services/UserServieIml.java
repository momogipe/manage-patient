package com.example.Gestion_Cabinet.Services;

import com.example.Gestion_Cabinet.Entities.Course;
import com.example.Gestion_Cabinet.Entities.Role;
import com.example.Gestion_Cabinet.Entities.Student;
import com.example.Gestion_Cabinet.Entities.User;
import com.example.Gestion_Cabinet.Register.RegistrationRequest;
import com.example.Gestion_Cabinet.Repository.CousesRepository;
import com.example.Gestion_Cabinet.Repository.StudentRepository;
import com.example.Gestion_Cabinet.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServieIml implements UserService{
    private final UserRepository userRepository;
    private final CousesRepository cousesRepository;
    private final StudentRepository studentRepository;
    @Override
    public List<User> getAlluser() {
        List<User> list=userRepository.findAll();
        return list;
    }

    @Override
    public User registerUser(RegistrationRequest registration) {
        var user= User.builder()
                .email(registration.getEmail())
                .firstname(registration.getFirstname())
                .lastname(registration.getLastname())
                .password(registration.getPassword())
                .roles(Arrays.asList(Role.builder().role("ROLE_USER").build())).build();
        var register=userRepository.save(user);
        return register;
    }

    @Override
    public User findByEmail(String email) {
        var finduser=userRepository.findByEmail(email).orElseThrow();
        return finduser;
    }

    @Override
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Course registerCourses(Course course) {
        return cousesRepository.save(course);
    }

    @Override
    public List<Course> GetFeeLessThaN(Double fee) {
        return cousesRepository.findByFeeLessThan(fee);
    }

    @Override
    public List<Student> GetNameContain(String name) {
        return studentRepository.findByNameContaining(name);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public List<Course> getAllCourse() {
        return cousesRepository.findAll();
    }

    @Override
    public Course getCourseByid(Long id) {
        return cousesRepository.findById(id).get();
    }
}
