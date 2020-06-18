package com.overlay.engine.graphic;

import javafx.geometry.Point2D;



public abstract class PositionableObject extends DrawableObject{

    protected Point2D baseAnchor;

    public PositionableObject(Point2D anchor, double width, double height) {
        super(width, height);
        this.baseAnchor = anchor;
    }

    public Point2D getPoint() {
        return baseAnchor;
    }

    public void setPoint(double x, double y) {
        baseAnchor = new Point2D(x,y);
    }

    @Override
    public boolean isReadyToDraw() {
        if(!super.isReadyToDraw()) return false;
        if (baseAnchor.getX() <= 0 && baseAnchor.getY() <= 0) return false;
        return true;
    }
}
