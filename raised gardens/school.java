import java.util.*;

import javax.swing.JOptionPane;

/**
 * main
 */
public class school {
    public static void main(String[] args) {
        // vars
        List<String> size = new ArrayList<String>();
        final double wood_p = 0.80;
        final double dirt_p = 1.05;
        final double tax = 0.032;
        String sizes = JOptionPane.showInputDialog("how big");
        // math
        size = Arrays.asList(sizes.split("x"));
        Integer w = Integer.parseInt(size.get(0));
        Integer l = Integer.parseInt(size.get(1));
        double wood = 2*(l+w);
        double dirt = l*w;
        double wood_total = (wood*(wood_p*10))/10;
        double dirt_total = dirt*dirt_p;
        double sub_total = wood_total+dirt_total;
        double tax_d = Double.parseDouble(String.format("%.2f", sub_total*tax));
        double total = sub_total+tax_d;
        JOptionPane.showMessageDialog(null, "%s   wood\n%s    dirt\nSubtotal:     $%s\nTax due:       $%s\nTotal due:    $%s".formatted(
                    wood, dirt, String.format("%10s", sub_total), String.format("%10s", tax_d), String.format("%10s", total)),
                "your receipt",JOptionPane.PLAIN_MESSAGE);
    }
}
