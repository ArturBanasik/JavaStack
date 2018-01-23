public class Stos {
	
	//Definicja tablicy przechowuj¹cej dane stosu
	double[] tab;
	int fFree;
	
	//Konstruktor inicjujacy rozmiar stosu
	public Stos(int MaxSize) {
		tab = new double[MaxSize];
		fFree = 0;
	}
	
	//Metoda zwracajaca rozmiar stosu / d³ugoœæ tablicy
	int getMaxStackSize() {
		return tab.length;
	}
	
	// Metoda zwracajaca true kiedy stos jest pusty
	void isEmpty() {
		if(fFree == 0) {
			System.out.println("Stos jest pusty");
		} else 
			System.out.println("Na stosie znajduj¹ sie elementy");
	}
	
	//Metoda zwracajaca obecn¹ wysokoœæ stosu
	int getSize() {
		return fFree;
	}
	
	// Metoda dodajaca elementy na stos
	void Push(double E) throws ArrayIndexOutOfBoundsException {
		
		if (fFree < tab.length) {
			tab[fFree] = E;
			fFree++;
		} else {
			throw new ArrayIndexOutOfBoundsException(
					"Przepe³nienie stosu!");
		}
	}
		
	// Metoda zdejmuj¹ca elementy ze stosu
	double Pop() throws IndexOutOfBoundsException {
		if(fFree <= 0) {
			throw new IndexOutOfBoundsException(
					"Stos jest pusty");
		} 
		double temp = tab[fFree - 1];
		System.out.println("Usuniêto ze stosu: " + tab[fFree-1] + " z pozycji " + fFree + ".");
		fFree--;
		return temp;
		}
	
	//Metoda wyœwietlajaca zawartpoœæ stosu
	void display() throws IndexOutOfBoundsException {
		if (fFree == 0) {
			throw new IndexOutOfBoundsException(
					"Stos jest pusty");
		}
		int temp = fFree - 1;
		do {
			System.out.println(tab[temp]);
			temp--;
		} while (temp > -1);
	}
	
	

	//Metoda czyszcz¹ca stos 
	void clear() {
		for( int i = 0; i < fFree; i++) {
			tab[i] = 0.0;
		}
		fFree = 0;
		System.out.println("Wartoœci na stosie zosta³y usuniête.");
	}

	
}
