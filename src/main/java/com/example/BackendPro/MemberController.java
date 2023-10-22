package com.example.BackendPro;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@ResponseBody 
@RequiredArgsConstructor
@RequestMapping(value = "/invite")

public class MemberController {
    private final MemberRepository memberRepository
    @PostMapping(value = "/link") // @requestbody <body의 타입> <변수명>
    public void insertMember(@RequestBody Map<String, Object> body) {
        //String id = body.get("id").toString();
        String name = body.get("name").toString();
        String mail = body.get("mail").toString();
        String number = body.get("number").toString();// body를 맵에 담음
        MemberEntity member = new MemberEntity(); //entity에 넣어야함 -> 생성자를 집어넣음
    }

    public MemberEntity(){
    };

    @GetMapping("/link/{id}")
    public void MemberEntity<Member> UpdateCustType(){

    }

}
