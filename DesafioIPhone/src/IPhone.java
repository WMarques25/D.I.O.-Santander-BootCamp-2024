public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando Musica...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando..");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }
    
}
