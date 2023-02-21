package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("")
    public String welcomeMathMsg(){
        return "Welcome to math";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation division(){
       return new ArithmeticOperation("Division",2,"dividend / divider = division", new String[]{"Anti-commutativity"});
    }
    @GetMapping("/multiplication")
    public int multiplication(int multiplying1,int multiplying2){
        return multiplying1 * multiplying2;
    }
    @GetMapping("/square/{n}")
    public double square(double n){
        return Math.sqrt(n);
    }
}