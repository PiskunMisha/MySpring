package ua.piskun.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


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

    private List<Music> musicList;
    private Random random = new Random(); // Для випадкового вибору

    // Змінюємо конструктор, щоб він приймав List<Music>
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    // Змінюємо метод playMusic() для випадкового відтворення
    public String playMusic() {
        int randomIndex = random.nextInt(musicList.size()); // Отримуємо випадковий індекс
        return "Playing: " + musicList.get(randomIndex).getSong(); // Відтворюємо випадкову пісню
    }
}
