package academy.tochkavhoda.figures.v1;

public class ColoredRectangle extends Rectangle {
    private int color;

    // 1. Конструктор по координатам углов и цвету (Point)
    public ColoredRectangle(Point topLeft, Point bottomRight, int color) {
        super(topLeft, bottomRight);
        this.color = color;
    }

    // 2. Конструктор по координатам углов и цвету (int)
    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color) {
        super(xLeft, yTop, xRight, yBottom);
        this.color = color;
    }

    // 3. Конструктор по длине, ширине и цвету
    public ColoredRectangle(int length, int width, int color) {
        super(length, width);
        this.color = color;
    }

    // 4. Конструктор с размерами (1, 1) и указанным цветом
    public ColoredRectangle(int color) {
        super(1, 1); // Используем конструктор с длиной и шириной
        this.color = color;
    }

    // 5. Конструктор без параметров (размеры 1x1, цвет 1)
    public ColoredRectangle() {
        this(1); // Используем конструктор с цветом
    }

    // 6. Возвращает левую верхнюю точку (наследуется из Rectangle)
    @Override
    public Point getTopLeft() {
        return super.getTopLeft();
    }

    // 7. Возвращает правую нижнюю точку (наследуется из Rectangle)
    @Override
    public Point getBottomRight() {
        return super.getBottomRight();
    }

    // 8. Возвращает цвет
    public int getColor() {
        return color;
    }

    // 9. Устанавливает левую верхнюю точку (наследуется из Rectangle)
    @Override
    public void setTopLeft(Point topLeft) {
        super.setTopLeft(topLeft);
    }

    // 10. Устанавливает правую нижнюю точку (наследуется из Rectangle)
    @Override
    public void setBottomRight(Point bottomRight) {
        super.setBottomRight(bottomRight);
    }

    // 11. Устанавливает цвет
    public void setColor(int color) {
        this.color = color;
    }

    // 12. Возвращает длину (наследуется из Rectangle)
    @Override
    public int getLength() {
        return super.getLength();
    }

    // 13. Возвращает ширину (наследуется из Rectangle)
    @Override
    public int getWidth() {
        return super.getWidth();
    }

    // 14. Перемещает прямоугольник на (dx, dy) (наследуется из Rectangle)
    @Override
    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    // 15. Изменяет размер прямоугольника в ratio раз (наследуется из Rectangle)
    @Override
    public void resize(double ratio) {
        super.resize(ratio);
    }

    // 16. Растягивает прямоугольник по осям (наследуется из Rectangle)
    @Override
    public void stretch(double xRatio, double yRatio) {
        super.stretch(xRatio, yRatio);
    }

    // 17. Возвращает площадь (наследуется из Rectangle)
    @Override
    public double getArea() {
        return super.getArea();
    }

    // 18. Возвращает периметр (наследуется из Rectangle)
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    // 19. Проверяет, лежит ли точка (x, y) внутри прямоугольника (наследуется из Rectangle)
    @Override
    public boolean isInside(int x, int y) {
        return super.isInside(x, y);
    }

    // 20. Проверяет, лежит ли точка (Point) внутри прямоугольника (наследуется из Rectangle)
    @Override
    public boolean isInside(Point point) {
        return super.isInside(point);
    }

    // 21. Проверяет, пересекается ли текущий прямоугольник с другим
    public boolean isIntersects(ColoredRectangle rectangle) {
        return super.isIntersects(rectangle);
    }

    // 22. Проверяет, лежит ли другой прямоугольник целиком внутри текущего
    public boolean isInside(ColoredRectangle rectangle) {
        return super.isInside(rectangle);
    }

    // 23. Методы equals и hashCode (генерируются автоматически)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ColoredRectangle that = (ColoredRectangle) obj;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color;
        return result;
    }
}
