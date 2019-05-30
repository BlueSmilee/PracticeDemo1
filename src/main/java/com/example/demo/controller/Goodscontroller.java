package com.example.demo.controller;

import com.example.demo.dao.GoodsDao;
import com.example.demo.model.PO.Goods;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController


public class Goodscontroller {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private IGoodsService goodsService;

    //商品增加
    @PostMapping("/addGds")
    public String addGoods(Goods goods) {
        /*Date date = new Date();
        goods.setCreateTime(date);
        goods.setUpdateTime(date);
        goods.setDeleteFlag(0);


        goodsDao.addGoods(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";
*/
        return goodsService.addGoods(goods);
    }

    //商品查找
    @GetMapping("/selectGoods")
    public Goods selectGoods(String goodsname) {
        if (goodsname == null) {
            return null;
        } else {
            Goods goodsBygoodsName = goodsDao.getGoodsBygoodsName(goodsname);
            return goodsBygoodsName;
        }

    }

    //商品删除
    @DeleteMapping("/deleteGoods")
    public String deleteGoods(String goodsname) {
        if (goodsname == null) {
            return null;

        } else {
            int number =goodsDao.deleteByGoodsName(goodsname);//number 删除几条数据
            return "{\"status\":\" " + number + " \"}";
        }
    }
    @PostMapping("/updateGds")
    public String updateGoods(Goods goods) {
        Date date = new Date();
        goods.setUpdateTime(date);

        goodsDao.updateByGoodsName(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";

    }
}
