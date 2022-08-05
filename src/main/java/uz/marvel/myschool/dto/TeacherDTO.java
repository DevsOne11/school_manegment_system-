package uz.marvel.myschool.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;
import uz.marvel.myschool.domains.Subject;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  14:05 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class TeacherDTO {
    private Long id;
    private String fullname;
    private String user_id;
    private String specialization;
    private List<Subject> subjects;



    public static TeacherDTO toDTO(HttpServletRequest request) {
        return TeacherDTO.builder().fullname(request.getParameter("fullname"))
                .fullname(request.getParameter("fullname"))
                .user_id(request.getParameter("user_id"))
                .specialization(request.getParameter("specialization"))
                .build();
    }
}
