package com.myapp.springboot.controller;

import com.myapp.springboot.model.User;
import com.myapp.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //rest api를 생성하기 위한 anotation
@RequestMapping("api/")
public class UserController {

    @Autowired // UserRepository를 inject해준다
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    } //model에서 모든내용을 list에 담에 가져온다.
}
