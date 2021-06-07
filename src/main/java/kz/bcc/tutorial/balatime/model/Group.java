package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "group", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Group {
    @Id
    @SequenceGenerator(name = "group_id_seq",
            sequenceName = "group_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "group_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "groupname")
    private String group_name;
    @Column(name = "adviserid")
    private Integer adviserid;
    @ManyToOne
    @JoinColumn(name="adviserid", insertable = false, updatable = false)
    private Teacher groupTeacher;
}
