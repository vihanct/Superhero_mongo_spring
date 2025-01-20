package com.example.SuperHero.Services;

import com.example.SuperHero.dto.SuperHero;
import com.example.SuperHero.dto.SuperheroRequestbody;
import com.example.SuperHero.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SuperheroServices {
    private SuperheroRepository superheroRepository;
    @Autowired
    public SuperheroServices(SuperheroRepository superheroRepository){
        this.superheroRepository = superheroRepository;
    }

    public SuperHero getSuperhero(String name,String Universe,String universe){
        if(name!=null){
            return getByName(name);
        }
        else if(null!=Universe){
            return getByUniverse(Universe);
        }
        else if(null!=universe){
            return getByuniverse(universe);
        }
        else{
            throw new RuntimeException("Not Found");
        }
    }
    private SuperHero getByuniverse(String name){
        var result=superheroRepository.findAllByuniverse(name);
        if(result.size()==0){
            throw new RuntimeException("No such superhro");
        }
        else return result.get(0); //will give first superhero of that universe
    }
    private SuperHero getByName(String name){
        var result=superheroRepository.findAllByName(name);
        if(result.size()==0){
            throw new RuntimeException("No such superhero");
        }
        else return result.get(0); //first superhero with that name
    }
    private SuperHero getByUniverse(String universe){
        var result=superheroRepository.findAllByUniverse(universe);
        if(result.size()==0){
            throw new RuntimeException("No such superhro");
        }
        else return result.get(0); //will give first superhero of that universe
    }
    private SuperHero getDummyDate(String name){
        SuperHero superhero=new SuperHero();
        superhero.setName(name);
        return superhero;
    }
    public SuperHero persistSuperhero(SuperheroRequestbody requestBody){
        SuperHero superhero = new SuperHero();
        superhero.setName(requestBody.getName());
        superhero.setPower(requestBody.getPower());
        superhero.setUniverse(requestBody.getUniverse());

        return superheroRepository.save(superhero);
    }

    public void deleteSuperhero(String name){
        superheroRepository.deleteByName(name);
    }

    public SuperHero UpdateSuperhero(String name ,SuperheroRequestbody requestBody){
        var result=superheroRepository.findAllByName(name);
        if(result.size()==0){
            throw new RuntimeException("no such superhero");
        }
        else{
            result.get(0).setName(requestBody.getName());
            result.get(0).setUniverse(requestBody.getUniverse());
            result.get(0).setPower(requestBody.getPower());
            superheroRepository.save(result.get(0));
            return result.get(0);
        }
    }
}
