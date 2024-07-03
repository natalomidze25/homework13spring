package org.spring.one.homework13spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("print")
    public String print(){
        return "Hello, World";
    }

    @GetMapping("name/{param}")
    public String getName(@PathVariable String param){
        return "my name is "+param;
    }
}
