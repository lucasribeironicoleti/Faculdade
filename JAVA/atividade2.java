import javax.swing.JOptionPane;

public class avtividade2{
    private String endereço;
    private double preco;

    public avtividade2(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getPreco(){
        return preco;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }

    public double calculaPreco(){
        return this.getPreco();
    }
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Dados do imóvel: \n" + "Endereço: "+this.getEndereco()+"\n" + "Preço: "+calculaPreco());
    }
}
//////////////////////////////////////////////////////////////////////////
public class avtividade2novo extends avtividade2{
    
    public avtividade22(String endereco, double preco){
        super(endereco, preco);
    }
    public double calculaPreco(){
        return this.getPreco() * 1.1;
    }
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Dados do imóvel: \n" + "Endereço: "+this.getEndereco()+"\n" + "Preço: "+calculaPreco());
    }
}
//////////////////////////////////////////////////////////////////////////
public class avtividade2velho extends avtividade2{
    
    public avtividade22(String endereco, double preco){
        super(endereco, preco);
    }
    public double calculaPreco(){
        return this.getPreco() * 0.9;
    }
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Dados do imóvel: \n" + "Endereço: "+this.getEndereco()+"\n" + "Preço: "+calculaPreco());
    }
}
//////////////////////////////////////////////////////////////////////////
public class avtividade2principal{
    public static void main(String[] args) {
        avtividade2 im;
        String endereco;
        double valor;
        int op;

        for(;;){
            op = integer.parseInt(JOptionPane.showInputDialog("Qual tipo de imóvel deseja cadastrar:\n" + "1-Novo Imovel\n" + "2-Velho Imovel\n" + "3-Sair\n"));
            if(op==3){
                break;
            }
            endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço do Imovel:"));
            Valor= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do Imovel:"));

            if(op==1){
                im = new avtividade2novo(endereco, valor);

                im.imprime();
            } else if(op==2){
                im = new avtividade2velho(endereco, valor);

                im.imprime();
            }
        }
    }
}