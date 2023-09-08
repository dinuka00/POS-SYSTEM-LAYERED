/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyed.controller;

import pos.lyed.dto.CustomerDto;
import pos.lyed.service.ServiceFactory;
import pos.lyed.service.custom.CustomerService;

/**
 *
 * @author DinukaThemiya
 */
public class CustomerController {
    
    CustomerService customerService =  (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        
      return  customerService.addCustomer(customerDto);
    }
    
}
