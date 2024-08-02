package com.assignment.BajajFinserv.controller;
import com.assignment.BajajFinserv.entity.OperationCode;
import com.assignment.BajajFinserv.entity.RequestDTO;
import com.assignment.BajajFinserv.entity.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BfhlController {

    @PostMapping("/bfhl")
    public ResponseDTO handlePostRequest(@RequestBody RequestDTO request) {
        String userId = "john_doe_17091999";
        String email = "john@xyz.com";
        String rollNumber = "ABCD123";

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        String highestAlphabet = "";

        for (String item : request.getData()) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
                if (highestAlphabet.isEmpty() || item.compareToIgnoreCase(highestAlphabet) > 0) {
                    highestAlphabet = item;
                }
            }
        }

        return new ResponseDTO(true, userId, email, rollNumber, numbers, alphabets, highestAlphabet);
    }

    @GetMapping("/bfhl")
    public OperationCode handleGetRequest(){

        return new OperationCode(1);
    }
    
}

