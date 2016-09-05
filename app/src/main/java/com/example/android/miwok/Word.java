package com.example.android.miwok;

/**
 * Created by veureka on 9/1/16.
 */
public class Word {

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getSongResourceId() {
        return songResourceId;
    }

    public void setSongResourceId(int songResourceId) {
        this.songResourceId = songResourceId;
    }


    public Word(String defaultTranslation, String miwokTranslation, int mImageResourceId, int mSongResourceId) {
        setDefaultTranslation(defaultTranslation);
        setMiwokTranslation(miwokTranslation);
        setImageResourceId(mImageResourceId);
        setSongResourceId(mSongResourceId);
    }

    public Word(String defaultTranslation, String miwokTranslation, int mImageResourceId) {
        this(defaultTranslation, miwokTranslation, mImageResourceId, -1);
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        this(defaultTranslation, miwokTranslation, -1, -1);
    }

    public boolean hasImage() {
        return imageResourceId == -1? false: true;
    }

    public boolean hasSong()  {
        return songResourceId == -1? false: true;
    }

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int imageResourceId;


    private int songResourceId;

}
