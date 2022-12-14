package agh.ics.oop;

public class Grass implements IMapElement {

    private final Vector2d positione;

    public Grass(Vector2d positione) {
        this.positione = positione;
    }

    @Override
    public String getPng() {
        return "src/main/resources/TRAWA.png";
    }

    public Vector2d getPosition(){
        return this.positione;
    }

    @Override
    public String toString(){
        return "*";
    }
}
