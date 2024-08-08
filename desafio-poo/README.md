## Diagrama de Classe - Iphone

classDiagram

    iPhone ..|> ReprodutorMusical : implements
    iPhone ..|> AparelhoTelefonico : implements
    iPhone ..|> NavegadorInternet : implements
    iPhone : +String cor
    iPhone : +String modelo
    iPhone: + tocar() void
    iPhone: + pausar() void
    iPhone: + selecionarMusica(String musica)
    iPhone: + ligar(String numero) void
    iPhone: + atender() void
    iPhone: + iniciarCorreioVoz() void
    iPhone: + exibirPagina(String url)
    iPhone: + adicionarNovaAba() void
    iPhone: + atualizarPagina() void

    class ReprodutorMusical{
    <<interface>>
        + tocar() void
        + pausar() void
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico{
        <<interface>>
        + ligar(String numero) : void
        + atender() : void
        + iniciarCorreioVoz() : void
    }

    class NavegadorInternet{
        <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }