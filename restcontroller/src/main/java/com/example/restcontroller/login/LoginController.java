package com.example.restcontroller.login;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class LoginController {

    @GetMapping(value = "/login")
    public LoginResponse login(@RequestParam String name){
        return new LoginResponse("ab");
    }

    @PostMapping("/add")
    public ResponseEntity<Void> add(@RequestBody LoginResponse loginResponse){
        System.out.println(loginResponse.name);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<LoginResponse> get(){
        return ResponseEntity.ok(new LoginResponse("raju"));
    }
    @GetMapping("/getplain")
    public LoginResponse getpain(){
        return new LoginResponse("raju");
    }

    @RequestMapping("/success")
    @ResponseBody
    public String success(){
        return "hi";
    }
}
