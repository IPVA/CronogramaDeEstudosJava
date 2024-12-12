// Desafio:
// 1. Criar um sistema de processamento de pagamentos
// 2. Usar interfaces para simular herança múltipla
// 3. Demonstrar composição e delegação

public interface Taxable {
    double calculateTax();
}

public interface Discountable {
    double applyDiscount();
}

public abstract class PaymentProcessor implements Taxable, Discountable {
    // Implemente um sistema de processamento de pagamentos
    // que combine características de diferentes interfaces
    
    public abstract double processFinalPayment();
}

public class CreditCardPayment extends PaymentProcessor {
    // Implementação concreta com regras específicas
}
