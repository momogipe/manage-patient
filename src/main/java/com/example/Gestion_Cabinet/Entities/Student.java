package com.example.Gestion_Cabinet.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  Long age;
    private  String dpt;
    @ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
    @JoinTable
            (name = "Student_Courses_Table",
            joinColumns = {@JoinColumn(name="Student_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Courses_id",referencedColumnName = "id")
    })

    private List<Course> courses;
}
