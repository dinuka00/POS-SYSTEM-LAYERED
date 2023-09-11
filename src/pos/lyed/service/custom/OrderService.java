/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyed.service.custom;

import pos.lyed.dto.OrderDto;
import pos.lyed.service.SuperService;


/**
 *
 * @author DinukaThemiya
 */
public interface OrderService extends SuperService{
    
    String placeOrder(OrderDto dto) throws Exception;
    
}
