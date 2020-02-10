package com.overlay.engine.graphic;


import javafx.geometry.Point2D;

public interface DrawableObject {

    void load();

    void setSize(double width, double height);

    double getWidth();

    void setWidth(double width);

    double getHeight();

    void setHeight(double height);

    boolean isReadyToDraw();

    Point2D getPoint();

    void setPoint(double x, double y);
}

