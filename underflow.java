import java.util.*;

class underflow {
    private ArrayList<Integer> elementos;

    public underflow() {
        this.elementos = new ArrayList<>();
    }

    public void empilhar(int elemento) {
        this.elementos.add(elemento);
    }

    public int desempilhar() throws PilhaVaziaException {
        if (this.elementos.isEmpty()) {
            throw new PilhaVaziaException("Erro: Tentativa de desempilhar de uma pilha vazia.");
        }
        return this.elementos.remove(this.elementos.size() - 1);
    }
}

class PilhaVaziaException extends Exception {
    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
}

