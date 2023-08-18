package a_classes_objetos;
import javax.swing.*;
public class Carro {
    String marca;
    Double anoFabricacao;

    String cor;


    void Cadastro(){
       marca = JOptionPane.showInputDialog("Informe a marca do carro:");
       anoFabricacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o ano de fabricação do carro:"));
       cor = JOptionPane.showInputDialog("Informe a cor do carro:");
    }
    String exibirDados(){
        return marca + " - " + cor + " - " + "\n";
    }
}

