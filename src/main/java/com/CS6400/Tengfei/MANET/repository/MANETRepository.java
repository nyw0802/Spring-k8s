package com.CS6400.Tengfei.MANET.repository;

import com.CS6400.Tengfei.MANET.entity.MANET;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MANETRepository extends JpaRepository<MANET, Long> {
    MANET findByMANETId(Long MANETId);
}
