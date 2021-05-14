package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "subject", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Subject {
    @Id
    @SequenceGenerator(name = "Subject_id_seq",
            sequenceName = "Subject_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Subject_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "sub_name")
    private String sub_name;

}