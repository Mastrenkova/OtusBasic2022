import java.util.InputMismatchException;
import java.util.Scanner;

class Blok {
	static int correctCount = 0, wrongCount = 0;
	int number;
	String question;
	String answerArray1;
	String answerArray2;
	String answerArray3;
	int correctAnswer;

	public void print() {
		System.out.println(question);
		System.out.println(answerArray1);
		System.out.println(answerArray2);
		System.out.println(answerArray3);
	}

	public void test() {
		
		Scanner answer = new Scanner(System.in);
			while ((number = answer.nextInt()) > 3 || number < 1) {
			System.out.println("Некорректный ввод данных");
		}
		System.out.println("Ваш ответ: " + number);
		if (number != correctAnswer) {
			System.out.println("Ответ неверный");
			wrongCount++;
		} else {
			System.out.println("Правильно");
			correctCount++;
		}	
	}
	
	public void exceptions() {
		try {
			test();
		} catch (InputMismatchException ex) {
			System.out.println("Ответ должен содержать только цифровые значения");
			test();
		}	
	}
		
	public static int getCountWrong() {
		return wrongCount;
	}
	
	public static int getCountCorrecgt() {
		return correctCount;
	}
}

public class testClass {
	public static void main(String args[]) {
		
		Blok blok1 = new Blok();
		blok1.question = "1. Чем определяются свойства сварного соединения?";
		blok1.answerArray1 = "1) Свойствами металла шва, линии сплавления с основным металлом и зоны термического влияния;";
		blok1.answerArray2 = "2) Техническими характеристиками использованных электродов;";
		blok1.answerArray3 = "3) Свойствами металла линии сплавления и зоны термического влияния;";
		blok1.correctAnswer = 1;
		blok1.print();
		blok1.exceptions();

		Blok blok2 = new Blok();
		blok2.question = "2. С какой целью выполняют разделку кромок?";
		blok2.answerArray1 = "1) Для экономии металла;";
		blok2.answerArray2 = "2) Для более удобного проведения сварочных работ;";
		blok2.answerArray3 = "3) Для обеспечения провара на всю глубину;";
		blok2.correctAnswer = 3;
		blok2.print();
		blok2.exceptions();

		Blok blok3 = new Blok();
		blok3.question = "3. В каком порядке проводится аттестация сварщиков?";
		blok3.answerArray1 = "1) По решению аттестационной комиссии;";
		blok3.answerArray2 = "2) Сначала теоретическая часть экзамена, а затем практическая;";
		blok3.answerArray3 = "3) Сначала практическая часть экзамена, затем теоретическая;";
		blok3.correctAnswer = 3;
		blok3.print();
		blok3.exceptions();
		
		Blok blok4 = new Blok();
		blok4.question = "4. При выполнении ручной дуговой сварки непровары возникают из-за:";
		blok4.answerArray1 = "1) Высокой скорости выполнения работ, недостаточной силы сварочного тока;";
		blok4.answerArray2 = "2) Малой скорости выполнения работ, чрезмерно большой силы сварочного тока;";
		blok4.answerArray3 = "3) Неправильного подбора электродов, чрезмерно большой силы сварочного тока;";
		blok4.correctAnswer = 1;
		blok4.print();
		blok4.exceptions();
		
		System.out.println("Неправильных ответов: " + Blok.getCountWrong() + "Правильных ответов: " + Blok.getCountCorrecgt());

	}
}