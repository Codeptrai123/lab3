package tranminhhuy.demo.enntity;
import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Data;
@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name ="author")
    private String author;
    @Column(name = "price")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
