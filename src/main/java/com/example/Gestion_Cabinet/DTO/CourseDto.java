
package com.example.Gestion_Cabinet.DTO;

import com.example.Gestion_Cabinet.Entities.Student;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class CourseDto {
    private  Long id;
    private String abreviation;
    private  Double fee;
    private Integer module;
    private  String title;
    List<Student> studentList;

}
