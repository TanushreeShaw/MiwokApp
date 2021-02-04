package com.example.android.miwok;

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    private int resourceID = noImage;
    private int audioID;

    private static final int noImage = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        audioID=audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int resourceId, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        resourceID = resourceId;
        audioID=audioId;
    }

    /**
     * Get the default translation of the word.
     */

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceById()
    {
        return resourceID;
    }

    public boolean hasImage() {
        return resourceID!=noImage;
    }

    public int playaudio() {
        return audioID;
    }

}
