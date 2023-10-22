package com.example.BackendPro;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
@RestController
@RequestMapping
@ResponseBody
@RequiredArgsConstructor

public class InviteLink {
    @RequestMapping Mapping(value="/invite", method = RequestMethod.POST)
    public String init (@RequestBody HashMap<String, Object> map){

    return;
    }

}
