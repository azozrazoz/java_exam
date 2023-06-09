package org.example;

public class Rectangle {
    private Integer width;
    private Integer height;

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() { return this.width; }
    public Integer getHeight() { return this.height; }
    public void setWidth(Integer width) { this.width = width; }
    public void setHeight(Integer height) { this.height = height; }
    public Integer calculateArea() {
        return this.height * this.width;
    }
}
