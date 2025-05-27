package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    //http://localhost:8080/api/v1/calculator/add?num1=2&num2=8
    @GetMapping("/add")
    public Integer add(@RequestParam("num1") Integer num1,@RequestParam("num2") Integer num2){
        return num1 + num2;
    }

    //http://localhost:8080/api/v1/calculator/subtract/90/80
    @GetMapping("subtract/{num1}/{num2}")
    public Integer subtract(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2){
        return num1-num2;
    }

    //http://localhost:8080/api/v1/calculator/multiply
    @PostMapping("/multiply")
    public  ResponseEntity<Integer> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Integer result = null;
        result = calculatorDTO.getNum1()*calculatorDTO.getNum2()*calculatorDTO.getNum3()*calculatorDTO.getNum4();
        ResponseEntity<Integer> responseEntity = new ResponseEntity<Integer>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}
