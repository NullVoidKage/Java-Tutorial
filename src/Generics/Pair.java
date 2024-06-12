package Generics;

public class Pair<X, Y> {
    protected X x;
    protected Y y;

    private X x() {
        return x;
    }

    private Y y() {
        return y;
    }

    public void x(X x) {
        this.x = x;
    }

    public void y(Y y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" + x.toString() + ", " +
                y.toString() + "}";
    }
}
