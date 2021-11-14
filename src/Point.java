public class Point implements java.io.Serializable {
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

    public int getx() {return X;}
    public int gety() {return Y;}


    @Override public String toString(){
        return "("+X+","+Y+")";
    }

    /**static public void main(String[] args){

    }*/
}

