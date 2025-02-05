package com.pinuspintar.bootcamp.controller;

import com.pinuspintar.bootcamp.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class PertemuanKedua {

    private List<Item> items = new ArrayList<>();
    private int nextId = 1;

    //Get semua data
    @GetMapping
    public List<Item> getAllItems(){
        return items;
    }

    //Create new data
    @PostMapping
    public Item createItem(@RequestBody Item item){
        item.setId(nextId++);
        items.add(item);

        return item;
    }

    //Get data by id
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id){
        return items.stream()
                .filter(item->item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item updateItem){
        Item item = items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);

        if(item != null){
            item.setName(updateItem.getName());
        }
        return item;
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id){
        items.removeIf(item ->item.getId() == id);
        return "Item dengan id = " + id + "telah dihapus";
    }

}
