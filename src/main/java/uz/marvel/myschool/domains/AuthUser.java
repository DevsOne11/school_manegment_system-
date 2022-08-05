package uz.marvel.myschool.domains;

import jakarta.persistence.*;
import lombok.*;
import uz.marvel.myschool.dto.AuthUserCreateDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "auth_user")
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private LocalDateTime created_at;
    private Position position;
    private Status status;


    public enum Position {
        STUDENT, TEACHER, PARENT;

        public static Position findByPositionName(String positionName) {
            for (Position position : values()) {
                if (position.name().equalsIgnoreCase(positionName)) {
                    return position;
                }
            }
            return STUDENT;
        }
    }

    public enum Status {
        ACTIVE, NOACTIVE;

        public static Status findByStatusName(String statusName) {
            for (Status status : values()) {
                if (status.name().equalsIgnoreCase(statusName)) {
                    return status;
                }
            }
            return NOACTIVE;
        }
    }

    public static AuthUser toDomain(AuthUserCreateDTO dto) {
        return AuthUser.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .position(Position.findByPositionName(dto.getPosition()))
                .status(Status.findByStatusName(dto.getStatus()))
                .created_at(LocalDateTime.parse(dto.getCreated_at()))
                .build();
    }



}

