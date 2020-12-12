package com.pma.testDynamoDB.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.pma.testDynamoDB.dtos.StudentDTO;
import com.pma.testDynamoDB.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

    @Autowired
    private DynamoDBMapper mapper;

    public StudentDTO insertIntoDynamoDB(StudentDTO dto) {
        Student student = new Student();
        student.setStudentId(Long.parseLong(dto.getStudentId()));
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        mapper.save(student);
        return convertDto(student);
    }

    public StudentDTO convertDto(Student student) {
        return new StudentDTO(
                student.getStudentId().toString(),
                student.getFirstName(),
                student.getLastName()
        );
    }
}
