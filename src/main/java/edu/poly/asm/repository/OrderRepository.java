package edu.poly.asm.repository;

import edu.poly.asm.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
//    List<Order> findById(String name);
//    Page<Order> findById(String name, Pageable pageable);
}
