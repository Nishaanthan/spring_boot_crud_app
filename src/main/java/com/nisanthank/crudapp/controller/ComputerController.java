package com.nisanthank.crudapp.controller;

import com.nisanthank.crudapp.entity.Computer;
import com.nisanthank.crudapp.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class ComputerController {
    @Autowired
    private ComputerRepository computerRepository;

    @RequestMapping("/computers")
    public List<Computer> getComputers(){
        return computerRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Computer getSpecificCourse(@PathVariable("id") BigInteger id){
        return computerRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/computers")
    public void saveComputer(@RequestBody Computer computer) {
        computerRepository.save(computer);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{id}")
    public void deleteComputer(@PathVariable BigInteger id){
        computerRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/computers")
    public void updateComputer(@RequestBody Computer computer){
        Computer existingComputer = computerRepository.findById(computer.getComputerid()).orElse(null);
        existingComputer.setName(computer.getName());
        existingComputer.setModel(computer.getModel());
        existingComputer.setBrand(computer.getBrand());
        computerRepository.save(existingComputer);
    }

}
