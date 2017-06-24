package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private MediaPlayer mediaPlayer;
    private int mAudioResourceId;

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;


    }


    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    //return wheter a word has an image or not
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
