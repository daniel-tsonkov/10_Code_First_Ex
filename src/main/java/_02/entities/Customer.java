package _02.entities;

import javax.persistence.*;

@Entity
@Table(name = "_02_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String creditCardNumber;
}
