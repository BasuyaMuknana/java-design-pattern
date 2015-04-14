package basuya.muknana.pattern.adaptor;

import basuya.muknana.origin.player.AdvancedMediaPlayer;
import basuya.muknana.origin.player.MediaPlayer;
import basuya.muknana.origin.player.Mp4Player;
import basuya.muknana.origin.player.VlcPlayer;

/**
 * Created by 2904 on 2015/4/14.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
