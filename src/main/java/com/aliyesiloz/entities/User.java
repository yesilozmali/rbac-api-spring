package com.aliyesiloz.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users") // "user" SQL'de reserved keyword olduğu için çoğul yazdık
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String fullName;
    
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Column(unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName = "id",  nullable = false)
    private Role role;
    
    enum Status {
    	ACTIVE, INACTIVE
    	}
}