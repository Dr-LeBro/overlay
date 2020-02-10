package com.overlay.engine.physic;

import javafx.geometry.Point2D;
import javafx.scene.shape.Shape;

public class Hitbox {
    private double sizeX;
    private double sizeY;
    private Shape shape;
    private Point2D coord;

    void Hitbox(double x, double y, Shape shape){
        this.shape = shape;
        this.coord = new Point2D(x, y);
    }
}
