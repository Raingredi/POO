
public class ContaCorrente extends Conta 
                            implements Comparable<ContaCorrente> {

        // ... todo o código anterior fica aqui

        public int compareTo(ContaCorrente outra) {
          if (this.saldo < outra.saldo) {
            return -1;
          }

          if (this.saldo > outra.saldo) {
            return 1;
          }

          return 0;
        }
    }
