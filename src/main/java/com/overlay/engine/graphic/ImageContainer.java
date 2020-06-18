package com.overlay.engine.graphic;

import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class ImageContainer extends PositionableObject {

    ImageView imageView;
    ImageManager imageManager;
    Node clip;

    public ImageContainer(Point2D anchor, double width, double height, ImageManager imageManager) {
        super(anchor, width, height);
        this.imageManager = imageManager;
        imageView = new ImageView();
    }

    public ImageContainer(Point2D anchor, double width, double height, String imageName) {
        super(anchor, width, height);
        this.imageManager = new ImageManager(width, height, imageName);
        imageView = new ImageView();
    }

    @Override
    public boolean load() {
        if(!super.load()) return false;
        if (imageManager.getWidth() > width ) imageManager.setWidth(width);
        if (imageManager.getHeight() > height ) imageManager.setHeight(height);
        if (!imageManager.load()) return false;
        imageView.setImage(imageManager.getImage());
        imageView.setX(baseAnchor.getX());
        imageView.setY(baseAnchor.getY());
        imageView.setClip(clip);
        loaded = true;
        return true;
    }


    @Override
    public boolean isReadyToDraw() {
        if(!super.isReadyToDraw()) return false;
        if(!imageManager.isReadyToDraw()) return false;
        return true;
    }

    @Override
    public Node getNode() {
        return imageView;
    }

    public ImageManager getImageManager(){
        return imageManager;
    }

    public void setClip(Node clip) {
        this.clip = clip;
    }

    public Node getClip() {
        return clip;
    }

    //TODO set another pos
    public void setClipPosition(Pos pos){
        switch (pos){
            case CENTER:
                clip.setLayoutX(imageManager.getWidth()/2);
                clip.setLayoutY(imageManager.getHeight()/2);
                break;
            case TOP_LEFT:
                clip.setLayoutX(0);
                clip.setLayoutY(0);
                break;
            case BOTTOM_LEFT:
                clip.setLayoutX(0);
                clip.setLayoutY(imageManager.getHeight());
        }
    }
}
