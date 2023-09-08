/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyed.dao.custom;

import pos.lyed.dao.SuperDao;
import pos.lyed.service.CustomerEntity;

/**
 *
 * @author DinukaThemiya
 */
public interface CustomerDao extends  SuperDao {
    
   Boolean addCustomer(CustomerEntity customerEntity) throws Exception;
    
}
