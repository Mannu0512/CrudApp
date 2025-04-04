package com.crud3.controllee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud3.entity.Item;
import com.crud3.services.ItemServices;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
    private ItemServices service;

    @GetMapping("/getAllItem")
    public List<Item> getAllItems() {
        return service.findAll();
    }

    @PostMapping("/CreateItem")
    public Item createItem(@RequestBody Item item) {
        return service.save(item);
    }

    @PutMapping("/updateItem/{id}")
    public Item updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
        item.setId(id);
        return service.save(item);
    }

    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @GetMapping("/geItemtById/{id}")
    public Optional<Item> getItem(@PathVariable("id") Long id) {
        return service.findById(id);
    }
}
