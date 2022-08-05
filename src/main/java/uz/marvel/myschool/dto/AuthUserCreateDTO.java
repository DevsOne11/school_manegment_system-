package uz.marvel.myschool.dto;

import jakarta.persistence.Column;
import lombok.*;
import uz.marvel.myschool.domains.AuthUser;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @author Shoniyazova Matlyuba
 * @project myschool
 * @since 03/08/22  14:26 (Wednesday)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AuthUserCreateDTO {
    private Long id;
    private String username;
    private String password;
    private String created_at;
    private String position;
    private String status;


    public static AuthUserCreateDTO toDTO(HttpServletRequest request) {
        return AuthUserCreateDTO.builder().username(request.getParameter("username"))
                .password(request.getParameter("password"))
                .created_at(request.getParameter("created_at"))
                .position(request.getParameter("position"))
                .status(request.getParameter("status"))
                .build();
    }
}
