package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "lesson", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Lesson {
    @Id
    @SequenceGenerator(name = "lesson_id_seq",
            sequenceName = "lesson_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lesson_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "subId")
    private Integer subId;
    @Column(name = "date")
    private Date date;
    @Column(name = "topic")
    private String topic;
}
