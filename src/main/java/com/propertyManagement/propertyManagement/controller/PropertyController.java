package com.propertyManagement.propertyManagement.controller;

import com.propertyManagement.propertyManagement.dto.PropertyDto;
import com.propertyManagement.propertyManagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.introspector.Property;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;
    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";
    }
    @GetMapping("/Bye")
    public String sayBye()
    {
        return "Bye";
    }
    @PostMapping("/save")
    public ResponseEntity<PropertyDto> save(@RequestBody PropertyDto propertyDto)
    {
        //VAR SAVEDvALUE=propertyService.saveProperty(propertyDto);
        propertyDto=propertyService.saveProperty(propertyDto);
        //System.out.println(propertyDto);
        ResponseEntity<PropertyDto> responseEntity =new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/properties")
    public ResponseEntity<List<PropertyDto>> getAllProperties()
    {
        List<PropertyDto> propertyList=propertyService.getAllProperties();
        ResponseEntity<List<PropertyDto>> responseEntity = new ResponseEntity<>(propertyList,HttpStatus.OK);
        return responseEntity;

    }

}
