
package fibonacci;


public class FibonacciService implements FibonacciInterface{

    @Override
    public int next(int atual, int anterior) {
        return atual + anterior;
    }

    @Override
    public String fibo(int n) {
        if(n == 0){
            return "Não é Valido";
        }
        
        if(n == 1){
            return "1";
        }
        String fibonacci = "1 ";
        int atual= 1;
        int anterior = 0;
        
        for (int i = 1; i < n; i++) {
            atual+= anterior;
            next(atual, anterior);
            anterior = atual - anterior;
            fibonacci += String.valueOf(atual)+" ";
        }
        
        return fibonacci;
        
    }
}
