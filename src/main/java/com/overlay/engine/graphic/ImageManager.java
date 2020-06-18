package com.overlay.engine.graphic;

import javafx.scene.image.Image;


import java.io.File;

public class ImageManager extends DrawableObject{

    private Image image;
    private String name;

    public ImageManager(double width, double height, String imagePath){
        super(width, height);
        setImageName(imagePath);
        setWidth(width);
        setHeight(height);
    }

    //TODO check other tests
    public void setImageName(String imageName){
        File f = null;
        try {
            f = new File("src/main/resources/" + imageName);
        }catch (Exception e){
            System.out.println("File not loaded");
        }
        if(f != null && f.isFile()){
            name = imageName;
            System.out.println("name ok");
        }else{
            name = null;
            System.out.println("name null");
        }
    }

    @Override
    public boolean load(){
        if(isReadyToDraw()){
            image = new Image(name, width, height, false, false);
        }
        loaded = true;
        return true;
    }

    @Override
    public boolean isReadyToDraw() {
        if(!super.isReadyToDraw()) return false;
        if(name == null) return false;
        if (!imageIsFound()) return false;
        return true;
    }

    public boolean imageIsFound(){
        File f = null;
        try {
            f = new File("src/main/resources/" + name);
        }catch (Exception e){
            return false;
        }
        if(f.isFile()){
            return true;
        }else{
            return false;
        }
    }

    public boolean loadWithSize(double width, double height){
        setWidth(width);
        setHeight(height);
        return load();
    }

    public Image getImage() {
        return image;
    }
}