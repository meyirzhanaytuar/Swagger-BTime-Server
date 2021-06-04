package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "teacher", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_id_seq",
            sequenceName = "teacher_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "teacher_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "userid")
    private Integer userid;
    @ManyToOne
    @JoinColumn(name="userid", insertable = false, updatable = false)
    private User teacher;

}
