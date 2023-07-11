package me.apella.reviewskill.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long achievementId;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAwarded;
}
