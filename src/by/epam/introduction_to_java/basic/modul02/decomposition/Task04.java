package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
    4.	На плоскости заданы своими координатами n точек.
    Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
    Указание. Координаты точек занести в массив
 */
public class Task04 {

    static Point[] point = {new Point(1, 2), new Point(3, 4), new Point(-1, -2), new Point(-3, 5)};


    public static Point[] maxDistance(Point[] arrayPoint) {
        double maxDistance = 0;
        double tempDistance;
        Point[] pointResult = new Point[2];

        for (int i = 0; i < arrayPoint.length - 1; i++) {
            for (int j = 1; j < arrayPoint.length; j++) {
                tempDistance = distanceBetweenPoint(arrayPoint[i], arrayPoint[j]);

                if (tempDistance > maxDistance) {
                    maxDistance = tempDistance;
                    pointResult[0] = arrayPoint[i];
                    pointResult[1] = arrayPoint[j];
                }
            }
        }

        for(Point p : pointResult){
            ViewHelper.helpView(p.toString());
        }

        return pointResult;
    }

    public static double distanceBetweenPoint(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
