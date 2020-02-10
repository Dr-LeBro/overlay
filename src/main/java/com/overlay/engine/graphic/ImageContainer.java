package com.overlay.engine.graphic;

import javafx.geometry.Point2D;
import javafx.scene.layout.AnchorPane;

public class ImageContainer implements DrawableObject {

    AnchorPane container;

    void ImageContainer(){
        container = new AnchorPane();
    }

    @Override
    public void load() {

    }

    @Override
    public void setSize(double width, double height) {

    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public void setHeight(double height) {

    }

    @Override
    public boolean isReadyToDraw() {
        return false;
    }

    @Override
    public Point2D getPoint() {
        return null;
    }

    @Override
    public void setPoint(double x, double y) {

    }
}
