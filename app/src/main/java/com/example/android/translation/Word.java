package com.example.android.translation;

/**
 * Created by e6420 on 1/20/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mRomanianTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //constructor for text views -> phrases
    public Word(String defaultTranslation, String romanianTranslation) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romanianTranslation;
    }

    // constructor for text views and image -> colors, family, numbers
    public Word(String defaultTranslation, String romanianTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romanianTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getRomanianTranslation() {
        return mRomanianTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    //    check if a word has image or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
