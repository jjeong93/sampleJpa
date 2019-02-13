package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Books;
import entity.Publisher;
import entity.RentHistory;
import entity.Users;

public class JpaMain {

	public static void main(String[] args) {
		//entityFacotry DB 정보 설정
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rental");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		try {
			/*Users users = new Users();
			Publisher publisher = new Publisher();
			em.persist(users);
			em.persist(publisher);
			
			Books books = new Books();
			books.setPublisher(publisher);
			em.persist(books);
			RentHistory rentHistory = new RentHistory();
			rentHistory.setBooks(books);
			rentHistory.setUsers(users);
			em.persist(rentHistory);*/
			
			em.flush();
			em.clear();
			/*
			RentHistory readRH =  em.find(RentHistory.class, rentHistory.getRentNo());
			//Books readBooks = readRH.getBooks();
			Users readUsers = readRH.getUsers();*/
			
			
			/*
			Books readBooks = em.find(Books.class, books.getBookNo());
			//readBooks.setAuthor("소설가");
			Publisher readPublisher = readBooks.getPublisher();
			//readPublisher.setEstablishedDate("20190211");
			//System.out.println(readBooks);*/
			String paramQuery = "select t1 from Books t1 where t1.author=:author";
			List<Books> booksList = em.createQuery(paramQuery,Books.class)
					.setParameter("author", "작가")
					.setFirstResult(0).setMaxResults(5).getResultList();
			/*
			String query = "select t1 from Books t1 join fetch t1.publisher";

			List<Books> booksList = em.createQuery(query,Books.class)
					.setFirstResult(0).setMaxResults(5).getResultList();*/
			
			for(Books book : booksList) {
				System.out.println("book==>"+book.toString());
				System.out.println("Publisher==>"+book.getPublisher().toString());
			}
			
			//System.out.println(readUsers);
			//System.out.println(booksList.toString());
			//System.out.println("test");
			
			tx.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			// TODO: handle exception
		}
		finally {
			emf.close();
		}
		
		
		
	}
	
}
