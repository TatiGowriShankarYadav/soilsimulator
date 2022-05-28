package com.mycom.soilsimulator;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value = "/api/add", method = RequestMethod.POST)
    @ResponseBody
    public Double getSum(@RequestBody AddRequest addRequest){
        return addRequest.getNum1() + addRequest.getNum2();
    }
    @RequestMapping(value = "/api/diff", method = RequestMethod.GET)
    @ResponseBody
    public Double getDifference(@PathParam("num1") Double num1, @PathParam("num2") Double num2){
        return num1 - num2;
    }

}
