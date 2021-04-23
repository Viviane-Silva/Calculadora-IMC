import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class calculadoraIMC {
    public static void main(String[] args) {
        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));

        imc = peso / (altura * altura);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado);
    }
}
