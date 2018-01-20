package com.example.android.translation;

/**
 * Created by e6420 on 1/20/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mRomanianTranslation;

    public Word(String defaultTranslation, String romanianTranslation) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romanianTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmRomanianTranslation() {
        return mRomanianTranslation;
    }
}
