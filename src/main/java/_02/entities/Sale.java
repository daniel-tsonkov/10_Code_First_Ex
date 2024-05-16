package _02.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "_02_sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "store_location_id", referencedColumnName = "id")
    private StoreLoacation storeLoacation;

    public Sale() {
    }

    public Sale(Product product, Customer customer, StoreLoacation storeLoacation) {
        this.product = product;
        this.customer = customer;
        this.storeLoacation = storeLoacation;

        this.date = LocalDate.now();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public StoreLoacation getStoreLoacation() {
        return this.storeLoacation;
    }

    public void setStoreLoacation(StoreLoacation storeLoacation) {
        this.storeLoacation = storeLoacation;
    }
}
