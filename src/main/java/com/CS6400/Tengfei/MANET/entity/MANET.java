package com.CS6400.Tengfei.MANET.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MANET {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long MANETId;
    private int ownerId;
    private String MANETIp;
    private String createTime;
    private String capacity;
    private String MANETRange;
    private String location;
    private int number;
}
