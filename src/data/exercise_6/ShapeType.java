package data.exercise_6;

public enum ShapeType {
    CIRCLE(new Circle(5), "circle") {
    },
    SQUARE(new Square(3.4), "square"),
    RECTANGLE(new Rectangle(20.73, 15), "rectangle");

    private final String name;

    public String getName() {
        return name;
    }


    private Shape shape;

    ShapeType(Shape shape, String name) {
        this.shape = shape;
        this.name = name;

    }

    public Shape getShape() {
        return shape;
    }

    /**
     * This method print area and perimeters of shapes.
     */
    public void print() {
        System.out.println("\nArea of " + getName() + " = " + getShape().getArea());
        System.out.println("\nPerimeter of " + getName() + " = " + getShape().getPerimeter());
    }


}
