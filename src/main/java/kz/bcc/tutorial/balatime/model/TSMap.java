package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "tSMap", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class TSMap {
    @Id
    @SequenceGenerator(name = "ts_id_seq",
            sequenceName = "ts_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ts_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "t_id")
    private Integer t_id;
    @Column(name = "s_id")
    private Integer s_id;
}
