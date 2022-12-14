package agh.ics.oop;

import java.util.Objects;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Vector2d {
    public final int x;
    public final int y;
    public Vector2d(int x,int y) {
        this.y = y;
        this.x = x;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public boolean precedes(Vector2d other){ return other.x >=  this.x && other.y >= this.y; }
    public boolean follows(Vector2d other){
        return this.x >= other.x && this.y >= other.y;
    }
    public Vector2d upperRight(Vector2d other){
        return new Vector2d(max(this.x,other.x),max(this.y,other.y));
    }
    public Vector2d lowerLeft(Vector2d other){
        return new Vector2d(min(this.x,other.x),min(this.y,other.y));
    }
    public Vector2d add( Vector2d other) {
        return new Vector2d(this.x+other.x,this.y + other.y);
    }
    public Vector2d subtract( Vector2d other) {
        return new Vector2d(this.x-other.x,this.y-other.y);
    }
    @Override
    public boolean equals(Object other){
        if (other instanceof Vector2d){
            return ((Vector2d) other).x == this.x && ((Vector2d) other).y == this.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
    public Vector2d opposite(){
        return new Vector2d(-this.x,-this.y);
    }
}
