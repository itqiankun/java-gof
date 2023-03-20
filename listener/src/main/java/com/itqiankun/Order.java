package com.itqiankun;

import lombok.Data;

/**
 * @author: ma_qiankun
 * @date: 2023/3/20
 **/
@Data
public class Order {

    private String price;

    private OrderListener orderListener;

    public void create(OrderEvent orderEvent){
        System.out.println(price+" order create");
        orderListener.listenCreate(orderEvent);
    }

    public void finish(OrderEvent orderEvent){
        System.out.println(price+" order finish");
        orderListener.listenFinish(orderEvent);
    }

    public void setOrderListener(OrderListener orderListener) {
        this.orderListener = orderListener;
    }
}
