package com.lfte.cloudgateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "User Service is taking longer than expected. "+
                "Please try again";
    }

    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Departmen Service is taking longer than expected. "+
                "Please try again";
    }
}
