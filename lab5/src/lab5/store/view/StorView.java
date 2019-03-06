package lab5.store.view;

import simulator.View;

public class StorView extends View {
	
	StoreState ss;
	Store store;
	
	// super(ss) anroppar state konstruktör med ss som argument 
	public Storeview(State ss) {
		super(ss);
	}
	
	
	//printar de initiala store state. 
	public void initialPrint() {
		System.out.println("Antal kassor, N..........: " + StoreState.getTotal());
		System.out.println("Max som ryms, M..........: " + StoreState.getTotal());
		System.out.println("Ankomsthastighet, lambda.: " + StoreState.lambda);
		System.out.println("Plocktider, [P_min..Pmax]: " + StoreState.);
		System.out.println("Betaltider, [K_min..Kmax]: " + StoreState.getTotal());
		System.out.println("Frö, f...................: " + StoreState.seed);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
