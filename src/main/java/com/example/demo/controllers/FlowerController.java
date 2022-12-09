package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.FlowerModel;
import com.example.demo.models.FlowerModelGet;
import com.example.demo.services.FlowerService;

@RestController
@RequestMapping("/flower")
public class FlowerController {

    

    @Autowired
    FlowerService flowerService;

    @GetMapping("getAllFlower")
    public List<FlowerModelGet> getAllFlower(){
        return this.flowerService.getAllFlower();
    }

    @PostMapping("/save")
    public List<FlowerModel> SaveFlower(@RequestBody ArrayList<FlowerModel> flowerList){
        return this.flowerService.SaveFlower(flowerList);
    }

    @GetMapping("getFlowerPrice")
    public List<FlowerModel> getFlowerPrice(){
        return this.flowerService.getFlowerPrice();
    }

    @DeleteMapping(path = "/{id}")
    public String deleteFlower(@PathVariable("id") Long id){
        Boolean ok = this.flowerService.deleteFlower(id);

        if(ok){
            return "Se ha eliminado la flor #" + id;
        }else{
            return "No es posible eliminiar la flor #" + id;
        }
    }

    @GetMapping("/getFlowerByName")
    public List<FlowerModel> getFlowerByName(@RequestParam ("name") String name){
        return this.flowerService.getFlowerByName(name);
    }


}
