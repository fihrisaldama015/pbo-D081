package com.aldam.pertemuan_3;

public class Rectangle {
    public int width = 2;
    public int height = 3;

    public Rectangle(int panjang, int lebar){
        this.width = lebar;
        this.height = panjang;
    }

    public double calculateArea(){
        return this.width*this.height;
    }

    public double calculatePerimeter(){
        return 2*(this.width+this.height);
    }
}
