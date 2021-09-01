package com.example.support.controller;

import com.example.support.domain.NewOperation;
import com.example.support.domain.OperationBase;
import com.example.support.model.RequestBodyDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    @PostMapping
    public void getData(@RequestBody RequestBodyDTO requestBodyDTO) {
        OperationBase operationBase = OperationBase.fromDTO(requestBodyDTO);

    }
}
