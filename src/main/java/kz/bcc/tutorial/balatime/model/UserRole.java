package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "userRole", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class UserRole {
    @Id
    @SequenceGenerator(name = "userRole_id_seq",
            sequenceName = "userRole_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "userRole_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "role_name")
    private String role_name;
    @Column(name = "user_id")
    private String user_id;
}
