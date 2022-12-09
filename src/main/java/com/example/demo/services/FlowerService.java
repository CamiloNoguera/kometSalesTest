package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.FlowerModel;
import com.example.demo.models.FlowerModelGet;

@Service
public class FlowerService {
    static List<FlowerModel> flowerModelList;

    static List<FlowerModel> flowerPriceList;

    static List<FlowerModel> flowerByNameList;

    static List<FlowerModelGet> allFlowers;
    
    public List<FlowerModelGet> getAllFlower(){
        FlowerModelGet flowerModelGet = new FlowerModelGet();
        allFlowers = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            flowerModelGet.setName(flowerModelList.get(i).getName() + "-kometsales");
            flowerModelGet.setPrice(flowerModelList.get(i).getPrice());
            allFlowers.add(flowerModelGet);
        }
        
        return allFlowers;
    }

    public List<FlowerModel> SaveFlower(List<FlowerModel> flowerList){
        FlowerModel flowerModel = new FlowerModel();
        flowerModelList = new ArrayList<>();

        for(int i=0; i<flowerList.size();i++){
            // flowerModelList.get(i).setId(flowerList.get(i).getId());
            // flowerModelList.get(i).setName(flowerList.get(i).getName());
            // flowerModelList.get(i).setPrice(flowerList.get(i).getPrice());
            flowerModel.setId(flowerList.get(i).getId());
            flowerModel.setName(flowerList.get(i).getName());
            flowerModel.setPrice(flowerList.get(i).getPrice());
            flowerModelList.add(flowerModel);
        }
        return flowerModelList;
    }

    public List<FlowerModel> getFlowerPrice(){
        FlowerModel flowerModel = new FlowerModel();
        flowerPriceList = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            if(flowerModelList.get(i).getPrice() > 20){
                flowerModel.setId(flowerModelList.get(i).getId());
                flowerModel.setName(flowerModelList.get(i).getName());
                flowerModel.setPrice(flowerModelList.get(i).getPrice());
                flowerPriceList.add(flowerModel);
            }
        }
        return flowerPriceList;
    }

    public Boolean deleteFlower(Long id){
        if(flowerModelList.get(0).getId() == id){
            flowerModelList.clear();
            return true;
        }
        return false;
    }

    public List<FlowerModel> getFlowerByName(String name){
        FlowerModel flowerModel = new FlowerModel();
        flowerByNameList = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            if(flowerModelList.get(i).getName().equals(name)){
                flowerModel.setId(flowerModelList.get(i).getId());
                flowerModel.setName(flowerModelList.get(i).getName());
                flowerModel.setPrice(flowerModelList.get(i).getPrice());
                flowerByNameList.add(flowerModel);
            }
        }
        return flowerByNameList;
    }
}
