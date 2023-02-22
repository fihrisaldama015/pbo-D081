package com.aldam.pertemuan_3;

public class Square {
        public int LengthOfSide;
        public Square(int panjang){
            this.LengthOfSide = panjang;
        }
        public int calculateArea(){
            return this.LengthOfSide*this.LengthOfSide;
        }
        public int calculatePerimeter() {
            return this.LengthOfSide*4;
        } 

        
    } 