import java.util.ArrayList;

public class Detalhe {

    private String tipRegDetalhe;
    private String modPlast;
    private String kit;
    private String seqCart;
    private String linha01;
    private String linha02;
    private String linha03;
    private String linha04;
    private String linhaVerso;
    private String trilha01;
    private String trilha02;
    private String trilha03;
    private String qtdCartoes;
    private String nome;
    private String dadosEndereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String nroAr;
    private String cepAr;
    private String codRegional;
    private String codAgencia;
    private String nmAbrAge;
    private String tpUorPab;
    private String codUorPab;
    private String nmAbrPab;
    private String folder;
    private String codPab;
    private String nomeAdicional;
    private String enderecoAge;
    private String bairroAge;
    private String cidadeAge;
    private String ufAge;
    private String cepAge;
    private String contaCorrente;
    private String tm;
    private String template;
    private String tm2;
    private String complemento;
    private String codPlast;
    private String empresa;
    private String foto;
    private String vlLimite;
    private String diaVenc;
    private String codigoBarras;
    private String deficienteVisual;
    private String senha;
    private String trilha01Icvv;
    private String trilha02Icvv;
    private String ccrAntigo;
    private String codigoCartao;
    private String nomeOrigemComercial;
    private String matricula;
    private String cargo;
    private String documento;
    private String ddd;
    private String telefone;
    private String vago;
    private String panvas;
    private String numeroEndereco;
    private String complementoEndereco;
    private String branco3;

    private ArrayList quantErrosDt = new ArrayList<String>();
    private ArrayList quantOkDt = new ArrayList<String>();


    public Detalhe(String linhaArquivo) {
        this.tipRegDetalhe = linhaArquivo.substring(0, 1);
        this.modPlast = linhaArquivo.substring(1, 4);
        this.kit = linhaArquivo.substring(4, 10);
        this.seqCart = linhaArquivo.substring(10, 16);
        this.linha01 = linhaArquivo.substring(16, 56);
        this.linha02 = linhaArquivo.substring(56, 96);
        this.linha03 = linhaArquivo.substring(96, 136);
        this.linha04 = linhaArquivo.substring(136, 176);
        this.linhaVerso = linhaArquivo.substring(176, 216);
        this.trilha01 = linhaArquivo.substring(216, 294);
        this.trilha02 = linhaArquivo.substring(294, 333);
        this.trilha03 = linhaArquivo.substring(333, 440);
        this.qtdCartoes = linhaArquivo.substring(440, 442);
        this.nome = linhaArquivo.substring(442, 468);
        this.dadosEndereco = linhaArquivo.substring(468, 518);
        this.bairro = linhaArquivo.substring(518, 538);
        this.cidade = linhaArquivo.substring(538, 558);
        this.uf = linhaArquivo.substring(558, 560);
        this.cep = linhaArquivo.substring(560, 568);
        this.nroAr = linhaArquivo.substring(568, 577);
        this.cepAr = linhaArquivo.substring(577, 581);
        this.codRegional = linhaArquivo.substring(581, 584);
        this.codAgencia = linhaArquivo.substring(584, 588);
        this.nmAbrAge = linhaArquivo.substring(588, 603);
        this.tpUorPab = linhaArquivo.substring(603, 606);
        this.codUorPab = linhaArquivo.substring(606, 610);
        this.nmAbrPab = linhaArquivo.substring(610, 625);
        this.folder = linhaArquivo.substring(625, 634);
        this.codPab = linhaArquivo.substring(634, 636);
        this.nomeAdicional = linhaArquivo.substring(636, 681);
        this.enderecoAge = linhaArquivo.substring(681, 731);
        this.bairroAge = linhaArquivo.substring(731, 751);
        this.cidadeAge = linhaArquivo.substring(751, 771);
        this.ufAge = linhaArquivo.substring(771, 773);
        this.cepAge = linhaArquivo.substring(773, 781);
        this.contaCorrente = linhaArquivo.substring(781, 797);
        this.tm = linhaArquivo.substring(797, 800);
        this.template = linhaArquivo.substring(800, 810);
        this.tm2 = linhaArquivo.substring(810, 811);
        this.complemento = linhaArquivo.substring(811, 831);
        this.codPlast = linhaArquivo.substring(831, 834);
        this.empresa = linhaArquivo.substring(834, 853);
        this.foto = linhaArquivo.substring(853, 861);
        this.vlLimite = linhaArquivo.substring(861, 873);
        this.diaVenc = linhaArquivo.substring(873, 875);
        this.codigoBarras = linhaArquivo.substring(875, 885);
        this.deficienteVisual = linhaArquivo.substring(885, 886);
        this.senha = linhaArquivo.substring(886, 902);
        this.trilha01Icvv = linhaArquivo.substring(902, 980);
        this.trilha02Icvv = linhaArquivo.substring(980, 1019);
        this.ccrAntigo = linhaArquivo.substring(1019, 1031);
        this.codigoCartao = linhaArquivo.substring(1031, 1043);
        this.nomeOrigemComercial = linhaArquivo.substring(1043, 1063);
        this.matricula = linhaArquivo.substring(1063, 1083);
        this.cargo = linhaArquivo.substring(1083, 1113);
        this.documento = linhaArquivo.substring(1113, 1124);
        this.ddd = linhaArquivo.substring(1124, 1126);
        this.telefone = linhaArquivo.substring(1126, 1135);
        this.vago = linhaArquivo.substring(1135, 1140);
        this.panvas = linhaArquivo.substring(1140, 1156);
        this.numeroEndereco = linhaArquivo.substring(1156, 1166);
        this.complementoEndereco = linhaArquivo.substring(1166, 1196);
        this.branco3 = linhaArquivo.substring(1196, 1200);
    }

    public String getTipRegDetalhe() {
        return tipRegDetalhe;
    }

    public void setTipRegDetalhe(String tipRegDetalhe) {
        this.tipRegDetalhe = tipRegDetalhe;
    }

    public String getModPlast() {
        return modPlast;
    }

    public void setModPlast(String modPlast) {
        this.modPlast = modPlast;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getSeqCart() {
        return seqCart;
    }

    public void setSeqCart(String seqCart) {
        this.seqCart = seqCart;
    }

    public String getLinha01() {
        return linha01;
    }

    public void setLinha01(String linha01) {
        this.linha01 = linha01;
    }

    public String getLinha02() {
        return linha02;
    }

    public void setLinha02(String linha02) {
        this.linha02 = linha02;
    }

    public String getLinha03() {
        return linha03;
    }

    public void setLinha03(String linha03) {
        this.linha03 = linha03;
    }

    public String getLinha04() {
        return linha04;
    }

    public void setLinha04(String linha04) {
        this.linha04 = linha04;
    }

    public String getLinhaVerso() {
        return linhaVerso;
    }

    public void setLinhaVerso(String linhaVerso) {
        this.linhaVerso = linhaVerso;
    }

    public String getTrilha01() {
        return trilha01;
    }

    public void setTrilha01(String trilha01) {
        this.trilha01 = trilha01;
    }

    public String getTrilha02() {
        return trilha02;
    }

    public void setTrilha02(String trilha02) {
        this.trilha02 = trilha02;
    }

    public String getTrilha03() {
        return trilha03;
    }

    public void setTrilha03(String trilha03) {
        this.trilha03 = trilha03;
    }

    public String getQtdCartoes() {
        return qtdCartoes;
    }

    public void setQtdCartoes(String qtdCartoes) {
        this.qtdCartoes = qtdCartoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDadosEndereco() {
        return dadosEndereco;
    }

    public void setDadosEndereco(String dadosEndereco) {
        this.dadosEndereco = dadosEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNroAr() {
        return nroAr;
    }

    public void setNroAr(String nroAr) {
        this.nroAr = nroAr;
    }

    public String getCepAr() {
        return cepAr;
    }

    public void setCepAr(String cepAr) {
        this.cepAr = cepAr;
    }

    public String getCodRegional() {
        return codRegional;
    }

    public void setCodRegional(String codRegional) {
        this.codRegional = codRegional;
    }

    public String getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(String codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getNmAbrAge() {
        return nmAbrAge;
    }

    public void setNmAbrAge(String nmAbrAge) {
        this.nmAbrAge = nmAbrAge;
    }

    public String getTpUorPab() {
        return tpUorPab;
    }

    public void setTpUorPab(String tpUorPab) {
        this.tpUorPab = tpUorPab;
    }

    public String getCodUorPab() {
        return codUorPab;
    }

    public void setCodUorPab(String codUorPab) {
        this.codUorPab = codUorPab;
    }

    public String getNmAbrPab() {
        return nmAbrPab;
    }

    public void setNmAbrPab(String nmAbrPab) {
        this.nmAbrPab = nmAbrPab;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getCodPab() {
        return codPab;
    }

    public void setCodPab(String codPab) {
        this.codPab = codPab;
    }

    public String getNomeAdicional() {
        return nomeAdicional;
    }

    public void setNomeAdicional(String nomeAdicional) {
        this.nomeAdicional = nomeAdicional;
    }

    public String getEnderecoAge() {
        return enderecoAge;
    }

    public void setEnderecoAge(String enderecoAge) {
        this.enderecoAge = enderecoAge;
    }

    public String getBairroAge() {
        return bairroAge;
    }

    public void setBairroAge(String bairroAge) {
        this.bairroAge = bairroAge;
    }

    public String getCidadeAge() {
        return cidadeAge;
    }

    public void setCidadeAge(String cidadeAge) {
        this.cidadeAge = cidadeAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTm2() {
        return tm2;
    }

    public void setTm2(String tm2) {
        this.tm2 = tm2;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCodPlast() {
        return codPlast;
    }

    public void setCodPlast(String codPlast) {
        this.codPlast = codPlast;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVlLimite() {
        return vlLimite;
    }

    public void setVlLimite(String vlLimite) {
        this.vlLimite = vlLimite;
    }

    public String getDiaVenc() {
        return diaVenc;
    }

    public void setDiaVenc(String diaVenc) {
        this.diaVenc = diaVenc;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDeficienteVisual() {
        return deficienteVisual;
    }

    public void setDeficienteVisual(String deficienteVisual) {
        this.deficienteVisual = deficienteVisual;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTrilha01Icvv() {
        return trilha01Icvv;
    }

    public void setTrilha01Icvv(String trilha01Icvv) {
        this.trilha01Icvv = trilha01Icvv;
    }

    public String getTrilha02Icvv() {
        return trilha02Icvv;
    }

    public void setTrilha02Icvv(String trilha02Icvv) {
        this.trilha02Icvv = trilha02Icvv;
    }

    public String getCcrAntigo() {
        return ccrAntigo;
    }

    public void setCcrAntigo(String ccrAntigo) {
        this.ccrAntigo = ccrAntigo;
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        this.codigoCartao = codigoCartao;
    }

    public String getNomeOrigemComercial() {
        return nomeOrigemComercial;
    }

    public void setNomeOrigemComercial(String nomeOrigemComercial) {
        this.nomeOrigemComercial = nomeOrigemComercial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getVago() {
        return vago;
    }

    public void setVago(String vago) {
        this.vago = vago;
    }

    public String getPanvas() {
        return panvas;
    }

    public void setPanvas(String panvas) {
        this.panvas = panvas;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getBranco3() {
        return branco3;
    }

    public void setBranco3(String branco3) {
        this.branco3 = branco3;
    }

    public ArrayList getQuantErrosDt() {
        return quantErrosDt;
    }

    public void setQuantErrosDt(ArrayList quantErrosDt) {
        this.quantErrosDt = quantErrosDt;
    }

    public ArrayList getQuantOkDt() {
        return quantOkDt;
    }

    public void setQuantOkDt(ArrayList quantOkDt) {
        this.quantOkDt = quantOkDt;
    }

    public void msgDeErroDT(String variavel) {
        quantErrosDt.add("Erro no Detalhe, campo: " + variavel +
                "É esperado um valor numérico, porém o campo contém valor alfanumérico.\n");
    }

    public void validarSessao() {
        quantErrosDt = new ArrayList<String>();
        String alfanumerico = " É esperado um valor numérico, porém o campo contém valor alfanumérico.\n";
        boolean a = Validador.validaInteiro(getTipRegDetalhe());
        if (a == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: TipRegDetalhe." + alfanumerico);
        }

        boolean b = Validador.validaInteiro(getModPlast());
        if (b == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: ModPlast." + alfanumerico);
        }

        boolean c = Validador.validaInteiro(getSeqCart());
        if (c == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: SeqCart." + alfanumerico);
        }

        boolean d = Validador.validaInteiro(getCep());
        if (d == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: Cep." + alfanumerico);
        }

        boolean e = Validador.validaInteiro(getNroAr());
        if (e == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: NroAr." + alfanumerico);
        }

        boolean f = Validador.validaInteiro(getCepAr());
        if (f == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CepAr." + alfanumerico);
        }

        boolean g = Validador.validaInteiro(getCodRegional());
        if (g == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CodRegional." + alfanumerico);
        }

        boolean h = Validador.validaInteiro(getCodAgencia());
        if (h == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CodAgencia." + alfanumerico);
        }

        boolean i = Validador.validaInteiro(getCepAge());
        if (i == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CepAge." + alfanumerico);
        }

        boolean j = Validador.validaInteiro(getCodPlast());
        if (j == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CodPlast." + alfanumerico);
        }

        boolean k = Validador.validaInteiro(getVlLimite());
        if (k == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: VlLimite." + alfanumerico);
        }

        boolean l = Validador.validaInteiro(getDiaVenc());
        if (l == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: DiaVenc." + alfanumerico);
        }

        boolean m = Validador.validaInteiro(getCodigoBarras());
        if (m == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CodigoBarras." + alfanumerico);
        }

        boolean n = Validador.validaInteiro(getDeficienteVisual());
        if (n == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: DeficienteVisual." + alfanumerico);
        }

        boolean o = Validador.validaInteiro(getCodigoCartao());
        if (o == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: CodigoCartao." + alfanumerico);
        }

        boolean p = Validador.validaInteiro(getNumeroEndereco());
        if (p == false) {
            quantErrosDt.add("Erro no Detalhe, Campo: NumeroEndereco." + alfanumerico);
        }
    }
}


