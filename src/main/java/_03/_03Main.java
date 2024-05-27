package _03;

import _02.entities.Customer;
import _02.entities.Product;
import _02.entities.Sale;
import _02.entities.StoreLoacation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class _03Main
{
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("CodeFirstEx");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        /*Product product = new Product("product", 123, BigDecimal.TEN);
        Customer customer = new Customer("cName", "asd@asd.asd", "12345");
        StoreLoacation loacation = new StoreLoacation("ssstore");
        Sale sale = new Sale(product, customer, loacation);

        entityManager.persist(product);
        entityManager.persist(customer);
        entityManager.persist(loacation);
        entityManager.persist(sale);*/

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
