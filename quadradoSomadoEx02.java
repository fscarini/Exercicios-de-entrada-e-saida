import javax.swing.JOptionPane;
public class quadradoSomadoEx02 {
    public static void main(String args[]){
        double valor, calcQuadrado, resultadoQuadrado;
        resultadoQuadrado = 0;
        for(int i = 1; i <= 4; i++){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " + i + ":"));
            calcQuadrado = valor * valor;
            resultadoQuadrado = resultadoQuadrado + calcQuadrado;
        }
        JOptionPane.showMessageDialog(null, "O quadrado, seguido da soma dos valores inseridos é: " + resultadoQuadrado);
    }
}
