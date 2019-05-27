package com.example.demo.model.PO.base;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsBaseEntity {
    private  int id;
    private Date createTime;
    private  int createGoodsId;
    private  Date updateTime;
    private  int updateGoodsId;
    private int deleteFlag;



    public static void main(String[] args) {
        BaseEntity baseEntity = new BaseEntity();
    }
}
