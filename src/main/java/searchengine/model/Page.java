package searchengine.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "site_id")
    private int siteId;

    private String path;
    private int code;
    private String content;
}
