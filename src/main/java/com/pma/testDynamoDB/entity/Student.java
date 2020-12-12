package com.pma.testDynamoDB.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName = "student")
public class Student {

    @DynamoDBHashKey(attributeName = "studentId")
    private Long studentId;

    @DynamoDBRangeKey(attributeName = "firstName")
    private String firstName;

    @DynamoDBAttribute
    private String lastName;

}
