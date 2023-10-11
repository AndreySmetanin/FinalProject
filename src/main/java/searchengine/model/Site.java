package searchengine.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "Enum('INDEXING', 'INDEXED', 'FAILED'")
    //@Column(columnDefinition = "Enum")
    private String status;

    @Column(name = "Status_time")
    private Date statusTime;

    @Column(name = "last_error")
    private String error;

    @Column(name = "url")
    private String urlSite;

    @Column(name = "name")
    private String nameSite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getUrl() {
        return urlSite;
    }

    public void setUrl(String url) {
        this.urlSite = url;
    }

    public String getName() {
        return nameSite;
    }

    public void setName(String name) {
        this.nameSite = name;
    }
}
