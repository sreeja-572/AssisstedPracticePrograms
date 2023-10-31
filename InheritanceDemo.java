package AssistedPractice;

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class cat extends Animal {
    void speak() {
        System.out.println("cat says meow!");
    }
}

// Multiple Inheritance
class Bird {
    void shouts() {
        System.out.println("Bird shouts");
    }
}

class sparrow extends Bird {
    void speak() {
        System.out.println("sparrow says Sings!");
    }
}

// Multi-Level Inheritance
class Reptile {
    void hiss() {
        System.out.println("Reptile hisses");
    }
}

class Snake extends Reptile {
    void speak() {
        System.out.println("Snake says Sssssss!");
    }
}

class reptile1 extends Snake {
    void speak() {
        System.out.println("reptile1 says Sssssss!");
    }
}

// Hierarchical Inheritance
class dog extends Animal {
    void speak() {
        System.out.println("dog says bow!");
    }
}

class Lion extends Animal {
    void speak() {
        System.out.println("Lion roars!");
    }
}

// Hybrid Inheritance (Combining multiple forms)
class puppy extends dog {
    void speak() {
        System.out.println("puppy bark!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        cat c = new cat();
        sparrow s = new sparrow();
        reptile1 r = new reptile1();
        dog d = new dog();
        Lion l = new Lion();
        puppy p = new puppy();

        c.speak();      // Single Level Inheritance
        s.speak();   // Multiple Inheritance
        r.speak();   // Multi-Level Inheritance
        c.speak();      // Hierarchical Inheritance (Cat)
        l.speak();     // Hierarchical Inheritance (Lion)
        p.speak();  // Hybrid Inheritance
    }
}