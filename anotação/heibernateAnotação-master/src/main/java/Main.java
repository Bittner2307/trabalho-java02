
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Endereco;
import entities.Estudante;
import util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Endereco endereco = new Endereco("OMR Road", "Chennai", "TN", "600097");

            session.save(endereco);
			Estudante estudante1 = new Estudante("Felipe", endereco);
			Estudante estudante2 = new Estudante("Felisberto", endereco);
			session.save(estudante1);
			session.save(estudante2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}