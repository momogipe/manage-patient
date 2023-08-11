package com.example.Gestion_Cabinet.Repository;

import com.example.Gestion_Cabinet.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CousesRepository extends JpaRepository<Course,Long> {
    List<Course> findByFeeLessThan(Double fee);

}
