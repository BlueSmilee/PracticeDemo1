package com.example.demo.model.PO;
import com.example.demo.model.PO.base.GoodsBaseEntity;
import lombok.Data;

@Data
public class Goods extends GoodsBaseEntity {
    private  String goodsname ;
    private  int  number;
    private  int price;

    public Goods(){}

    public Goods(String goodsname, int number, int price) {
        this.goodsname = goodsname;
        this.number = number;
        this.price = price;
    }



}
