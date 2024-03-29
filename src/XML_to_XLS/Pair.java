package XML_to_XLS;

/**
 * Class contains number of pairs
 * and index
 */
public class Pair {
    /**
     * Number of pairs
     */
    private String Text;
    /**
     * Index
     */
    private int Index;

    public Pair() {
    }

    public Pair(String text, int index) {
        this.Text = text;
        this.Index = index;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        this.Text = text;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        this.Index = index;
    }

    @Override
    public String toString() {
        return
                "T='" + Text + '\'' +
                        ", I=" + Index +
                        '}';
    }
}