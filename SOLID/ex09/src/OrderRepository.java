public interface OrderRepository {
    void save(String id);
}



/*
 * // - OrderController directly created SqlOrderRepository.
 *  - Tight coupling: controller depended on a concrete class.
 Violated Dependency Inversion Principle (DIP):
  High-level module (OrderController) was depending on a low-level module (SqlOrderRepository).
 */

  // Introduced OrderRepository interface (abstraction).
// - SqlOrderRepository implements OrderRepository.
// - OrderController depends on OrderRepository (abstraction), not a concrete class.
// - Dependency injected at runtime (constructor injection).
// - Follows DIP: both high-level and low-level modules depend on abstractions.
// - Flexible: can plug in SqlOrderRepository, InMemoryOrderRepository, MongoOrderRepository, etc.