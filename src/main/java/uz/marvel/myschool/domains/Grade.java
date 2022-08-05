package uz.marvel.myschool.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import uz.marvel.myschool.dto.AuthUserCreateDTO;
import uz.marvel.myschool.dto.GradeDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity

public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private int year;
    private int active_year;
    private Status status;

    public enum Status {
        ACTIVE, NOACTIVE;

        public static Grade.Status findByStatusName(String statusName) {
            for (Grade.Status status : values()) {
                if (status.name().equalsIgnoreCase(statusName)) {
                    return status;
                }
            }
            return NOACTIVE;
        }
    }

    public static Grade toDomain(GradeDTO dto) {
        return Grade.builder()
                .name(dto.getName())
                .year(Integer.parseInt(dto.getYear()))
                .active_year(Integer.parseInt(dto.getActive_year()))
                .status(Grade.Status.findByStatusName(dto.getStatus()))
                .build();
    }
}
