# Design Pattern Practice

This repository contains examples and implementations of various design patterns in Java. It is structured to help developers understand and implement design patterns in real-world scenarios.

---

## Table of Contents

- [Introduction](#introduction)
- [Patterns Covered](#patterns-covered)
- [Project Structure](#project-structure)
- [How to Use](#how-to-use)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

---

## Introduction

Design patterns are proven solutions to recurring problems in software design. This repository provides hands-on examples of how these patterns can be implemented in Java.

---

## Patterns Covered

### 1. Creational Patterns
- Singleton
- Factory
- Abstract Factory
- Builder
- Prototype

### 2. Structural Patterns
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### 3. Behavioral Patterns
- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor

---

## Project Structure

```
DesignPatternPractice/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── designpatterns/
│   │               ├── creational/
│   │               ├── structural/
│   │               └── behavioral/
│   └── test/
│       └── java/
│           └── com/
│               └── designpatterns/
│
├── pom.xml
└── README.md
```

### Key Folders
- **`src/main/java/com/designpatterns/`**: Contains all design pattern implementations categorized into `creational`, `structural`, and `behavioral` packages.
- **`src/test/java/com/designpatterns/`**: Contains test cases for the design pattern implementations.

---

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/Ankit0607/DesignPatternPractice.git
   ```

2. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Build the project (if using Maven, run `mvn clean install`).

4. Navigate to the desired pattern under `src/main/java/com/designpatterns/` and explore the code.

5. Run the test cases under `src/test/java/com/designpatterns/` to see the patterns in action.

---

## Examples

### Singleton Pattern
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

**Example Code:**
```java
package com.designpatterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**Usage:**
```java
Singleton singleton = Singleton.getInstance();
```

### Factory Pattern
The Factory Pattern provides a way to create objects without specifying their exact class.

**Example Code:**
```java
package com.designpatterns.creational.factory;

public interface Shape {
    void draw();
}

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        }
        return null;
    }
}
```

**Usage:**
```java
Shape shape = ShapeFactory.getShape("circle");
shape.draw();
```

---

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch-name`).
5. Open a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

