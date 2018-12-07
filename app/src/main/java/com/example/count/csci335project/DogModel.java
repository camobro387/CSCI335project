package com.example.count.csci335project;

import java.util.ArrayList;
import java.util.List;

public class DogModel {
    private int imageID;
    private String name;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<DogModel> getObjectList() {
        List<DogModel> dataList = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0; i < images.length; i++) {
            DogModel dog = new DogModel();
            dog.setImageID(images[i]);
            dog.setName("Dog" + i);
            dataList.add(dog);
        }
        return dataList;
    }

    private static int[] getImages() {

        int[] images = {
                R.drawable.dog1image,
                R.drawable.dog2image,
                R.drawable.dog3image,
                R.drawable.dog4image,
                R.drawable.dog5image,
                R.drawable.dog6image
        };
        return images;
    }
}
