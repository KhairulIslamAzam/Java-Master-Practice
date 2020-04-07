import java.text.DecimalFormat;

public class DecimalFormt {
    public static void main(String[] args) {
        DecimalFormat dw = new DecimalFormat("0.00");
        double db = 10.398345495;
        System.out.println(dw.format(db));
        System.out.printf("%.2f",db);

    }
}
