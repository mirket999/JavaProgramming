package day36_Inheritance.practiceTasks.planetTask;

public class Planet {
    //TASK:
    /*
    	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google

     */

    public String name;
    public int population;
    public double mass, radius, surfaceGravity, surfaceArea, volume;

    public Planet(String name, int population, double mass, double radius, double surfaceGravity, double surfaceArea, double volume) {
        this.name = name;
        this.population = population;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                '}';
    }
}
