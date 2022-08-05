package uz.marvel.myschool.dto;

import lombok.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  14:04 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class SubjectDTO {
    private Long id;
    private String name;
    private String description;



    public static SubjectDTO toDTO(HttpServletRequest request) {
        return SubjectDTO.builder().name(request.getParameter("name"))
                .description(request.getParameter("description"))
                .build();
    }

}
