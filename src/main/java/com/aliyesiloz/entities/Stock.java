package com.aliyesiloz.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "stock",
uniqueConstraints = @UniqueConstraint(columnNames = {"store_id", "product_id"}))
public class Stock {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "store_id", nullable = false)
private Store store;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "product_id", nullable = false)
private Product product;


private Integer quantity;
private LocalDateTime updatedAt;
}