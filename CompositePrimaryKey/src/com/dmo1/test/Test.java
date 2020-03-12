package com.dmo1.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmo1.entities.Book;
import com.dmo1.entities.BookPk;
import com.dmo1.helper.SessionFactoryRegistry;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Book b1 = null;
		BookPk pk = new BookPk();

		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			pk.setAuthor("Ravi");
			pk.setBookId(1);
			
			b1 = new Book();
			b1.setBookName("White house");
			b1.setIsbn("ISNKpo09");
			b1.setPk(pk);
			b1.setPublishedDt(new Date());
			
			pk = (BookPk) session.save(b1);
			System.out.println(b1);
			
//			Book b1 = new Book();
//			b1.setAuthor("Wrox Author");
//			b1.setBookId(1);

//			b1.setBookId(1);
//			b1.setAuthor("Wrox women");
//			b1.setBookName("franslstine");
//			b1.setPublishedDt(new Date());
//			b1.setIsbn("ISB0019");
//			Object id = session.save(b1);
//			System.out.println(id);

//			Book bdata =(Book)session.get(Book.class, b1);
//			System.out.println(bdata);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				SessionFactoryRegistry.close();
			}
		}
	}
}
