public class InformacaoFarmacia {
    private static final String NOME_EMPRESA = "Bem-Estar E-commerce";
    private static final String TELEFONE_CONTATO = "(11) 98765-4321";
    private static final String ENDERECO_MATRIZ = "Rua da Praticidade, 1000 - Centro";
    private static final String CNPJ = "00.000.000/0001-00";


    public static void exibirInformacoes() {
        System.out.println("\n--- ℹ️ Informações sobre " + NOME_EMPRESA + " ---");
        System.out.println("Objetivo: Resolver soluções práticas do dia a dia do cliente (urgências, agilidade na compra/entrega, etc.). [cite: 34]");
        System.out.println("Telefone de Contato: " + TELEFONE_CONTATO);
        System.out.println("Endereço Matriz: " + ENDERECO_MATRIZ);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("---------------------------------------------");
    }
}