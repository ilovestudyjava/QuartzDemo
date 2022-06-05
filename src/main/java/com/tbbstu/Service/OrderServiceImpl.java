package com.tbbstu.Service;


import com.tbbstu.Mapper.OrderMapper;
import com.tbbstu.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/6/4 20:20:17
 */

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Override
    public int saveEditOrder() {
        return orderMapper.updateOrder();
    }
}
