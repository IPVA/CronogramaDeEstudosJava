// Desafio:
// 1. Usar records para modelagem de domínio
// 2. Implementar pattern matching avançado
// 3. Demonstrar sealed classes

public sealed interface Vehicle 
    permits Car, Truck, Motorcycle {
    // Implemente hierarquia de veículos
    // com pattern matching complexo
}

public record VehicleAnalyzer() {
    // Métodos de análise usando pattern matching
    public String analyzeVehicle(Vehicle vehicle) {
        return switch(vehicle) {
            // Implemente correspondência de padrões complexa
        };
    }
}
