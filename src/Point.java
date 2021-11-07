public class Point {
    private  int X;
    private  int Y;

    public Point () {
        this.X = 0;
        this.Y = 0;
    }

    public Point (int a, int b) {
        this.X = a;
        this.Y = b;
    }

    public int getx() {
        return X;
    }

    public int gety() {
        return Y;
    }

    @Override public String toString(){
        return "("+X+","+Y+")";
    }

    /**static public void main(String[] args){
        Point punto1 = new Point();
        System.out.println(punto1.toString());
        Point punto2 = new Point(10, 20);
        System.out.println(punto2.toString());
    }*/
}

