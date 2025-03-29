package com.example.testproject.controller;

import com.example.testproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping(value = "/default1")
    public String postMethod1(){
        return "hello world!";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PostMapping(value = "/member2")
    public String postMember2(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }

}
