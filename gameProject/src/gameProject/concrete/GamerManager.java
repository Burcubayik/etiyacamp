package gameProject.concrete;

import java.rmi.RemoteException;

import gameProject.abstracts.CheckGamerService;
import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService, CheckGamerService {
	private CheckGamerService checkGamerService;
	Gamer gamer;
	
	public GamerManager(CheckGamerService checkGamerService) {
		this.checkGamerService=checkGamerService;
	}

	@Override
	public void add(Gamer gamer) throws RemoteException {
		
		if(checkGamerService.CheckIfRealPerson(gamer)) {
			System.out.println("kullan�c� eklendi :"+ gamer.getFirstName());
		}
		else {
			System.out.println("hata");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("kullan�c� g�ncellendi :"+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("kullan�c� silindi :"+ gamer.getFirstName());
	}

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {
		
		return true;
	}
	
	

	

}
