package uz.marvel.myschool.domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;

    private Long user_id;
    private String specialization;
    @ManyToMany
    @JoinTable(
            name="Teacher-subjects",
            joinColumns=
            @JoinColumn(name="teacher_id", referencedColumnName="ID"),
            inverseJoinColumns=
            @JoinColumn(name="subject_id", referencedColumnName="ID")
    )

    private List<Subject> subjects;


}
