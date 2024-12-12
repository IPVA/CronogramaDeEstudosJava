public class DynamicValidationFramework {
    // Desafio:
    // 1. Criar framework de validação usando reflexão
    // 2. Implementar anotações personalizadas
    // 3. Validação dinâmica de objetos
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Validate {
        // Anotação personalizada para validação
    }
    
    public class Validator {
        public boolean validate(Object obj) {
            // Use reflexão para validar campos dinamicamente
        }
    }
}
