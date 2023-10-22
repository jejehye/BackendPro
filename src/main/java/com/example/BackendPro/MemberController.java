package com.example.BackendPro;
import com.example.BackendPro.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.BackendPro.MemberEntity;
import java.lang.reflect.Member;
import java.util.HashMap;
@RestController
@ResponseBody 
@RequiredArgsConstructor
@RequestMapping(value = "/invite")

public class MemberController {
    private final MemberRepository memberRepository;
중
    @PostMapping("/link")
    public Map<String, Object> insertMember(@RequestBody Member member) {
        Map<String.object> response = new HashMap<>();
        if (MemberRepository.insertMember(Member){

        }

    }
    @GetMapping("/link/{id}")
    public void MemberEntity<Member> UpdateCustType(){

    }

}
