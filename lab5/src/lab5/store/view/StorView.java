package lab5.store.view;

import simulator.View;

public class StorView extends View {

	StoreState ss;
	Store store;

	// super(ss) anroppar state konstruktör med ss som argument
	public Storeview(State ss) {
		super(ss);
	}

	// printar de initiala store state.
	public void initialPrint() {
		System.out.println("Antal kassor, N..........: " + StoreState.getTotal());
		System.out.println("Max som ryms, M..........: " + StoreState.getTotal());
		System.out.println("Ankomsthastighet, lambda.: " + StoreState.lambda);
		System.out.println("Plocktider, [P_min..Pmax]: ["+ StoreState.browsingTimeMin+".."+StoreState.browsingTimeMax+"]");
		System.out.println("Betaltider, [K_min..Kmax]: ["+StoreState.cashRegisterTimeMin+".."+StoreState.cashRegistertimMax+"]");
		System.out.println("Frö, f...................: " + StoreState.seed);
		System.out.println("----------------------------------------------------");
		System.out.printf("%4s %9s %9s %7s %11s %7s %11s %11s %13s %14s %14s %13s\n", "Tid", "Händelse","Kund","?", "led", "ledT", "I", "kr", ":-(", "köat", "köar", "[Kassakö..]");
		
		//test
		
		
	}
	
	public void endPrint() {
		
		System.out.println("----------------------------------------------------");
		System.out.println("1)"+Av 23 kunder handlade 22 medan 1 missades.);
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
