package com.example.orderservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@EnableJpaAuditing
@Table(name = "\"order\"")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Integer totalQuantity;
    private Integer totalPrice;
    @OneToMany(mappedBy="order")
    private List<OrderItem> orderItemLists;

}
