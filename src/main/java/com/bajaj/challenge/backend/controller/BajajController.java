package com.bajaj.challenge.backend.controller;

import com.bajaj.challenge.backend.model.RequestData;
import com.bajaj.challenge.backend.model.ResponseData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BajajController {

    @PostMapping("/bfhl")
    public ResponseData processData(@RequestBody RequestData requestData) {
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for (String item : requestData.getData()) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else {
                alphabets.add(item);
            }
        }

        ResponseData response = new ResponseData();
        response.setIs_success(true);
        response.setUser_id("HarshitaPanwar09102004");
        response.setEmail("harshitapanwar0910@email.com");
        response.setRoll_number("0827CI221059");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);

        return response;
    }
}
