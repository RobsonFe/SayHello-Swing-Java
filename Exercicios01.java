import javax.swing.*;

//Exercicio com Swing
public class Exercicios01 {
    public static void main(String[] args) {

        //Janela
        JFrame janela = new JFrame();
        //titulo da janela
        janela.setTitle("Diga seu nome!");
        //Tamanho da janela
        janela.setSize(500, 500);
        //Fechar a janela
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // voce pode colocar apenas 3.

        //Label do formulario no swing
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,50,20); // Posição do label.

        // Input do nome
        JTextField input = new JTextField();
        input.setBounds(20,40,200,20);

        //Botão
        JButton botao = new JButton();
        botao.setText("Enviar");
        botao.setBounds(20,60,100,20);
        botao.addActionListener(event -> {
            String nomeDoInput = input.getText();
            JOptionPane.showMessageDialog(janela, "Olá " + nomeDoInput);
            input.setText("");
        });

        // Retirar todo layout pre definido pelo sistema
        janela.setLayout(null);

        //Adicionando conteudo na janela
        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(input);
        janela.getContentPane().add(botao);

        janela.setVisible(true);
    }

}
