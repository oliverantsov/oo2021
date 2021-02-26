import java.util.ArrayList;


public class ProoviKT {
    public static void main(String[] args) {
        ArrayList<Integer> xValues = new ArrayList<Integer>();
        xValues.add(2);
        xValues.add(5);
        xValues.add(7);
        System.out.println("---------------------------------------------");
        System.out.println("Kolmnurga x-koordinaatide massiivi andmed:");
        System.out.println(xValues);

        ArrayList<Integer> yValues = new ArrayList<Integer>();
        yValues.add(4);
        yValues.add(8);
        yValues.add(11);
        System.out.println("---------------------------------------------");
        System.out.println("Kolmnurga y-koordinaatide massiivi andmed:");
        System.out.println(yValues);

        /*ArrayList<Integer> xyValues = new ArrayList<Integer>();
        xyValues.addAll(xValues);
        xyValues.addAll(yValues);
        //xyValues.add(xValues.get(0), yValues.get(0));
        System.out.println("---------------------------------------------");
        System.out.println("Kolmnurga koordinaadipaari massiivi paarid:");
        System.out.println(xyValues);*/
    }
}
