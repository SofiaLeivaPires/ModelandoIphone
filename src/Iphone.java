public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
        // Código para tocar música
    }

    public void pausar() {
        // Código para pausar música
        System.out.println("MÚSICA PAUSADA");
    }

    public void selecionarMusica(String musica) {
        // Código para selecionar música
        System.out.println("MÚSICA SELECIONADA");
    }

    // Implementação dos métodos de AparelhoTelefonico
    public void ligar(String numero) {
        // Código para ligar
        System.out.println("LIGANDO PARA..."+ numero);
    }

    public void atender() {
        // Código para atender
        System.out.println("ATENDENDO TELEFONE");
    }

    public void iniciarCorreioVoz() {
        // Código para iniciar correio de voz
        System.out.println("INICIAR CORREIO DE VOZ");
    }

    // Implementação dos métodos de NavegadorNaInternet
    public void exibirPagina(String url) {
        // Código para exibir página
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
        // Código para adicionar nova aba
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        // Código para atualizar página
        System.out.println("ATUALIZANDO PÁGINA");
    }
}