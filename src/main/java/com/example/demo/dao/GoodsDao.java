package com.example.demo.dao;

import com.example.demo.model.PO.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GoodsDao {
    @Insert("insert into goods (goodsnmae,number,price,createTime,updateTime,addGoodsId,updateGoodsId,deleteFlag)values(#{goodsname}, #{number},#{price},#{createTime},#{updateTime},#{createGoodsId},#{updateGoodsId},#{deleteFlag}) ")
    void addGoods(Goods goods);

    @Select("select * from goods where goodsname = #{goodsname}")
    Goods  getGoodsBygoodsName(String goodsname);

    @Delete("delete from goods where goodsname = #{goodsname}")
    int  deleteByGoodsName(String goodsname);

    @Update("update goods set  number= #{number},price=#{price} where goodsname= #{goodsname}")
    void updateByGoodsName(Goods goods);
}
