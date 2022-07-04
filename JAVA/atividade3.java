public class Ingresso{
    public float ValorIngresso;

    public float getValorIngresso(){
        return this.ValorIngresso;
    }
    public void setValorIngresso(float valorIngresso){
        this.ValorIngresso = valorIngresso;
    }
    public void imprimeValor(float valor){
        valor = this.ValorIngresso;
        System.out.printf("Valor do Igresso:"+ valor);
    }
}
///////////////////////////////////////////////////////////////////////////////////
public class VIP extends Ingresso {
    public float ValorAdicional;
   
    public float getValorAdicional(){
        return this.ValorAdicional;
    }
    public void setValorAdicional(float valorAdicional){
        this.ValorAdicional = valorAdicional;
    }
    public float valorIngressoVip(float valoringresso){
        this.ValorIngresso = valoringresso;
        return this.ValorIngresso + (this.ValorAdicional* this.ValorIngresso);       
    }
}
///////////////////////////////////////////////////////////////////////////////////
public class Normal extends Ingresso{
   
    public void imprimeingressoNormal(float valor){
        valor = this.ValorIngresso;
        System.out.println("Ingresso Normal:"+ valor );
    }
}
///////////////////////////////////////////////////////////////////////////////////
public class CamaroteInferior extends VIP{
    String LocalIngresso;
   
    public String getLocalIngresso(){
    return this.LocalIngresso;
    }
    public void setLocalIngresso(String local){
        this.LocalIngresso = local;
    }
 
    public String acessaLocalizacao(){
        return this.LocalIngresso;
    }
    public void imprimeLocalizacao(String local){
        local = this.LocalIngresso;
        System.out.println("Local:"+ local);
    }
}
///////////////////////////////////////////////////////////////////////////////////
public class CamaroteSuperior extends VIP{
    float TaxaAdicional;
   
    public void setTaxaAdicional(float valor){
        this.TaxaAdicional = valor;
    }
    public float getTaxaAdicional(){
        return this.TaxaAdicional;
    }  
    public float valorIngressoAdd(float valor){
        valor= this.ValorAdicional;
        float valorAdd =(this.TaxaAdicional*this.ValorIngresso)*2+this.ValorIngresso;
        return valorAdd;
    }
}
///////////////////////////////////////////////////////////////////////////////////
public class Herança {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
        VIP vip = new VIP();
        ingresso.setValorIngresso(71);
        vip.setValorAdicional(0.7f);
        camaroteinferior.setLocalIngresso("terreo");
        camarotesuperior.setTaxaAdicional(0.5f);
        normal.setValorIngresso(70);
        normal.imprimeingressoNormal(normal.getValorIngresso());
        System.out.println("Ingresso Vip:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
        System.out.println("Ingresso Vip Camarote Inferior:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
        camaroteinferior.imprimeLocalizacao(camaroteinferior.getLocalIngresso());
        camarotesuperior.setValorAdicional(35);
        camarotesuperior.setValorIngresso(70);
        System.out.println("Ingresso Vip Camarote Superior:"+ camarotesuperior.valorIngressoAdd(vip.getValorAdicional()));
    }
   
}