class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O primeiro parâmetro não pode ser maior que o segundo.");
    }
}
