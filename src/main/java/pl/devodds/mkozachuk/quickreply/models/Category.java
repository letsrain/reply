package pl.devodds.mkozachuk.quickreply.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category_name;

}
