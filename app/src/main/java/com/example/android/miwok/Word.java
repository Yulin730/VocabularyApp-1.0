package com.example.android.miwok;

/**
 * Created by yulinfeng on 3/1/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    public  Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public  Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;

    }

    public  Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage(){
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
