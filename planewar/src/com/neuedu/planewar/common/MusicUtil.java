package com.neuedu.planewar.common;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 19:25
 */
public class MusicUtil extends Thread{
    private Player player;
    private File music;

    private String musicPath;
    private boolean loop;

    /**
     * 构造方法，默认不循环播放
     */
    public MusicUtil(String musicPath){
        this.musicPath = musicPath;
    }

    /**
     * 构造方法是否循环
     */
    public MusicUtil(String musicPath,boolean loop){
        this(musicPath);
        this.loop = loop;
    }

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        super.run();
        try{
            if(loop){
                while (true){
                    play();
                }
            }else {
                play();
            }
        }catch (FileNotFoundException| JavaLayerException e){
            e.printStackTrace();
        }
    }

    /**
     * 播放方法
     */
    private void play() throws FileNotFoundException,JavaLayerException{
        BufferedInputStream buffer = new BufferedInputStream(
                MusicUtil.class.getClassLoader().getResourceAsStream(musicPath)
        );
        player = new Player(buffer);
        player.play();
    }

    /**
     * 测试类
     */
    public static void main(String[] args) {
        MusicUtil mu = new MusicUtil("com/neuedu/planewar/video/我还有点小糊涂-原声带-1772515578-0.mp3",true);
        mu.start();
    }
}
