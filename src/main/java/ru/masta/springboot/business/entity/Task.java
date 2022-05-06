package ru.masta.springboot.business.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masta.springboot.auth.entity.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "task", schema = "tasklist", catalog = "angular_backend")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Column(name = "completed", nullable = true)
    private Short completed;

    @Column(name = "task_date", nullable = true)
    private Timestamp taskDate;

    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

}
