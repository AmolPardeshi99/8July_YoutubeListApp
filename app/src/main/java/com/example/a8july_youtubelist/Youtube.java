package com.example.a8july_youtubelist;


public class Youtube {
    private String ytLink;
    private int ytThumbnail;

    public Youtube(String ytLink, int ytThumbnail) {
        this.ytLink = ytLink;
        this.ytThumbnail = ytThumbnail;
    }

    public String getYtLink() {
        return ytLink;
    }

    public int getYtThumbnail() {
        return ytThumbnail;
    }
}
