import java.util.Scanner;

class shape {
    protected double radius, length, width, base, height;
    protected double areaoftriangle, areaofrectangle, areaofcircle;
    protected double pie = 3.14;
    protected double volume;
    Scanner input = new Scanner(System.in);

    void display() {
        System.out.println("This is a shape");
    }
}

class circle extends shape {
    @Override
    void display() {
        System.out.println("\n--- CIRCLE ---");
        System.out.print("ENTER RADIUS: ");
        radius = input.nextDouble();
        areaofcircle = pie * radius * radius;
        System.out.println("AREA OF CIRCLE = " + areaofcircle);
    }
}

class triangle extends shape {
    @Override
    void display() {
        System.out.println("\n--- TRIANGLE ---");
        System.out.print("ENTER BASE: ");
        base = input.nextDouble();
        System.out.print("ENTER HEIGHT: ");
        height = input.nextDouble();
        areaoftriangle = 0.5 * base * height;
        System.out.println("AREA OF TRIANGLE = " + areaoftriangle);
    }
}

class rectangle extends shape {
    @Override
    void display() {
        System.out.println("\n--- RECTANGLE ---");
        System.out.print("ENTER LENGTH: ");
        length = input.nextDouble();
        System.out.print("ENTER WIDTH: ");
        width = input.nextDouble();
        areaofrectangle = length * width;
        System.out.println("AREA OF RECTANGLE = " + areaofrectangle);
    }
}

class square extends shape {
    @Override
    void display() {
        System.out.println("\n--- SQUARE ---");
        System.out.print("ENTER SIDE: ");
        length = input.nextDouble();
        System.out.println("AREA OF SQUARE = " + (length * length));
    }
}

class parallelogram extends shape {
    @Override
    void display() {
        System.out.println("\n--- PARALLELOGRAM ---");
        System.out.print("ENTER BASE: ");
        base = input.nextDouble();
        System.out.print("ENTER HEIGHT: ");
        height = input.nextDouble();
        System.out.println("AREA OF PARALLELOGRAM = " + (base * height));
    }
}

class rhombus extends shape {
    @Override
    void display() {
        System.out.println("\n--- RHOMBUS ---");
        System.out.print("ENTER DIAGONAL 1: ");
        length = input.nextDouble();
        System.out.print("ENTER DIAGONAL 2: ");
        width = input.nextDouble();
        System.out.println("AREA OF RHOMBUS = " + (0.5 * length * width));
    }
}

class trapezium extends shape {
    @Override
    void display() {
        System.out.println("\n--- TRAPEZIUM ---");
        System.out.print("ENTER BASE 1: ");
        base = input.nextDouble();
        System.out.print("ENTER BASE 2: ");
        length = input.nextDouble();
        System.out.print("ENTER HEIGHT: ");
        height = input.nextDouble();
        System.out.println("AREA OF TRAPEZIUM = " + (0.5 * (base + length) * height));
    }
}

class ellipse extends shape {
    @Override
    void display() {
        System.out.println("\n--- ELLIPSE ---");
        System.out.print("ENTER MAJOR AXIS (a): ");
        base = input.nextDouble();
        System.out.print("ENTER MINOR AXIS (b): ");
        height = input.nextDouble();
        System.out.println("AREA OF ELLIPSE = " + (pie * base * height));
    }
}

class sector extends shape {
    @Override
    void display() {
        System.out.println("\n--- SECTOR ---");
        System.out.print("ENTER RADIUS: ");
        radius = input.nextDouble();
        System.out.print("ENTER ANGLE (θ in degrees): ");
        double angle = input.nextDouble();
        System.out.println("AREA OF SECTOR = " + (pie * radius * radius * angle / 360));
    }
}

class hemisphere extends shape {
    @Override
    void display() {
        System.out.println("\n--- HEMISPHERE ---");
        System.out.print("ENTER RADIUS: ");
        radius = input.nextDouble();
        volume = (2.0 / 3.0) * pie * radius * radius * radius;
        System.out.println("VOLUME OF HEMISPHERE = " + volume);
    }
}

class squarePyramid extends shape {
    @Override
    void display() {
        System.out.println("\n--- SQUARE PYRAMID ---");
        System.out.print("ENTER BASE SIDE: ");
        base = input.nextDouble();
        System.out.print("ENTER HEIGHT: ");
        height = input.nextDouble();
        volume = (1.0 / 3.0) * base * base * height;
        System.out.println("VOLUME OF SQUARE PYRAMID = " + volume);
    }
}

class triangularPrism extends shape {
    @Override
    void display() {
        System.out.println("\n--- TRIANGULAR PRISM ---");
        System.out.print("ENTER BASE: ");
        base = input.nextDouble();
        System.out.print("ENTER HEIGHT OF TRIANGLE: ");
        height = input.nextDouble();
        System.out.print("ENTER LENGTH OF PRISM: ");
        length = input.nextDouble();
        volume = (0.5 * base * height * length);
        System.out.println("VOLUME OF TRIANGULAR PRISM = " + volume);
    }
}

class rectangularPyramid extends shape {
    @Override
    void display() {
        System.out.println("\n--- RECTANGULAR PYRAMID ---");
        System.out.print("ENTER LENGTH: ");
        length = input.nextDouble();
        System.out.print("ENTER WIDTH: ");
        width = input.nextDouble();
        System.out.print("ENTER HEIGHT: ");
        height = input.nextDouble();
        volume = (1.0 / 3.0) * length * width * height;
        System.out.println("VOLUME OF RECTANGULAR PYRAMID = " + volume);
    }
}

class tetrahedron extends shape {
    @Override
    void display() {
        System.out.println("\n--- TETRAHEDRON ---");
        System.out.print("ENTER EDGE: ");
        base = input.nextDouble();
        volume = (Math.pow(base, 3) / (6 * Math.sqrt(2)));
        System.out.println("VOLUME OF TETRAHEDRON = " + volume);
    }
}

class ellipsoid extends shape {
    @Override
    void display() {
        System.out.println("\n--- ELLIPSOID ---");
        System.out.print("ENTER a (X radius): ");
        double a = input.nextDouble();
        System.out.print("ENTER b (Y radius): ");
        double b = input.nextDouble();
        System.out.print("ENTER c (Z radius): ");
        double c = input.nextDouble();
        volume = (4.0 / 3.0) * pie * a * b * c;
        System.out.println("VOLUME OF ELLIPSOID = " + volume);
    }
}

class torus extends shape {
    @Override
    void display() {
        System.out.println("\n--- TORUS ---");
        System.out.print("ENTER MAJOR RADIUS (R): ");
        double R = input.nextDouble();
        System.out.print("ENTER MINOR RADIUS (r): ");
        double r = input.nextDouble();
        volume = (2 * pie * pie * R * r * r);
        System.out.println("VOLUME OF TORUS = " + volume);
    }
}

public class MATHNEXUS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO SHAPE CALCULATOR:");
        System.out.println("1. AREA CALCULATOR");
        System.out.println("2. VOLUME CALCULATOR");
        System.out.print("ENTER YOUR CHOICE: ");
        int mainChoice = input.nextInt();

        if (mainChoice == 1) {
            System.out.println("\n--- AREA MENU ---");
            System.out.println(
                    "1.Circle\n2.Triangle\n3.Rectangle\n4.Square\n5.Parallelogram\n6.Rhombus\n7.Trapezium\n8.Ellipse\n9.Sector\n10.Kite\n11.Equilateral Triangle\n12.Pentagon\n13.Hexagon\n14.Heptagon\n15.Octagon");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = input.nextInt();

            if (choice == 1)
                new circle().display();
            else if (choice == 2)
                new triangle().display();
            else if (choice == 3)
                new rectangle().display();
            else if (choice == 4)
                new square().display();
            else if (choice == 5)
                new parallelogram().display();
            else if (choice == 6)
                new rhombus().display();
            else if (choice == 7)
                new trapezium().display();
            else if (choice == 8)
                new ellipse().display();
            else if (choice == 9)
                new sector().display();
            else
                System.out.println("INVALID CHOICE!");

        } else if (mainChoice == 2) {
            System.out.println("\n--- VOLUME MENU ---");
            System.out.println(
                    "1.Cube\n2.Cuboid\n3.Cylinder\n4.Cone\n5.Sphere\n6.Hemisphere\n7.Square Pyramid\n8.Triangular Prism\n9.Rectangular Pyramid\n10.Tetrahedron\n11.Ellipsoid\n12.Torus");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = input.nextInt();

            if (choice == 6)
                new hemisphere().display();
            else if (choice == 7)
                new squarePyramid().display();
            else if (choice == 8)
                new triangularPrism().display();
            else if (choice == 9)
                new rectangularPyramid().display();
            else if (choice == 10)
                new tetrahedron().display();
            else if (choice == 11)
                new ellipsoid().display();
            else if (choice == 12)
                new torus().display();
            else
                System.out.println("INVALID CHOICE!");
        } else {
            System.out.println("INVALID MAIN CHOICE!");
        }
    }
}
