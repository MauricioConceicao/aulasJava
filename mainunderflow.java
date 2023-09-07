public class mainunderflow {
    public static void main(String[] args) {
        underflow pilha = new underflow();

        try {
            pilha.desempilhar();
        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }

        pilha.empilhar(10);
        pilha.empilhar(20);

        try {
            System.out.println("Elemento desempilhado: " + pilha.desempilhar());
            System.out.println("Elemento desempilhado: " + pilha.desempilhar());
            System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }
    }
}
