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
    @SequenceGenerator(name = "tsmap_tsId_seq",
            sequenceName = "tsmap_tsId_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "tsmap_tsId_seq")
    @Column(name = "tsId")
    private Integer tsId;
    @Column(name = "tId")
    private Integer tId;
    @Column(name = "sId")
    private Integer sId;
}
