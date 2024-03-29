package com.yi.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SingAPIController {

    @GetMapping("/api/signUp")
    public List<String> singUp(){
        return Arrays.asList("Server", "view");
        // return 형식은 rest api 를 통해 프론트로 json 형태의 데이터를 넘겨주기 때문에 이런 식으로 하면 좋음
    }

}
