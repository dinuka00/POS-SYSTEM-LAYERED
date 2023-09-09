/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyed.service.custom;

import java.util.ArrayList;
import pos.lyed.dao.custom.CustomerDao;
import pos.lyed.dto.CustomerDto;
import pos.lyed.service.SuperService;

/**
 *
 * @author DinukaThemiya
 */
public interface CustomerService extends SuperService {

    String addCustomer(CustomerDto customerDto) throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    CustomerDto getCustomer(String id) throws Exception;

    ArrayList<CustomerDto> getAllCustomer() throws Exception;

}
