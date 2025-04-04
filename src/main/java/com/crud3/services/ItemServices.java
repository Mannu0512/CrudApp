package com.crud3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud3.entity.Item;
import com.crud3.repo.ItemRepository;

@Service
public class ItemServices {
	
	@Autowired
    private ItemRepository repository;
	
	public List<Item> findAll() {
        return (List<Item>) repository.findAll();
    }

    public Item save(Item item) {
        return repository.save(item);
    }

    public String deleteById(Long id) {
        repository.deleteById(id);
		return "Delete successfuly....";
    }

    public Optional<Item> findById(Long id) {
        return repository.findById(id);
    }

}
