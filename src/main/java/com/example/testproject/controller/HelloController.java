package com.example.testproject.controller;

import com.example.testproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class HelloController {


//    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @GetMapping(value ="/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping(value = "/name")
    public String name() {
        return "MinJoon";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String variable1(@PathVariable String variable) {
        return variable;
    }

    @GetMapping(value = "/variable2/{variable}")
    public String variable2(@PathVariable ("variable") String var) {
        return var;
    }

    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    @GetMapping(value= "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey()).append(" : ").append(map.getValue()).append("\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO){
        return memberDTO.toString();
    }


}
