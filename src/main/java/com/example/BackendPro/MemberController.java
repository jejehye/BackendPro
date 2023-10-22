package com.example.BackendPro;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@RestController
@RequestMapping
@ResponseBody
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;

    @PostMapping(value = "/inviteLink")
    public String
}
