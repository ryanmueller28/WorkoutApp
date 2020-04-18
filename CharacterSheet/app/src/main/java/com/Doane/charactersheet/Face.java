package com.Doane.charactersheet;

/**
 * The class to load in the faces for the story dice for the
 * FFG Genesys and Star Wars character sheet side
 */

public class Face{
    private String name;
    private int imageResourceId;

    public static final Face[] faces = {
      new Face("DoubleAdvantage", R.drawable.doubleAdvantage),
      new Face("DoubleSuccess", R.drawable.DoubleSuccess),
      new Face("SuccessAdvantage", R.drawable.SuccessAdvantage),
      new Face("advantage", R.drawable.advantage),
      new Face("disadvantage", R.drawable.disadvantage),
      new Face("failure", R.drawable.failure),
      new Face("failureDisadvantage", R.drawable.failureDisadvantage),
      new Face("doubleFailure", R.drawable.doubleFailure),
      new Face("success", R.drawable.success),
      new Face("triumph", R.drawable.triumph),
      new Face("despair", R.drawable.despair),
      new Face("doubleAdvantage", R.drawable.doubleAdvantage)
    };

    private Face(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }
    public int getImageResourceId() { return imageResourceId; }
}