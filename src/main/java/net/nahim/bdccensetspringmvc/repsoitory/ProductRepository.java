package net.nahim.bdccensetspringmvc.repsoitory;

import net.nahim.bdccensetspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
