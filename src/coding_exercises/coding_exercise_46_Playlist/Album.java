package coding_exercises.coding_exercise_46_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song song = findSong(songTitle);
        if (song == null) {
            songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }
        Song songToAdd = songs.get(trackNumber - 1);
        String songToAddTitle = songToAdd.getTitle();

        for (Song song : playlist) {
            if (song.getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }
        playlist.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            return false;
        }
        for (Song song : playList) {
            if (song.getTitle().compareTo(songToAdd.getTitle()) == 0) {
                return false;
            }
        }
        playList.add(songToAdd);
        return true;
    }

    private Song findSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
}
