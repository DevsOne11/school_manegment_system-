package uz.marvel.myschool.domains;

import jakarta.persistence.*;
import lombok.*;
import uz.marvel.myschool.dto.ParentsDTO;
import uz.marvel.myschool.dto.StudentDTO;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    private String fullname;
    private Long grade_id;
    private Long tutor_id;
    @ManyToMany
    @JoinTable(
            name="XYZ",
            joinColumns=
            @JoinColumn(name="student_id", referencedColumnName="ID"),
            inverseJoinColumns=
            @JoinColumn(name="parent_id", referencedColumnName="ID")
    )
    private List<Parents> parents;

    public static Student toDomain(StudentDTO dto) {
        return Student.builder()
                .user_id(Long.valueOf(dto.getUser_id()))
                .fullname(dto.getFullname())
                .grade_id(Long.valueOf(dto.getGrade_id()))
                .tutor_id(Long.valueOf(dto.getTutor_id()))
                .build();
    }

}
