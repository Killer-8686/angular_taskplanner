package ru.masta.springboot.business.entity;

import lombok.*;
import ru.masta.springboot.auth.entity.User;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "priority", schema = "tasklist", catalog = "angular_backend")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Priority {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Column(name = "color", nullable = false, length = -1)
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

}
