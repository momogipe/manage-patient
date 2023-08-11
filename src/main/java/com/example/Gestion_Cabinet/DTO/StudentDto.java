package com.example.Gestion_Cabinet.DTO;

import com.example.Gestion_Cabinet.Entities.Course;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class StudentDto {
    private String name;
    private  Long age;
    private  String dpt;
    private List<Course> courses;
}
