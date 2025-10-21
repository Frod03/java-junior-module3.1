package academy.tochkavhoda.figures.v1;

public class Square {
    private Point topLeft;
    private int size;

    // 1. Конструктор по координатам левого верхнего угла и длине стороны
    public Square(Point topLeft, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
        this.size = size;
    }

    // 2. Конструктор по координатам левого верхнего угла и длине стороны (int)
    public Square(int xLeft, int yTop, int size) {
        this(new Point(xLeft, yTop), size);
    }

    // 3. Конструктор по длине стороны (левый нижний угол в начале координат)
    public Square(int size) {
        this(0, -size, size); // Левый верхний угол смещается по оси Y вверх
    }

    // 4. Конструктор без параметров (размер 1x1, левый нижний угол в начале координат)
    public Square() {
        this(1); // Используем конструктор с размером
    }

    // 5. Получить левую верхнюю точку
    public Point getTopLeft() {
        return new Point(topLeft.getX(),topLeft.getY());
    }

    // 6. Получить правую нижнюю точку
    public Point getBottomRight() {
        return new Point(topLeft.getX() + size, topLeft.getY() + size);
    }

    // 7. Установить левую верхнюю точку
    public void setTopLeft(Point topLeft) {
        this.topLeft = new Point(topLeft.getX(),topLeft.getY());
    }

    // 8. Получить длину стороны квадрата
    public int getLength() {
        return size;
    }

    // 9. Переместить квадрат в точку (x, y)
    public void moveTo(int x, int y) {
        topLeft.moveTo(x, y);
    }

    // 10. Переместить квадрат в точку (Point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 11. Переместить квадрат на (dx, dy)
    public void moveRel(int dx, int dy) {
        topLeft.moveRel(dx, dy);
    }

    // 12. Изменить размер квадрата в ratio раз
    public void resize(double ratio) {
        int newSize = (int) (size * ratio);
        if (newSize <= 0) {
            throw new IllegalArgumentException("New size must be positive.");
        }
        size = newSize;
    }

    // 13. Получить площадь квадрата
    public double getArea() {
        return size * size;
    }

    // 14. Получить периметр квадрата
    public double getPerimeter() {
        return 4 * size;
    }

    // 15. Проверить, лежит ли точка (x, y) внутри квадрата
    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= topLeft.getX() + size &&
                y >= topLeft.getY() && y <= topLeft.getY() + size;
    }

    // 16. Проверить, лежит ли точка (Point) внутри квадрата
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 17. Проверить, пересекается ли текущий квадрат с другим
    public boolean isIntersects(Square square) {
        return !(square.getBottomRight().getX() < topLeft.getX() ||
                square.getTopLeft().getX() > topLeft.getX() + size ||
                square.getBottomRight().getY() < topLeft.getY() ||
                square.getTopLeft().getY() > topLeft.getY() + size);
    }

    // 18. Проверить, лежит ли квадрат целиком внутри текущего квадрата
    public boolean isInside(Square square) {
        return isInside(square.getTopLeft()) && isInside(square.getBottomRight());
    }

    // 19. Методы equals и hashCode (генерируются автоматически)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return size == square.size && topLeft.equals(square.topLeft);
    }

    @Override
    public int hashCode() {
        int result = topLeft.hashCode();
        result = 31 * result + size;
        return result;
    }
}
