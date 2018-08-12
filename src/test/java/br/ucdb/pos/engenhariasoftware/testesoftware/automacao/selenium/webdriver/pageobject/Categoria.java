package br.ucdb.pos.engenhariasoftware.testesoftware.automacao.selenium.webdriver.pageobject;

public enum Categoria {
    ALIMENTACAO("ALIMENTACAO"),
    SALARIO("SALARIO"),
    LAZER("LAZER"),
    TELEFONE_INTERNET("TELEFONE_INTERNET"),
    CARRO("CARRO"),
    EMPRESTIMO("EMPRESTIMO"),
    INVESTIMENTOS("INVESTIMENTOS"),
    OUTROS("OUTROS");

    private Categoria(final String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }
}
