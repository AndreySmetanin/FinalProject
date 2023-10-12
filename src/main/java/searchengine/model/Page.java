package searchengine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "page")
@NoArgsConstructor
@Getter
@Setter
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "site_id", columnDefinition = "INT")
    private int siteId;

    @Column(columnDefinition = "TEXT")
    private String path;

    @Column(columnDefinition = "INT")
    private int code;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;
}
