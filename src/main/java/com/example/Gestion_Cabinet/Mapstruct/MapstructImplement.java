package com.example.Gestion_Cabinet.Mapstruct;

import com.example.Gestion_Cabinet.DTO.StudentDto;
import com.example.Gestion_Cabinet.Entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface MapstructImplement {
    MapstructImplement MAPPER = Mappers.getMapper(MapstructImplement.class);

    StudentDto mapToStudentDto(Student student);

    Student mapToUStudent(StudentDto studentDto);



}
