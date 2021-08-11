package com.pavan.demo.controller;


//import com.pavan.demo.Services.MyService;
//import com.pavan.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class MyController {


    //private MyService myservice;

    @GetMapping("hello")
    public String hello(){

        return "Hello world";
    }
/*
   @GetMapping(value="cars",produces = MediaType.APPLICATION_JSON_VALUE)
      ResponseEntity<List<Car>> getCars(@RequestParam("name") String name ){
    ResponseEntity<List<Car>> getCars(){

        return ResponseEntity.ok(this.myservice.getCars());

    }

    @GetMapping(value="car",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Optional<Car>> getCar(@RequestParam("id") int id ){

        return ResponseEntity.ok(this.myservice.getCar(id));

    }

    @PostMapping("/car")
    ResponseEntity<Optional<String>> saveCar(@RequestParam("name") String name , @RequestParam("price") int price){

        return ResponseEntity.ok(this.myservice.saveCar(name,price));
    }

    @Autowired
    public MyController setMyService(MyService myservice){
        this.myservice=myservice;
        return this;
    }
    */

    /*
    You can use @Autowired annotation on setter methods to get rid of
    the <property> element in XML configuration file.
    When Spring finds an @Autowired annotation used with setter methods,
     it tries to perform byType auto wiring on the method.
     */

}

