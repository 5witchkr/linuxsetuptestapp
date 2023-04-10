package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    private final TestRepository testRepository;
//
//    public TestController(TestRepository testRepository) {
//        this.testRepository = testRepository;
//    }

    @GetMapping("/test")
    public String gettest(){
       return "SETSETSETETTETETE";
    }

//    @PostMapping("/test")
//    public String posttest(){
//        testRepository.save(new TestEntity("cosjdfsfd"));
//        return "TESTTESTTEST!!!";
//    }
}
