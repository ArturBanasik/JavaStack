import java.util.Scanner;
public class TestStos extends Stos {
	public TestStos(int MaxSize) {
		super(MaxSize);
	}

	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("\tSTOS");
		System.out.println("Stworzyæ stos? T/N? ");
		String chosen = userInput.next();
		String finish;
		int chosenNum = 0;
		
		if (chosen.equals("T") || chosen.equals("t")) {
				System.out.print("Wybierz rozmiar stosu: ");
				chosenNum = userInput.nextInt();
				System.out.println("Utworzono stos");
				
			}
		else {
				  System.exit(0);
		
		}
		
		Stos objectS = new Stos(chosenNum);
		do {
		//System.out.println("Stos ma " + chosenNum +" elementów.\n\nCo teraz?");
		System.out.println("1.Dodaj nowy element do stosu");
		System.out.println("2.Usuñ ostatni element ze stosu");
		System.out.println("3.Wyœwietl wszystkie elementy ze stosu");
		System.out.println("4.Wyœwietl maksimum stosu");
		System.out.println("5.Sprawdz czy stos jest pusty");
		System.out.println("6.Wyczyœæ stos");
		chosenNum = userInput.nextInt();
		
		if (chosenNum==1) {
			System.out.println("Jak¹ wartoœæ chcesz dodaæ? ");
			double added = userInput.nextDouble();
			objectS.Push(added);
		
		}
		else if (chosenNum==2) objectS.Pop();
		else if (chosenNum==3) objectS.display();
		else if (chosenNum==4) System.out.println(objectS.getMaxStackSize());
		else if (chosenNum==5) objectS.isEmpty();
		else if (chosenNum==6) objectS.clear();
		
		System.out.println("Kontynuowaæ? T/N");
		 finish = userInput.next();
		
		} while (finish.equals("T") || finish.equals("t"));
		
	}


}
