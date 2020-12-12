package com.pma.testDynamoDB.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {

    private String studentId;
    private String firstName;
    private String lastName;
}
