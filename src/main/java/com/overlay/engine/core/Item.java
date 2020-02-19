package com.overlay.engine.core;

import com.overlay.engine.graphic.DrawableObject;
import com.overlay.engine.physic.Hitbox;
import com.overlay.utils.Pair;
import javafx.scene.shape.Shape;

import java.util.ArrayList;

public class Item {
    private Hitbox hitbox;
    private Shape shape;
    private boolean root;
    private DrawableObject container;
    private ArrayList<Item> children;
    private Pair<Double, Double> position;

    void Item(boolean root, double x, double y, Shape shape){
        this.hitbox = null;
        this.root = root;
        this.position = new Pair(x, y);
        this.shape=shape;
    }

    public void addChild(Item child){
        if(children==null)
            children = new ArrayList();
        children.add(child);
    }

    public void removeChild(int index){
        if(index > 0 && index < children.size()){
            children.remove(index);
        }
    }

    public void removeChild(Item child){
        int index = children.indexOf(child);
        removeChild(index);
    }

    public void setSize(double x, double y){

    }

}
