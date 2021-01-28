package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateXMLConfStarter {
	public static void main(String[] args) {

		// create configuartion object with credentionls to DB
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Set<Item> seti = new HashSet<>();
		Item i1 = new Item(5.);
		Item i2 = new Item(6.);
		Item i3 = new Item(7.);
		Item i4 = new Item(8.);
		seti.add(i1);
		seti.add(i2);
		seti.add(i3);
		seti.add(i4);
		Transaction transaction = session.beginTransaction();
		Cart cart1 = new Cart(2., "cart1", seti);
		session.persist(cart1);
		transaction.commit();
		session.close();

	}

}
