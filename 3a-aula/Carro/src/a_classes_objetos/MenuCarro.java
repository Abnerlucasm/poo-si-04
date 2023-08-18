package a_classes_objetos;

import javax.swing.*;
import java.util.ArrayList;

public class MenuCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        String menu = """
                1 - Cadastrar
                2 - Listar Carros
                3 - Listar por Ano
                4 - Listar por Marca
                5 - Listar por Cor
                6 - Sair""";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1){
                Carro c = new Carro();
                c.Cadastro();
                carros.add(c);
            }
            if (op == 2){
                String result = "Carros Cadastrados\n\n";
                for(Carro c: carros){
                    result += c.exibirDados();
                }
                JOptionPane.showMessageDialog(null,result);
            }

        } while (op != 6);
    }
}
