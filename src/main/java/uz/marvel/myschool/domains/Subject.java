package uz.marvel.myschool.domains;

import jakarta.persistence.*;
import lombok.*;
import uz.marvel.myschool.dto.ParentsDTO;
import uz.marvel.myschool.dto.SubjectDTO;

import java.util.List;

/**
 * @author Shoniyazova Matlyuba
 * @project school_manegment_system-
 * @since 02/08/22  16:27 (Tuesday)
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    public static Subject toDomain(SubjectDTO dto) {
        return Subject.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .build();
    }

}
