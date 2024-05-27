package _02.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "_02_store_location")
public class StoreLoacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location_name", nullable = false)
    private String locationName;

    @OneToMany(targetEntity = Sale.class, mappedBy = "storeLocation")
    private Set<Sale> sales;

    public StoreLoacation() {}

    public StoreLoacation(String locationName) {
        this.locationName = locationName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
