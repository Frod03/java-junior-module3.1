package academy.tochkavhoda.figures.v1;

public class Ellipse {
    private Point center;
    private int xAxis;
    private int yAxis;

    // 1. Конструктор по координатам центра и размерам осей
    public Ellipse(Point center, int xAxis, int yAxis) {
        if (xAxis <= 0 || yAxis <= 0) {
            throw new IllegalArgumentException("Axes must be positive.");
        }
        this.center = new Point(center.getX(), center.getY());
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    // 2. Конструктор по координатам центра (int) и размерам осей
    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this(new Point(xCenter, yCenter), xAxis, yAxis);
    }

    // 3. Конструктор по размерам осей (центр в начале координат)
    public Ellipse(int xAxis, int yAxis) {
        this(0, 0, xAxis, yAxis);
    }

    // 4. Конструктор без параметров (центр в начале координат, единичные оси)
    public Ellipse() {
        this(1, 1); // Используем конструктор с размерами осей
    }

    // 5. Получить центр эллипса
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    // 6. Получить размер оси X
    public int getXAxis() {
        return xAxis;
    }

    // 7. Получить размер оси Y
    public int getYAxis() {
        return yAxis;
    }

    // 8. Установить размер оси X
    public void setXAxis(int xAxis) {
        if (xAxis <= 0) {
            throw new IllegalArgumentException("X axis must be positive.");
        }
        this.xAxis = xAxis;
    }

    // 9. Установить размер оси Y
    public void setYAxis(int yAxis) {
        if (yAxis <= 0) {
            throw new IllegalArgumentException("Y axis must be positive.");
        }
        this.yAxis = yAxis;
    }

    // 10. Установить центр эллипса
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    // 11. Переместить эллипс так, чтобы его центр оказался в точке (x, y)
    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    // 12. Переместить эллипс так, чтобы его центр оказался в точке point
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13. Переместить эллипс на (dx, dy)
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    // 14. Изменить размеры осей эллипса в ratio раз
    public void resize(double ratio) {
        int newXAxis = (int) (xAxis * ratio);
        int newYAxis = (int) (yAxis * ratio);
        if (newXAxis <= 0 || newYAxis <= 0) {
            throw new IllegalArgumentException("New axes must be positive.");
        }
        xAxis = newXAxis;
        yAxis = newYAxis;
    }

    // 15. Растянуть эллипс по осям
    public void stretch(double xRatio, double yRatio) {
        int newXAxis = (int) (xAxis * xRatio);
        int newYAxis = (int) (yAxis * yRatio);
        if (newXAxis <= 0 || newYAxis <= 0) {
            throw new IllegalArgumentException("New axes must be positive.");
        }
        xAxis = newXAxis;
        yAxis = newYAxis;
    }

    // 16. Получить площадь эллипса
    public double getArea() {
        return Math.PI * xAxis * yAxis / 4.0;
    }

    // 17. Получить периметр эллипса
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((xAxis * xAxis + yAxis * yAxis) / 8.0);
    }

    // 18. Проверить, лежит ли точка (x, y) внутри эллипса
    public boolean isInside(int x, int y) {
        double normalizedX = Math.pow((x - center.getX()) / ((double) xAxis / 2), 2);
        double normalizedY = Math.pow((y - center.getY()) / ((double) yAxis / 2), 2);
        return (normalizedX + normalizedY) <= 1;
    }

    // 19. Проверить, лежит ли точка point внутри эллипса
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20. Методы equals и hashCode (генерируются автоматически)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ellipse ellipse = (Ellipse) obj;
        return xAxis == ellipse.xAxis &&
                yAxis == ellipse.yAxis &&
                center.equals(ellipse.center);
    }

    @Override
    public int hashCode() {
        int result = center.hashCode();
        result = 31 * result + xAxis;
        result = 31 * result + yAxis;
        return result;
    }
}
