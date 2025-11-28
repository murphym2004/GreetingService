package atu.ie.greetingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/health")
    public String health() {
        return "ok";
    }
    @GetMapping("/api/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + " from Service A!";
    }
}
