package project.myshop.member.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "create_dt",updatable = false)
    @CreatedDate
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    @LastModifiedDate
    private LocalDateTime updateDt;

    @Column(name = "delete_dt")
    private LocalDateTime deleteDt;

    @Column(name = "login_type")
    @Enumerated(EnumType.STRING)
    private LoginType loginType;

    @Column(name = "role")
    private String role;
}
