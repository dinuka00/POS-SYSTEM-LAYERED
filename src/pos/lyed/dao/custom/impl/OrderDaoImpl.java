/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyed.dao.custom.impl;

import java.util.ArrayList;
import pos.lyed.dao.CrudUtil;
import pos.lyed.dao.custom.OrderDao;
import pos.lyed.entity.OrderEntity;

/**
 *
 * @author DinukaThemiya
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", t.getId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
       return false;
    }

    @Override
    public OrderEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
         return null;
    }
    
}
