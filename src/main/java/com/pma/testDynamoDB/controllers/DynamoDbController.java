package com.pma.testDynamoDB.controllers;

import com.pma.testDynamoDB.dtos.StudentDTO;
import com.pma.testDynamoDB.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamoDb")
public class DynamoDbController {

    @Autowired
    private StudentsService studentsService;

    @PostMapping("/save")
    public StudentDTO insertIntoDynamoDb(@RequestBody StudentDTO dto) {
        return studentsService.insertIntoDynamoDB(dto);
    }

}
