package com.itqiankun;

/**
 * @author: ma_qiankun
 * @date: 2023/3/20
 **/
public interface OrderListener {
    public void listenCreate(OrderEvent event);
    public void listenFinish(OrderEvent event);
}
