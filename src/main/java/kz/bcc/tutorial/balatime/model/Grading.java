package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "grading", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Grading {
    @Id
    @SequenceGenerator(name = "grading_id_seq",
            sequenceName = "grading_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "grading_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "studId")
    private Integer studId;
    @Column(name = "grade")
    private String grade;
    @Column(name = "timetableId")
    private Integer timetableId;
}
