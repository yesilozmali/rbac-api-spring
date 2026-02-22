package com.aliyesiloz.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String name;


@Column(unique = true)
private String barcode;


private BigDecimal price;
private String description;
private LocalDateTime createdAt;
}