package com.shahul.learn.springdatajpa.learnspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShipperCommandLineRunner implements CommandLineRunner{
    
    @Autowired
    private ShipperSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        //insert line
        repository.save(new SpecialShipperTable("115423", 
                       "2007-09-24-15.53.37.2162474",
                       "vvs5fjf",
                       (short)540));

    }

    

}
