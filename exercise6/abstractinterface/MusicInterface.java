interface MusicPlayer {
    void play();
    void pause();
    String getFormat();
}

class MP3Player implements MusicPlayer {
    private String fileName;

    public MP3Player(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3: " + fileName);
    }

    @Override
    public String getFormat() {
        return "MP3";
    }
}

class WAVPlayer implements MusicPlayer {
    private String fileName;

    public WAVPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing WAV: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV: " + fileName);
    }

    @Override
    public String getFormat() {
        return "WAV";
    }
}

public class MusicInterface{
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player("song.mp3");
        MusicPlayer wav = new WAVPlayer("audio.wav");

        mp3.play();
        mp3.pause();
        System.out.println("Format: " + mp3.getFormat());

        wav.play();
        wav.pause();
        System.out.println("Format: " + wav.getFormat());
    }
}