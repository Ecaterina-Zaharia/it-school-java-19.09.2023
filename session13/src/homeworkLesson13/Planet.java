package homeworkLesson13;

// 3. Define an enum called Planet representing planets in our solar system.
// Each planet should have fields for mass and radius.
// Include a constructor to initialize these values.

public enum Planet {
    MERCURY(0.330, 2440), VENUS(4.87, 6052), EARTH(5.97, 6371), MARS(0.642, 3390),
    JUPITER(1898, 69911), SATURN(568, 58232), URANUS(86.8, 25362),
    NEPTUNE(102, 24622), PLUTO(0.0130, 1188);

    public final double mass;
    public final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
