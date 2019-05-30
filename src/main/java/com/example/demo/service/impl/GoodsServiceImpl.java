package com.example.demo.service.impl;

import com.example.demo.dao.GoodsDao;
import com.example.demo.model.PO.Goods;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class GoodsServiceImpl implements IGoodsService {
@Autowired
    private GoodsDao goodsDao;

    public String addGoods(Goods goods){
        Date date = new Date();
        goods.setCreateTime(date);
        goods.setUpdateTime(date);
        goods.setDeleteFlag(0);


        goodsDao.addGoods(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";

    }

}



