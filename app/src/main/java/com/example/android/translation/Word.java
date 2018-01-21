package com.example.android.translation;

/**
 * Created by e6420 on 1/20/2018.
 */

public class Word  {

    private String mDefaultTranslation;
    private String mRomanianTranslation;
    private int mImageResorceId;

    //constructor for text views -> phrases
    public Word(String defaultTranslation, String romanianTranslation) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romanianTranslation;
    }

    // constructor for text views and image -> colors, family, numbers
    public Word(String defaultTranslation, String romanianTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romanianTranslation;
        mImageResorceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getRomanianTranslation() {
        return mRomanianTranslation;
    }
    public int getImageResourceId(){
        return mImageResorceId;
    }
}
