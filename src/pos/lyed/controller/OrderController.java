/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyed.controller;

import pos.lyed.dto.OrderDetailDto;
import pos.lyed.dto.OrderDto;
import pos.lyed.service.ServiceFactory;
import pos.lyed.service.custom.OrderService;

/**
 *
 * @author DinukaThemiya
 */
public class OrderController  {
    
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception{
       return orderService.placeOrder(orderDto);
    }
    
    
}
