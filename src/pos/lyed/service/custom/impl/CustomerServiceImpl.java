/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyed.service.custom.impl;

import pos.lyed.dao.DaoFactory;
import pos.lyed.dao.custom.CustomerDao;
import pos.lyed.dto.CustomerDto;
import pos.lyed.service.CustomerEntity;
import pos.lyed.service.custom.CustomerService;

/**
 *
 * @author DinukaThemiya
 */
public class CustomerServiceImpl implements CustomerService {

    
    public String addCustomer(CustomerDto dto) throws Exception {
        
        CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
        
        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        
        if(customerDao.addCustomer(ce)){
            return "Successfully Added";
        }else{
            return "Fail";
        }
        
        return  null;
    }
    
}
