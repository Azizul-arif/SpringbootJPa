package com.propertyManagement.propertyManagement.controller;

import com.propertyManagement.propertyManagement.dto.CalculatorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2)
    {
        return num1+num2;
    }
    @GetMapping("/sub/{num1}/{num2}")
    public Double sub(@PathVariable ("num1") Double num1, @PathVariable("num2") Double num2)
    {
        Double result=null;
        if(num1>num2)
        {
            return num1-num2;
        }
        else{
            return num2-num1;
        }
    }
    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDto calcdDto)
    {
        Double result=null;
        result=calcdDto.getNum1() * calcdDto.getNum2()* calcdDto.getNum3()* calcdDto.getNum4();
        ResponseEntity<Double> responseEntity =new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }

}
