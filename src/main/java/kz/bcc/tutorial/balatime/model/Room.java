package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "room", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Room {
    @Id
    @SequenceGenerator(name = "room_id_seq",
            sequenceName = "room_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "room_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "room_name")
    private String room_name;
}
