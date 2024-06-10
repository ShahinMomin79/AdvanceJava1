package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TeamPlayerDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("HibernateMapping");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		TeamDTO team=new TeamDTO();
		team.setCity("mumbai");
		team.setCoach("mark");
		team.setId(1);
		team.setTeamName("mumbai indians");
		manager.persist(team);
		
		
		PlayersDTO player1=new PlayersDTO();
		player1.setId(1);
		player1.setPname("dhoni");
		player1.setJerseyNo(7);
		player1.setRole("batsman");
		player1.setTeam(team);
		manager.persist(player1);
		
		
		PlayersDTO player2=new PlayersDTO();
		player2.setId(2);
		player2.setPname("virat kohli");
		player2.setJerseyNo(32);
		player2.setRole("batsman");
		player2.setTeam(team);
		manager.persist(player2);
		
		PlayersDTO player3=new PlayersDTO();
		player3.setId(3);
		player3.setPname("bumrah");
		player3.setJerseyNo(67);
		player3.setRole("bowler");
		player3.setTeam(team);
		manager.persist(player3);
		
		transaction.commit();
		closeConnection();
		
		
	}

}
