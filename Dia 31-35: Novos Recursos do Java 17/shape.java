// Crie um sistema usando:
// 1. Sealed classes
// 2. Pattern matching
// 3. Records
public sealed interface Shape 
    permits Circle, Rectangle, Triangle {
    // Implementação de formas geométricas
    // com pattern matching
}
