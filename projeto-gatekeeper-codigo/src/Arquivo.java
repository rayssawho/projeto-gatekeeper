
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Arquivo {


    private File[] arquivos = new File[0];
    private File[] arquivosOk = new File[0];
    private int quantArquivosFalha;
    private ArrayList errosHG = new ArrayList<>();
    private ArrayList errosHL = new ArrayList<>();
    private ArrayList errosDT = new ArrayList<>();
    private ArrayList errosTL = new ArrayList<>();
    private ArrayList errosTG = new ArrayList<>();
    private ArrayList errosLinha = new ArrayList<>();
    private ArrayList listaErrosHG = new ArrayList<>();
    private ArrayList listaErrosHL = new ArrayList<>();
    private ArrayList listaErrosDT = new ArrayList<>();
    private ArrayList listaErrosTL = new ArrayList<>();
    private ArrayList listaErrosTG = new ArrayList<>();

    public int getQuantArquivosFalha() {
        return quantArquivosFalha;
    }

    public void setQuantArquivosFalha(int quantArquivosFalha) {
        this.quantArquivosFalha = quantArquivosFalha;
    }

    public ArrayList getErrosHG() {
        return errosHG;
    }

    public void setErrosHG(ArrayList errosHG) {
        this.errosHG = errosHG;
    }

    public ArrayList getErrosHL() {
        return errosHL;
    }

    public void setErrosHL(ArrayList errosHL) {
        this.errosHL = errosHL;
    }

    public ArrayList getErrosDT() {
        return errosDT;
    }

    public void setErrosDT(ArrayList errosDT) {
        this.errosDT = errosDT;
    }

    public ArrayList getErrosTL() {
        return errosTL;
    }

    public void setErrosTL(ArrayList errosTL) {
        this.errosTL = errosTL;
    }

    public ArrayList<String> getErrosTG() {
        return errosTG;
    }

    public void setErrosTG(ArrayList<String> errosTG) {
        this.errosTG = errosTG;
    }

    public ArrayList<String> getErrosLinha() {
        return errosLinha;
    }

    public void setErrosLinha(ArrayList<String> errosLinha) {
        this.errosLinha = errosLinha;
    }

    public void abrirArquivos(String caminho) {

        File diretorio = new File(caminho);
        try {
            arquivos = diretorio.listFiles();
            System.out.println("\nForam lidos " + arquivos.length + " arquivos.");
        } catch (NullPointerException e) {

            System.err.println("Você digitou um caminho inválido!" +
                    "Tente adicionar apenas o caminho da pasta " +
                    "com os arquivos que deseja validar");
        }

        try {
            FileFilter filtro = new FileFilter() {

                @Override
                public boolean accept(File arquivos) {
                    return arquivos.getName().endsWith(".txt");
                }
            };

            arquivosOk = diretorio.listFiles(filtro);
            System.out.println("\nSerá(ão) validado(s) " + arquivosOk.length + " arquivo(s).");
            quantArquivosFalha = (arquivos.length) - (arquivosOk.length);
            if (quantArquivosFalha >= 1) {
                System.out.println(quantArquivosFalha + " arquivo(s) não é(são) do tipo .txt, " +
                        "portanto não será(ão) validado(s). \n");
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao abrir arquivo(s).");
        }


    }

    public void filtroArquivos() {


        for (int i = 0; i < arquivosOk.length; i++) {
            String arquivo = arquivosOk[i].toString();
            System.out.println("\nLendo arquivo: " + arquivo);
            String linha;

            int numeroArquivo = i + 1;

            errosHG.add("\nArquivo: " + numeroArquivo);
            errosDT.add("\nArquivo: " + numeroArquivo);
            errosHL.add("\nArquivo: " + numeroArquivo);
            errosTL.add("\nArquivo: " + numeroArquivo);
            errosTG.add("\nArquivo: " + numeroArquivo);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))) {

                while ((linha = br.readLine()) != null) {
                    int linhaTotal = linha.length();
                    if (1200 == linhaTotal) {
                        String valorLinha = linha.substring(0, 1);
                        switch (valorLinha) {
                            case "0":
                                HeaderGeralArquivo hg = new HeaderGeralArquivo(linha);
                                hg.validarSessao();
                                listaErrosHG = hg.getQuantErrosHG();
                                if (listaErrosHG.isEmpty()) {
                                    errosHG.clear();
                                } else {
                                    errosHG.add(String.valueOf(hg.getQuantErrosHG()));
                                }
                                break;

                            case "1":
                                HeaderLote hl = new HeaderLote(linha);
                                hl.validarSessao();
                                listaErrosHL = hl.getQuantErrosHL();
                                if (listaErrosHL.isEmpty()) {
                                    errosHL.clear();
                                } else {
                                    errosHL.add(String.valueOf(hl.getQuantErrosHL()));
                                }
                                break;

                            case "2":
                                Detalhe dt = new Detalhe(linha);
                                dt.validarSessao();
                                listaErrosDT = dt.getQuantErrosDt();
                                if (listaErrosDT.isEmpty()) {
                                    errosDT.clear();
                                } else {

                                    errosDT.add(String.valueOf(dt.getQuantErrosDt()));
                                }
                                break;

                            case "3":
                                TraillerLote tl = new TraillerLote(linha);
                                tl.validarSessao();
                                listaErrosTL = tl.getQuantErrosTL();
                                if (listaErrosTL.isEmpty()) {
                                    errosTL.clear();
                                } else {
                                    errosTL.add(String.valueOf(tl.getQuantErrosTL()));
                                }
                                break;

                            case "9":
                                TraillerGeral tg = new TraillerGeral(linha);
                                tg.validarSessao();
                                listaErrosTG = tg.getQuantErrosTG();
                                if (listaErrosTG.isEmpty()) {
                                    errosTG.clear();
                                } else {
                                    errosTG.add(String.valueOf(tg.getQuantErrosTG()));
                                }
                                break;

                            default:
                                errosLinha.add("\nErro no arquivo " + numeroArquivo +
                                        ": Tipo Registro não apresenta " +
                                        "um valor válido. Valor apresentado: " + valorLinha);

                        }
                    } else {
                        errosLinha.add("\nERRO no arquivo " + numeroArquivo + ": na linha "
                                + br.readLine() + "\n com " + linhaTotal
                                + " caracteres, esperava-se 1200.\n");
                    }
                }
            } catch (FileNotFoundException|UnsupportedEncodingException e) {
                e.printStackTrace();
                System.err.println("Erro ao abrir o arquivo");
            } catch (IOException e){
                e.printStackTrace();
                System.err.println("Erro ao abrir o arquivo");
            }
        }
        if (!errosLinha.isEmpty()) {
            System.out.println("\nLinha(s) não será(ão) validada(s). " + errosLinha);
        }

    }

    public void opcoesMenu() {

        Menu menu = new Menu();
        menu.exibirSegundoMenu();

        Scanner ler = new Scanner(System.in);
        int escolha = ler.nextInt();
        conferirErros();
        do {
            if (escolha == 1) {

                menu.exibirTerceiroMenu();
                int escolha1 = ler.nextInt();
                switch (escolha1) {
                    case 1:

                        if (!errosHG.isEmpty()) {
                            for (Object s : errosHG) {
                                System.out.println(s);
                            } break;
                        } else {
                            System.out.println("Nenhum erro foi encontrado na sessão.");
                        } break;

                    case 2:
                        if (!errosHL.isEmpty()) {
                            for (Object s : errosHL) {
                                System.out.println(s);
                            } break;

                        } else {
                            System.out.println("Nenhum erro foi encontrado na sessão.");
                        } break;

                    case 3:
                        if (!errosDT.isEmpty()) {
                            for (Object s : errosDT) {
                                System.out.println(s);
                            } break;

                        } else {
                            System.out.println("Nenhum erro foi encontrado na sessão.");
                        } break;

                    case 4:
                        if (!errosTL.isEmpty()) {
                            for (Object s : errosTL) {
                                System.out.println(s);
                            } break;

                        } else {
                            System.out.println("Nenhum erro foi encontrado na sessão.");
                        } break;

                    case 5:
                        if (!errosTG.isEmpty()) {
                            for (Object s : errosTG) {
                                System.out.println(s);
                            } break;

                        } else {
                            System.out.println("Nenhum erro foi encontrado na sessão.");
                        } break;

                    case 6:
                        if (!errosLinha.isEmpty()) {
                            System.out.println("\nErros nas Linhas: " + errosLinha);
                        }
                        if (!errosHG.isEmpty()) {
                            System.out.println("\nErros do Header Geral: " + errosHG);
                        }
                        if (!errosHL.isEmpty()) {
                            System.out.println("\nErros do Header Lote: " + errosHL);
                        }
                        if (!errosDT.isEmpty()) {
                            System.out.println("\nErros do Detalhe: " + errosDT);
                        }
                        if (!errosTL.isEmpty()) {
                            System.out.println("\nErros do Trailler Lote: " + errosTL);
                        }
                        if (!errosTG.isEmpty()) {
                            System.out.println("\nErros do Trailler Geral: " + errosTG);
                        }
                        break;

                    case 7:
                        listaErrosHG.clear();
                        listaErrosHL.clear();
                        listaErrosDT.clear();
                        listaErrosTL.clear();
                        listaErrosTG.clear();

                        menu = new Menu();
                        menu.exibirPrimeiroMenu();
                        ler = new Scanner(System.in);
                        String caminho = ler.nextLine();
                        abrirArquivos(caminho);
                        filtroArquivos();
                        opcoesMenu();
                        conferirErros();
                        break;
                    case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente: ");

                }

            } else if (escolha == 2) {
                System.exit(2);

            } else if (escolha == 3) {
                menu.exibirPrimeiroMenu();
                String caminho2 = ler.next();
                abrirArquivos(caminho2);
                filtroArquivos();
            } else {
                System.out.println("Você informou uma opção inválida!");
                break;
            }
        } while (escolha == 2 || escolha == 1);

    }
    public void conferirErros() {
        if (listaErrosHG.isEmpty()) {
            errosHG.clear();
        }
        if (listaErrosHL.isEmpty()) {
            errosHL.clear();
        }
        if (listaErrosDT.isEmpty()) {
            errosDT.clear();
        }
        if (listaErrosTL.isEmpty()) {
            errosTL.clear();
        }
        if (listaErrosTG.isEmpty()) {
            errosTG.clear();
        }
    }
}


