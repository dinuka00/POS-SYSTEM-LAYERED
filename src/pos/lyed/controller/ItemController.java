/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyed.controller;

import java.util.ArrayList;
import pos.lyed.dto.CustomerDto;
import pos.lyed.dto.ItemDto;
import pos.lyed.service.ServiceFactory;
import pos.lyed.service.custom.ItemService;

/**
 *
 * @author DinukaThemiya
 */
public class ItemController {

    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String addItem(ItemDto itemDto) throws Exception {

        return itemService.addItem(itemDto);
    }

    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }

    public ItemDto getItem(String Id) throws Exception {
        return itemService.getItem(Id);
    }

}
