package com.assignment.BajajFinserv.entity;
import lombok.Data;

import java.util.List;

@Data
public class ResponseDTO {
    private boolean isSuccess;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> numbers;
    private List<String> alphabets;
    private String highestAlphabet;

    public ResponseDTO(boolean isSuccess, String userId, String email, String rollNumber, List<String> numbers, List<String> alphabets, String highestAlphabet) {
        this.isSuccess = isSuccess;
        this.userId = userId;
        this.email = email;
        this.rollNumber = rollNumber;
        this.numbers = numbers;
        this.alphabets = alphabets;
        this.highestAlphabet = highestAlphabet;
    }


}


