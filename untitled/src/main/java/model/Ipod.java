package model;

public interface Ipod {

    void playMusic(String musicName);
    void pauseMusic();
    void selectMusic(String musicName);
    void resumeMusic();
    void advanceMusic();
    void backMusic();
}
