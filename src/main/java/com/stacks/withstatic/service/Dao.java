package com.stacks.withstatic.service;

import com.stacks.withstatic.dto.SignupRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Dao {


    public SignupRequest addNewUser(SignupRequest signupRequest){
        users.add(signupRequest);
        return signupRequest;
    }































    ArrayList<SignupRequest> users ;
}
