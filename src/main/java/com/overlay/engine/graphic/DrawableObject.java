package com.overlay.engine.graphic;

import javafx.scene.Node;

public abstract class DrawableObject {

    protected double width;
    protected double height;
    protected boolean loaded = false;

    public DrawableObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    public boolean load() {
        if (width<=0) return false;
        if (height<=0) return false;
        return true;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
            this.width = width;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height){
            this.height = height;
    }

    public boolean isReadyToDraw() {
        if(width <= 0) return false;
        if(height <= 0) return false;
        return true;
    }

    public Node getNode(){
        return null;
    }
}
