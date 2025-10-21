package academy.tochkavhoda.figures.v1;

public class ColoredCircle extends Circle {
    private int color;

    // 1. Конструктор по координатам центра, радиусу и цвету (Point)
    public ColoredCircle(Point center, int radius, int color) {
        super(center, radius);
        this.color = color;
    }

    // 2. Конструктор по координатам центра (int), радиусу и цвету
    public ColoredCircle(int xCenter, int yCenter, int radius, int color) {
        super(xCenter, yCenter, radius);
        this.color = color;
    }

    // 3. Конструктор по радиусу и цвету (центр в начале координат)
    public ColoredCircle(int radius, int color) {
        super(radius);
        this.color = color;
    }

    // 4. Конструктор с радиусом 1 и указанным цветом (центр в начале координат)
    public ColoredCircle(int color) {
        super(1); // Используем конструктор с радиусом
        this.color = color;
    }

    // 5. Конструктор без параметров (центр в начале координат, радиус = 1, цвет = 1)
    public ColoredCircle() {
        this(1); // Используем конструктор с цветом
    }

    // 6. Возвращает координаты центра (наследуется из Circle)
    @Override
    public Point getCenter() {
        return super.getCenter();
    }

    // 7. Возвращает радиус (наследуется из Circle)
    @Override
    public int getRadius() {
        return super.getRadius();
    }

    // 8. Устанавливает координаты центра (наследуется из Circle)
    @Override
    public void setCenter(Point center) {
        super.setCenter(center);
    }

    // 9. Устанавливает радиус (наследуется из Circle)
    @Override
    public void setRadius(int radius) {
        super.setRadius(radius);
    }

    // 10. Возвращает цвет
    public int getColor() {
        return color;
    }

    // 11. Устанавливает цвет
    public void setColor(int color) {
        this.color = color;
    }

    // 12. Перемещает круг на (dx, dy) (наследуется из Circle)
    @Override
    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    // 13. Изменяет радиус круга в ratio раз (наследуется из Circle)
    @Override
    public void resize(double ratio) {
        super.resize(ratio);
    }

    // 14. Возвращает площадь (наследуется из Circle)
    @Override
    public double getArea() {
        return super.getArea();
    }

    // 15. Возвращает периметр (наследуется из Circle)
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    // 16. Проверяет, лежит ли точка (x, y) внутри круга (наследуется из Circle)
    @Override
    public boolean isInside(int x, int y) {
        return super.isInside(x, y);
    }

    // 17. Проверяет, лежит ли точка (Point) внутри круга (наследуется из Circle)
    @Override
    public boolean isInside(Point point) {
        return super.isInside(point);
    }

    // 18. Методы equals и hashCode (генерируются автоматически)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ColoredCircle that = (ColoredCircle) obj;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color;
        return result;
    }
}
