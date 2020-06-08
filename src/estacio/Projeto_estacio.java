
package estacio;

public class Projeto_estacio {
    
    //H = Hora M = Minuto :p
    
     public String placa;
     public String modelo;
     public double h_entrada;
     public double m_entrada;
     public double h_saida;
     public double m_saida;
     public double preco;
     public double tempo;
     public double total;
      
     public String getPlaca(){
     return placa;
     
    }
    
     public void setPlaca(String placa){
     this.placa=placa;
     
    }
    
     public String getModelo(){
     return modelo;
     
     }
    
     public void setModelo(String modelo){
     this.modelo=modelo;
     
     }
    
     public double getH_entrada(){
     return h_entrada;
     
     }
    
     public void setH_entrada(double h_entrada){
     this.h_entrada=h_entrada;
     
     }
    
     public double getM_entrada(){
     return m_entrada;
     
     }
     
     public void setM_entrada(double m_entrada){
     this.m_entrada=m_entrada;
     
     }
    
     public double getH_saida(){
     return h_saida;
     
     }
    
     public void setH_saida(double h_saida){
     this.h_saida=h_saida;
     
     } 
    
     public double getM_saida(){
     return m_saida;
    
     }
    
     public void setM_saida(double m_saida){
     this.m_saida=m_saida;
     
     }
    
     public double getPreco(){
     return preco;
     
     }
    
     public void setPreco(double preco){
     this.preco=preco;
     
     }
   
    //~continhas~//
    
    public double calculo(double h_entrada, double m_entrada, double h_saida, double m_saida){
    double ent = h_entrada + m_entrada/60;
    double sai = h_saida + m_saida/60;
    double tempo = Math.ceil(sai - ent); 
    return tempo;
    
    }
    
    public void nota(double tempo, double preco){
    double total = tempo*preco;
    
    }
}
