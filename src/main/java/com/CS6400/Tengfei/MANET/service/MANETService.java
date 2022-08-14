package com.CS6400.Tengfei.MANET.service;

import com.CS6400.Tengfei.MANET.entity.MANET;
import com.CS6400.Tengfei.MANET.repository.MANETRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MANETService {
    @Autowired
    private MANETRepository manetRepository;

    public MANET saveMANET(MANET manet){
        log.info("inside saveMANET of MANETService");
        return manetRepository.save(manet);
    }

    public MANET findMANETById(Long MANETId){
        log.info("inside findMANETById of MANETService");
        return manetRepository.findByMANETId(MANETId);
    }
}
