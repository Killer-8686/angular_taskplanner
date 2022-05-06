package ru.masta.springboot.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "ACTIVITY", schema = "tasklist", catalog = "angular_backend")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Activity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "activated", nullable = false)
    private Short activated;

    @NotBlank
    @Column(name = "uuid", nullable = false, length = -1)
    private String uuid;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

}
