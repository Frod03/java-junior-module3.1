package academy.tochkavhoda.figures.v1;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    // 1. Конструктор по координатам углов (Point)
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
        this.bottomRight = new Point(bottomRight.getX(), bottomRight.getY());
    }

    // 2. Конструктор по координатам углов (int)
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.topLeft = new Point(xLeft, yTop);
        this.bottomRight = new Point(xRight, yBottom);
    }

    // 3. Конструктор по длине и ширине
    public Rectangle(int length, int width) {
        this.topLeft = new Point(0, -width);
        this.bottomRight = new Point(length, 0);
    }

    // 4. Конструктор без параметров (размеры 1x1)
    public Rectangle() {
        this(1, 1); // Используем конструктор с длиной и шириной
    }

    // 5. Получить левую верхнюю точку
    public Point getTopLeft() {
        return new Point(topLeft.getX(),topLeft.getY());
    }

    // 6. Получить правую нижнюю точку
    public Point getBottomRight() {
        return new Point(bottomRight.getX(),bottomRight.getY());
    }

    // 7. Установить левую верхнюю точку
    public void setTopLeft(Point topLeft) {
        this.topLeft = new Point(topLeft.getX(),topLeft.getY());
    }

    // 8. Установить правую нижнюю точку
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = new Point(bottomRight.getX(), bottomRight.getY());
    }

    // 9. Получить длину прямоугольника
    public int getLength() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // 10. Получить ширину прямоугольника
    public int getWidth() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // 11. Переместить прямоугольник в точку (x, y)
    public void moveTo(int x, int y) {
        int dx = x - topLeft.getX();
        int dy = y - topLeft.getY();
        topLeft.moveRel(dx, dy);
        bottomRight.moveRel(dx, dy);
    }

    // 12. Переместить прямоугольник в точку (Point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13. Переместить прямоугольник на (dx, dy)
    public void moveRel(int dx, int dy) {
        topLeft.moveRel(dx, dy);
        bottomRight.moveRel(dx, dy);
    }

    // 14. Изменить размер прямоугольника в ratio раз
    public void resize(double ratio) {
        int newLength = (int) (getLength() * ratio);
        int newWidth = (int) (getWidth() * ratio);
        bottomRight.setX(topLeft.getX() + newLength);
        bottomRight.setY(topLeft.getY() + newWidth);
    }

    // 15. Растянуть прямоугольник по осям
    public void stretch(double xRatio, double yRatio) {
        int newLength = (int) (getLength() * xRatio);
        int newWidth = (int) (getWidth() * yRatio);
        bottomRight.setX(topLeft.getX() + newLength);
        bottomRight.setY(topLeft.getY() + newWidth);
    }

    // 16. Получить площадь прямоугольника
    public double getArea() {
        return getLength() * getWidth();
    }

    // 17. Получить периметр прямоугольника
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    // 18. Проверить, лежит ли точка (x, y) внутри прямоугольника
    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= topLeft.getY() && y <= bottomRight.getY();
    }

    // 19. Проверить, лежит ли точка (Point) внутри прямоугольника
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20. Проверить, пересекается ли текущий прямоугольник с другим
    public boolean isIntersects(Rectangle rectangle) {
        return !(rectangle.getBottomRight().getX() < topLeft.getX() ||
                rectangle.getTopLeft().getX() > bottomRight.getX() ||
                rectangle.getBottomRight().getY() < topLeft.getY() ||
                rectangle.getTopLeft().getY() > bottomRight.getY());
    }

    // 21. Проверить, лежит ли другой прямоугольник целиком внутри текущего
    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.getTopLeft()) && isInside(rectangle.getBottomRight());
    }

    // 22. Методы equals и hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return topLeft.equals(rectangle.topLeft) &&
                bottomRight.equals(rectangle.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = topLeft.hashCode();
        result = 31 * result + bottomRight.hashCode();
        return result;
    }
}
