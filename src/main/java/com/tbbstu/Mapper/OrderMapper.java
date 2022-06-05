package com.tbbstu.Mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;

@Mapper
public interface OrderMapper {

    @Update("update qrtz_order set state = '取消支付'")
    int updateOrder();
}
