package uz.marvel.myschool.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;
import uz.marvel.myschool.domains.Parents;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  14:03 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentDTO {
    private Long id;
    private String  user_id;
    private String fullname;
    private String grade_id;
    private String tutor_id;
    private List<Parents> parents;

    public static StudentDTO toDTO(HttpServletRequest request) {
        return StudentDTO.builder().user_id(request.getParameter("user_id"))
                .fullname(request.getParameter("fullname"))
                .grade_id(request.getParameter("grade_id"))
                .tutor_id(request.getParameter("tutor_id"))
                .build();
    }
}
