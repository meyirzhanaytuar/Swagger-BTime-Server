package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "time_table", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class TimeTable {
    @Id
    @SequenceGenerator(name = "time_table_id_seq",
            sequenceName = "time_table_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "time_table_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "time")
    private String time;
    @Column(name = "subject_id")
    private Integer subject_id;
    @Column(name = "group_id")
    private Integer group_id;
    @Column(name = "teacher_id")
    private Integer teacher_id;
    @Column(name = "room_id")
    private Integer room_id;
}
