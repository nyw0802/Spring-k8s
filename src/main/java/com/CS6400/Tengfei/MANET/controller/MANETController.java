package com.CS6400.Tengfei.MANET.controller;

import com.CS6400.Tengfei.MANET.entity.MANET;
import com.CS6400.Tengfei.MANET.service.MANETService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manet")
@Slf4j
public class MANETController {

    @Autowired
    private MANETService manetService;

    @PostMapping("/")
    public MANET saveMANET(@RequestBody MANET manet){
        log.info("inside saveMANET method of MANETController");
        return manetService.saveMANET(manet);
    }

    @GetMapping("/{id}")
    public MANET findMANETById(@PathVariable("id") Long MANETId){
        log.info("inside findMANETById method of MANETController\"");
        return manetService.findMANETById(MANETId);
    }
}
