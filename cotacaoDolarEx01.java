// Bibliotecas
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class cotacaoDolarEx01{
    public static void main(String args[]){
        // Declaração de classes
        double valor, cotacaoDolar, valorReal;

        // Leitura de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dolares:"));
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dólar para Real:"));

        // Processamento de dados
        valorReal = valor * cotacaoDolar;
        // Usando DecimalFormat para formatar os valores com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.00"); 
        String valorRealFormatado = df.format(valorReal);
        String valorFormatado = df.format(valor);

        // Imprimindo o resultado como saída para o usuário
        JOptionPane.showMessageDialog(null, "O valor de $" + valorFormatado + " convertido para Reais, é igual a: R$" + valorRealFormatado);
    }
}