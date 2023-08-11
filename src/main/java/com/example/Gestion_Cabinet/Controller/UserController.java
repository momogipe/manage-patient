package com.example.Gestion_Cabinet.Controller;

import com.example.Gestion_Cabinet.Entities.Course;
import com.example.Gestion_Cabinet.Entities.Student;
import com.example.Gestion_Cabinet.Register.RegistrationRequest;
import com.example.Gestion_Cabinet.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("class")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private  final ApplicationEventPublisher publisher;



 /*   @GetMapping("")
    public  String showRegistrationForm(Model model){
        model.addAttribute("user",new RegistrationRequest());
        return "registration";
    }
    @PostMapping("")
    public String saveUser(@ModelAttribute("user") RegistrationRequest registrationRequest){
        var registration=userService.registerUser(registrationRequest);
//        publish  the verification email
        return "redirect:/registration/registration-form?success";
    }*/
    @PostMapping("/save/{student}")
    public Student SaveStudent( @RequestBody Student student){
        return userService.registerStudent(student);
    }

    @PostMapping("/save/{course}")
    public Course SaveCourse(@RequestBody Course course){
        return userService.registerCourses(course);
    }
    @GetMapping("get/{price}")
    public List<Course> getcourselessthan(@PathVariable Double price){
        return userService.GetFeeLessThaN(price);
    }
    @GetMapping("/find/{name}")
    public List<Student> getStudentNameContain(@PathVariable String name){
        return userService.GetNameContain(name);
    }
    @GetMapping("Student/find/{student_id}")
    public Student GetStudentId(@PathVariable Long student_id){
        return userService.findById(student_id);
    }
    @GetMapping("courses/find/{id}")
    public Course GetCourseId(@PathVariable Long course_id){
        return userService.getCourseByid(course_id);

    }
    @GetMapping("students")
    public List<Student> getAllStudent(){
        return userService.getAllStudent();
    }
    @GetMapping("courses")
    public List<Course> getAllCourses(){
        return userService.getAllCourse();
    }

}
