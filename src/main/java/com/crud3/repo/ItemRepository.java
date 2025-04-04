package com.crud3.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud3.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
