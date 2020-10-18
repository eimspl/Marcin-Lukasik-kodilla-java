public class Field {

    Seed content;
    int row, col;

    public Field(int row, int col) {
        this.row = row;
        this.col = col;
        clear();
    }

    public void clear() {
        content = Seed.EMPTY;
    }

    public void paint() {
        switch (content) {
            case CROSS:  System.out.print(" X "); break;
            case NOUGHT: System.out.print(" O "); break;
            case EMPTY:  System.out.print("   "); break;
        }
    }
}