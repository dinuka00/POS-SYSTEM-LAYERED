/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyed.service.custom;

import pos.lyed.dto.CustomerDto;
import pos.lyed.service.SuperService;

/**
 *
 * @author DinukaThemiya
 */
public interface CustomerService extends SuperService{
    
    String addCustomer(CustomerDto customerDto) throws Exception;
    
}
