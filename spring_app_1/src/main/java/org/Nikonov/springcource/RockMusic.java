package org.Nikonov.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music{
    private String name;
    private int volume;
    List <String> listRock = new ArrayList<>();
    {
        listRock.add("Rock 1");
        listRock.add("Rock 2");
        listRock.add("Rock 3");
    }
   /* public void setListRock(List<RockMusic> listRock) {
        this.listRock = listRock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }*/

    @Override
    public List<String> getSong() {
        return listRock;
    }
}
