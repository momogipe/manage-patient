package com.example.Gestion_Cabinet.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Courses")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String abreviation;
    private  Double fee;
    @Column(length = 11)
    private Integer module;
    private  String title;
    @ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
    @JsonBackReference
    List<Student> studentList;

}
