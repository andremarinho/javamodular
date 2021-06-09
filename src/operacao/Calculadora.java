package operacao;

import operacao.internal.DivHelper;
import operacao.internal.MulHelper;
import operacao.internal.SubHelper;
import operacao.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private DivHelper divHelper;
    private MulHelper mulHelper;

    public Calculadora(){
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
        divHelper = new DivHelper();
        mulHelper = new MulHelper();
    }

    public int sum(int a, int b){
        return this.sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return this.subHelper.execute(a,b);
    }

    public int mul(int a, int b){
        return this.mulHelper.execute(a,b);
    }

    public int div(int a, int b){
        return this.subHelper.execute(a,b);
    }

}
