package com.Allen.store.mapper;

import com.Allen.store.entity.Order;
import com.Allen.store.entity.OrderItem;

/**
 * @author 邓志恒
 * @version 1.0
 **/
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order 订单数据
     * @return 受影响的行数
     */
    Integer insertOrder(Order order);

    /**
     * 插入订单商品数据
     * @param orderItem 订单商品数据
     * @return 受影响的行数
     */
    Integer insertOrderItem(OrderItem orderItem);
}
