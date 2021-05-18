package org.Nikonov.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic2);




/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcContext.xml"
        );*/




      /*  MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicNum musicNum = MusicNum.ROCK;
        musicPlayer.playMusic(musicNum);

*/

       // MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
      //  musicPlayer.playMusic();
      //  Music music = context.getBean("musicBean",Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);
      //  Music music = context.getBean("classicalMusic",Music.class);
       // Music music1 = context.getBean("rockMusik",RockMusic.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);

      //  MusicPlayer secondMusicPlayer = context.getBean("musicPlayerSetter",MusicPlayer.class);


     //   firstMusicPlayer.setVolume(10);

     /*   boolean comparison  = firstMusicPlayer ==secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/

       /* System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        context.close();
    }
}
