package org.Nikonov.springcource;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import javax.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    List<String> listClassical = new ArrayList<>();

    {
        listClassical.add("CLASS 1");
        listClassical.add("CLASS 2");
        listClassical.add("CLASS 3");
    }

    @Override
    public List<String> getSong() {
        return listClassical;
    }


    /*private ClassicalMusic(){}*/
 /*   public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }*/




  /*  @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }*/
}
