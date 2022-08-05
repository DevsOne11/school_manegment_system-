package uz.marvel.myschool.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import uz.marvel.myschool.dto.GradeDTO;
import uz.marvel.myschool.dto.ParentsDTO;


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
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private Long user_id;

    public static Parents toDomain(ParentsDTO dto) {
        return Parents.builder()
                .fullname(dto.getFullname())
                .user_id(dto.getUser_id())
                .build();
    }
}
