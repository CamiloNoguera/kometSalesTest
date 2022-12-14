package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collections;
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
        allFlowers = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            FlowerModelGet flowerModelGet = new FlowerModelGet();
            flowerModelGet.setName(flowerModelList.get(i).getName() + "-kometsales");
            flowerModelGet.setPrice(flowerModelList.get(i).getPrice());
            allFlowers.add(flowerModelGet);
            
        }

        Collections.sort(allFlowers, new FlowerComparator().reversed());

        return allFlowers;
    }

    public List<FlowerModel> SaveFlower(List<FlowerModel> flowerList){
        flowerModelList = new ArrayList<>();

        for(int i=0; i<flowerList.size();i++){
            FlowerModel flowerModel = new FlowerModel();
            flowerModel.setId(flowerList.get(i).getId());
            flowerModel.setName(flowerList.get(i).getName());
            flowerModel.setPrice(flowerList.get(i).getPrice());
            flowerModelList.add(flowerModel);
        }
        return flowerModelList;
    }

    public List<FlowerModel> getFlowerPrice(){
        flowerPriceList = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            FlowerModel flowerModel = new FlowerModel();
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
        for(int i=0; i<flowerModelList.size();i++){
            if(flowerModelList.get(i).getId() == id){
                flowerModelList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<FlowerModel> getFlowerByName(String name){
        
        flowerByNameList = new ArrayList<>();

        for(int i=0; i<flowerModelList.size();i++){
            FlowerModel flowerModel = new FlowerModel();
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
