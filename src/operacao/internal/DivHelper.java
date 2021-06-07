package operacao.internal;

import operacao.Operacao;

public class DivHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
