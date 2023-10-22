package com.example.BackendPro;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@ResponseBody 
@RequiredArgsConstructor
@RequestMapping(value = "/invite")

public class MemberController {
    private final MemberRepository memberRepository;
    @PostMapping(value = "/link") // @requestbody <body의 타입> <변수명>
    public String insertMember(@RequestBody Map<String, Object> body) {

        String name = body.get("name").toString();
        String mail = body.get("mail").toString();
        String number = body.get("number").toString();
        MemberEntity member = new MemberEntity(name,mail,number);
        String url = "http://localhost:8080/link/";

        memberRepository.save(member);
        return url+member.getId();

    }

    @GetMapping("/link/{id}")
    public void UpdateCustomType(){
        memberRepository.updateCust_typeByCust_typeNot();

    }

}
