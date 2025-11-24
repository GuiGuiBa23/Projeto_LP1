public class ServicoAutenticacao {

    // Simula um banco de dados de clientes (Regra de Negócio)
    private static final Cliente CLIENTE_REGISTRADO =
            new Cliente("Cliente Exemplo", "123.456.789-00", "senha123");

    /**
     * Tenta realizar o login e autenticar o usuário.
     * @param nome O nome do cliente.
     * @param cpf O CPF do cliente.
     * @param senha A senha para autenticação.
     * @return true se o login for bem-sucedido, false caso contrário.
     */
    public boolean login(String nome, String cpf, String senha) {
        // Validação da Senha (Regra de Negócio: máx 8 caracteres)
        if (senha == null || senha.length() > 8) {
            System.out.println("❌ Falha na Autenticação: A senha deve ter no máximo 8 caracteres.");
            return false;
        }

        // Validação de Nome e CPF (Regra de Negócio: Cliente insere nome e CPF válido)
        if (nome == null || cpf == null || nome.isEmpty() || cpf.isEmpty()) {
            System.out.println("❌ Falha na Autenticação: Nome e CPF não podem ser vazios.");
            return false;
        }

        // Simulação da verificação (Apenas um usuário para exemplo)
        if (nome.equals(CLIENTE_REGISTRADO.getNome()) &&
                cpf.equals(CLIENTE_REGISTRADO.getCpf()) &&
                senha.equals(CLIENTE_REGISTRADO.getSenha())) {

            System.out.println("✅ Login bem-sucedido! Bem-vindo(a), " + nome + ".");
            return true;
        } else {
            System.out.println("❌ Falha na Autenticação: Nome, CPF ou senha incorretos.");
            return false;
        }
    }
}