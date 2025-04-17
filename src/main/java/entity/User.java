package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "username", nullable = false, length = 100)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "email")
  private String email;

  @Column(name = "phone", length = 20)
  private String phone;

  @Lob
  @Column(name = "role", nullable = false)
  private String role;

  @Column(name = "created_at")
  private Instant createdAt;

}