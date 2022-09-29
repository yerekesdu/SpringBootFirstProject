package kz.springboot.springbootdemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopItems {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private int amount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Countries country;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Categories> categories;

}
