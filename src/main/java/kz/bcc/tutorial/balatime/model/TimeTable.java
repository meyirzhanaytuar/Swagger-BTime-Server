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
    @Column(name = "subId")
    private Integer subId;
    @Column(name = "gId")
    private Integer gId;
    @Column(name = "tId")
    private Integer tId;
    @Column(name = "rId")
    private Integer rId;
}
