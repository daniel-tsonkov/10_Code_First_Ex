package _03;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
