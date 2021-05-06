package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "timeTable", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class TimeTable {
    @Id
    @SequenceGenerator(name = "timeTable_id_seq",
            sequenceName = "timeTable_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "timeTable_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "time")
    private String time;
    @Column(name = "sub_id")
    private Integer sub_id;
    @Column(name = "g_id")
    private Integer g_id;
    @Column(name = "t_id")
    private Integer t_id;
    @Column(name = "r_id")
    private Integer r_id;
}
