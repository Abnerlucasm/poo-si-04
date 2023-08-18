package a_classes_objetos;
import a_classes_objetos.Carro;

import javax.swing.*;

public class PrincipalCarro {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos carros serão cadastrados:"));

        Carro carros[] = new Carro[n];
        String resultado = "";

        for (int i = 0; 1 < n; i++) {
            Carro c = new Carro();
            c.Cadastro();
            carros[i] = c;
            resultado += c.exibirDados();
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

}
