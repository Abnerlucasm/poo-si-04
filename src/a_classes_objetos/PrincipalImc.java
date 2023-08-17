package a_classes_objetos;

import a_classes_objetos.Pessoa;

import javax.swing.*;

public class PrincipalImc {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão cadastradas?"));

        Pessoa pessoas[] = new Pessoa[n];
        String resultado = "";

        for(int i = 0; 1 < n; i++){
            Pessoa p = new Pessoa();
            p.Cadastra();
            pessoas[i] = p;
            resultado += p.exibirDados();
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
