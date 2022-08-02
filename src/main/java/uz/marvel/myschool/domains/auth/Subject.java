package uz.marvel.myschool.domains.auth;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private Long description;
    private Long grade;
}
