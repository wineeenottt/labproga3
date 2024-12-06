package building;

import java.util.Objects;

public abstract class Building implements Breakable{
    private String name;

    public Building(String name) {
        this.name = name;
    }

    @Override
    public void breaks() {
        System.out.println("Я ломаюсь");
    }

    @Override
    public String toString() {
        return "Building " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(name, building.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}