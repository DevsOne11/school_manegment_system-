package uz.marvel.myschool.dto;

import lombok.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  14:02 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ParentsDTO {
    private Long id;
    private String fullname;
    private Long user_id;

    public static ParentsDTO toDTO(HttpServletRequest request) {
        return ParentsDTO.builder().fullname(request.getParameter("fullname"))
                .user_id(Long.valueOf(request.getParameter("user_id")))
                .build();
    }
}
