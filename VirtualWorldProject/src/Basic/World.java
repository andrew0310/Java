package Basic;

import Animals.*;
import Plants.Berry;
import Plants.Grass;
import Plants.Guarana;
import Plants.Dandelion;

import java.util.*;

public class World {

    private Organism[][] organismMap;
    private List<Organism> organismList;
    private int coordinateX;
    private int coordinateY;
    private int turn;
    Set<Organism> orgSet;

    public World(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;

        this.organismMap = new Organism[coordinateX][coordinateY];
        this.organismList = new ArrayList<>();
        this.orgSet = new HashSet<>();
    }

    //public Organism[][] getOrganismMap() {
        //return organismMap;
    //}

    public void populateTheWorld() {

        int[] coords = createLocation(this.coordinateX, this.coordinateY);

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Wolf wolf = new Wolf(9, 0, 5, coords[0], coords[1]);
            organismList.add(wolf);

            organismMap[coords[0]][coords[1]] = wolf;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Antelope antelope = new Antelope(4, 0, 4, coords[0], coords[1]);
            organismList.add(antelope);

            organismMap[coords[0]][coords[1]] = antelope;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Fox fox = new Fox(3, 0, 7, coords[0], coords[1]);
            organismList.add(fox);

            organismMap[coords[0]][coords[1]] = fox;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Sheep sheep = new Sheep(4, 0, 4, coords[0], coords[1]);
            organismList.add(sheep);

            organismMap[coords[0]][coords[1]] = sheep;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Turtle turtle = new Turtle(2, 0, 1, coords[0], coords[1]);
            organismList.add(turtle);

            organismMap[coords[0]][coords[1]] = turtle;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Grass grass = new Grass(0, 0, 0, coords[0], coords[1]);
            organismList.add(grass);

            organismMap[coords[0]][coords[1]] = grass;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Guarana guarana = new Guarana(0, 0, 0, coords[0], coords[1]);
            organismList.add(guarana);

            organismMap[coords[0]][coords[1]] = guarana;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Dandelion dandelion = new Dandelion(0, 0, 0, coords[0], coords[1]);
            organismList.add(dandelion);

            organismMap[coords[0]][coords[1]] = dandelion;
        }

        while (isFree(coords) == false) {
            coords = createLocation(this.coordinateX, this.coordinateY);
        }
        if (isFree(coords)) {
            Berry berry = new Berry(99, 0, 0, coords[0], coords[1]);
            organismList.add(berry);

            organismMap[coords[0]][coords[1]] = berry;
        }
    }

    public void makeAturn() {
        this.turn = turn;
        turn++;
    }

    public void drawTheWorld() {

        for (int i = 0; i < coordinateX; i++) {
            for (int j = 0; j < coordinateY; j++) {
                if (organismMap[i][j] == null) {
                    System.out.print('-');
                } else {
                    System.out.print(organismMap[i][j].drawOrganism());
                }
            }
            System.out.println();
        }
    }

    public int[] createLocation(int x, int y) {

        int[] coordinates = new int[2];

        Random r = new Random();

        int coorX = r.nextInt(x);
        int coorY = r.nextInt(y);

        coordinates[0] = coorX;
        coordinates[1] = coorY;

        return coordinates;
    }

    public boolean isFree(int coordinates[]) {
        if (organismMap[coordinates[0]][coordinates[1]] == null) {
            return true;
        }
        return false;
    }

    public void addOrganismsToSet() {

        for (int i = 0; i < coordinateX; i++) {
            for (int j = 0; j < coordinateY; j++) {
                if (organismMap[i][j] != null) {
                    orgSet.add(organismMap[i][j]);
                }
            }
        }
    }

    public void printOrganismSet() {
        for (Organism organism : orgSet) {
            System.out.println(organism);
        }
    }
}