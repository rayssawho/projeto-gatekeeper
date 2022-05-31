import java.util.ArrayList;

public class HeaderGeralArquivo {

    private String tipRegHg;
    private String banco;
    private String nsp;
    private String sistOrig;
    private String dtMovto;
    private String brancos;
    private ArrayList<String> quantErrosHG;
    private ArrayList<String> quantOkHG;

    public HeaderGeralArquivo(String linhaArquivo) {
        this.tipRegHg = linhaArquivo.substring(0, 1);
        this.banco = linhaArquivo.substring(1, 5);
        this.nsp = linhaArquivo.substring(5, 12);
        this.sistOrig = linhaArquivo.substring(12, 32);
        this.dtMovto = linhaArquivo.substring(32, 40);
        this.brancos = linhaArquivo.substring(40, 1200);
    }

    public String getTipRegHg() {
        return tipRegHg;
    }

    public void setTipRegHg(String tipRegHg) {
        this.tipRegHg = tipRegHg;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNsp() {
        return nsp;
    }

    public void setNsp(String nsp) {
        this.nsp = nsp;
    }

    public String getSistOrig() {
        return sistOrig;
    }

    public void setSistOrig(String sistOrig) {
        this.sistOrig = sistOrig;
    }

    public String getDtMovto() {
        return dtMovto;
    }

    public void setDtMovto(String dtMovto) {
        this.dtMovto = dtMovto;
    }

    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    public ArrayList<String> getQuantErrosHG() {
        return quantErrosHG;
    }

    public void setQuantErrosHG(ArrayList<String> quantErrosHG) {
        this.quantErrosHG = quantErrosHG;
    }

    public ArrayList<String> getQuantOkHG() {
        return quantOkHG;
    }

    public void setQuantOkHG(ArrayList<String> quantOkHG) {
        this.quantOkHG = quantOkHG;
    }

    public void msgDeErroHG(String variavel) {
        quantErrosHG = new ArrayList<>();
        quantErrosHG.add("Erro no Header Geral, campo: " + variavel + " .É esperado um valor numérico, porém o campo contém valor alfanumérico.");
    }

    public void validarSessao() {
        quantErrosHG = new ArrayList<>();
        String alfanumerico = " É esperado um valor numérico, porém o campo contém valor alfanumérico.\n";
        boolean x = Validador.validaInteiro(getTipRegHg());
        if (x == false) {
            quantErrosHG.add("Erro no Header Geral, Campo: TipRegHg." + alfanumerico);
        }
        boolean y = Validador.validaInteiro(getBanco());
        if (y == false) {
            quantErrosHG.add("Erro no Header Geral, Campo: banco." + alfanumerico);
        }

        boolean z = Validador.validaInteiro(getNsp());
        if (z == false) {
            quantErrosHG.add("Erro no Header Geral, Campo: Nsp. " + alfanumerico);
        }

        boolean w = Validador.validaInteiro(getDtMovto());
        if (w == false) {
            quantErrosHG.add("Erro no Header Geral, Campo: DtMovto." + alfanumerico);
        }
    }


}