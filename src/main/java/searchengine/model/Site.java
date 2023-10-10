package searchengine.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(columnDefinition = "Enum('INDEXING', 'INDEXED', 'FAILED'")
    String status;


    LocalDate statusTime;

    String error;

    String url;

    String name;
}
