package tranminhhuy.demo.enntity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name =  "category")
public class Cartegory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name"0)
    private  String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Book> book;

}

