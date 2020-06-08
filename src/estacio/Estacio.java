
package estacio;

import javax.swing.JOptionPane;

public class Estacio {

    public static void main(String[] args) {

    Projeto_estacio dados  = new Projeto_estacio();
    
    dados.setPlaca((JOptionPane.showInputDialog("Digite aqui a placa do carro: ")));
    dados.setModelo((JOptionPane.showInputDialog("O modelo do carro: ")));    
    dados.setH_entrada(Integer.parseInt(JOptionPane.showInputDialog("A hora que você entrou: ")));
    dados.setM_entrada(Integer.parseInt(JOptionPane.showInputDialog("E os minutos: ")));
    dados.setH_saida(Integer.parseInt(JOptionPane.showInputDialog("Agora a hora que você saiu: ")));
    dados.setM_saida(Integer.parseInt(JOptionPane.showInputDialog("E os minutos: ")));
    dados.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Insira o preço por hora no estacionamento: ")));
  
    double total= dados.calculo(dados.getH_entrada(),dados.getM_entrada(),dados.getH_saida(),dados.getM_saida());
    dados.nota(total, total);
    
    JOptionPane.showMessageDialog(null,"COMPROVANTE" + "\n\n" + "Número da placa: "+ dados.getPlaca() + "\n" + "Modelo do carro: "
    + dados.getModelo() + "\n" + "Horário que entrou: " + dados.getH_entrada() + " Hrs e " + dados.getM_entrada()
    + " minutos." + "\n" + "Horário que saiu: " + dados.getH_saida() + " Hrs e " + dados.getM_saida() + " minutos." + "\n" 
    + "Tempo no estacionamento: " + dados.tempo + " Hrs" + "\n" + "Valor à ser pago: R$ " + dados.total + "\n\n" + "Volte sempre!");
    
    //eu me perdi no processo por isso tá muito feio, desculpa
     
    }  
}