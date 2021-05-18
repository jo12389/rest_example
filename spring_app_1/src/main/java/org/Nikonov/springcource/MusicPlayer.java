package org.Nikonov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    /*    Music music;
    ClassicalMusic classicalMusic;
    RockMusic rockMusic;
    @Autowired

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
        }


    public void playMusic(MusicNum musicNum){
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (musicNum == MusicNum.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }*/

    /* private Music music1;
    private Music music2;*/

   /* @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/


/*
    private int volume;
    private String name;


    public String playMusic(MusicNum musicNum) {

      return  "Playing " + music1.getSong() ;
    }*/




  /*  public void doMyInit() {
        System.out.println("Doing my initialization MusicPlayer ");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction MusicPlayer");
    }*/

   /* public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }*/



  /*  public String getName() {
        return name;
    }*/

    /*public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }*/

    //IoC



    /*public MusicPlayer() {
    }*/


  /*  public void playMusicList(){
        for(Music music : musicList ){
            System.out.println("Playing " + music.getSong());
        }*/



}

