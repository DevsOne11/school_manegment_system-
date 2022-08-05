package uz.marvel.myschool.dto;

import lombok.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  13:58 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class GradeDTO {
    private Long id;
    private String name;
    private String  year;
    private String active_year;
    private String status;

    public static GradeDTO toDTO(HttpServletRequest request) {
        return GradeDTO.builder().name(request.getParameter("name"))
                .year(request.getParameter("year"))
                .active_year(request.getParameter("active_year"))
                .status(request.getParameter("status"))
                .build();
    }
}
