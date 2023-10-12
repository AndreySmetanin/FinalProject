package searchengine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "site")
@NoArgsConstructor
@Getter
@Setter
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "Status_time", columnDefinition = "DATETIME")
    private Date statusTime;

    @Column(name = "last_error", nullable = false, columnDefinition = "TEXT")
    private String error;

    @Column(name = "url", columnDefinition = "VARCHAR(255)")
    private String urlSite;

    @Column(name = "name", columnDefinition = "VARCHAR(255)")
    private String nameSite;
}
