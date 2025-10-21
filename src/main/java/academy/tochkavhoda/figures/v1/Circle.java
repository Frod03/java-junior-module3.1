package academy.tochkavhoda.figures.v1;

public class Circle {
    private Point center;
    private int radius;

    // 1. Конструктор по координатам центра и радиусу
    public Circle(Point center, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.center = new Point(center.getX(),center.getY());
        this.radius = radius;
    }

    // 2. Конструктор по координатам центра (int) и радиусу
    public Circle(int xCenter, int yCenter, int radius) {
        this(new Point(xCenter, yCenter), radius);
    }

    // 3. Конструктор по радиусу (центр в начале координат)
    public Circle(int radius) {
        this(0, 0, radius);
    }

    // 4. Конструктор без параметров (центр в начале координат, радиус = 1)
    public Circle() {
        this(1); // Используем конструктор с радиусом
    }

    // 5. Получить центр круга
    public Point getCenter() {
        return new Point(center.getX(),center.getY());
    }

    // 6. Получить радиус круга
    public int getRadius() {
        return radius;
    }

    // 7. Установить центр круга
    public void setCenter(Point center) {
        this.center = new Point(center.getX(),center.getY());
    }

    // 8. Установить радиус круга
    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    // 9. Переместить круг так, чтобы его центр оказался в точке (x, y)
    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    // 10. Переместить круг так, чтобы его центр оказался в точке point
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 11. Переместить круг на (dx, dy)
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    // 12. Изменить радиус круга в ratio раз
    public void resize(double ratio) {
        int newRadius = (int) (radius * ratio);
        if (newRadius <= 0) {
            throw new IllegalArgumentException("New radius must be positive.");
        }
        radius = newRadius;
    }

    // 13. Получить площадь круга
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 14. Получить периметр окружности (длину окружности)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // 15. Проверить, лежит ли точка (x, y) внутри круга
    public boolean isInside(int x, int y) {
        double distanceSquared = Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2);
        return distanceSquared <= radius * radius;
    }

    // 16. Проверить, лежит ли точка point внутри круга
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 17. Методы equals и hashCode (генерируются автоматически)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        int result = center.hashCode();
        result = 31 * result + radius;
        return result;
    }

}
