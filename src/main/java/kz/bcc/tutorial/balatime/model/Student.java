package kz.bcc.tutorial.balatime.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "student", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Student {
    @Id
    @SequenceGenerator(name = "student_id_seq",
            sequenceName = "student_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "sgroupid")
    private Integer sgroupid;
    @Column(name = "userid")
    private Integer userid;
    @ManyToOne
    @JoinColumn(name="userid", insertable = false, updatable = false)
    private User studentrole;
    @ManyToOne
    @JoinColumn(name="sgroupid", insertable = false, updatable = false)
    private Group studentgroup;
}
