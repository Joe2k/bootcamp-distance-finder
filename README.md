## Title
Distance Calculator

## Description of the project
Library to calculate the distance between two points.

## How to use
```java
import com.bootcamp.app;

public class YourClass {
    public static void main(String[] args) {
        double x1 = 1.2;
        double y1 = 3.7;
        double x2 = 5;
        double y2 = 3;

        double distance = DistanceCalculator.getDistance(x1, y1, x2, y2);
    }
}
```

## Testing guide
### Build
- Run `mvn clean compile` for building the project.

### Test
- Run `mvn test` for running the tests.

## Contributors
- Nishant Mittal
- Jonathan Samuel
