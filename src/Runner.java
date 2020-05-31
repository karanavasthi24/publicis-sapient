
import java.io.FileNotFoundException;

import org.json.simple.parser.ParseException;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {

		Questions questions = new Questions();
		while (questions.hasNextQues()) {
			System.out.println("Question:" + questions.nextQues());
			System.out.println("Options:" + questions.options());

			Timer input = new Timer();
			String str = "";
			try {
				str = input.getInput();
			} catch (Exception e) {
				System.out.println(e + "input error ");
			}
			if (str.equals("1")) {
				questions.incQuesCount();
				continue;
			} else if (str.equals("0")) {
				break;
			} else {
				if (questions.isCorrect(str.toUpperCase())) {

					if (!str.isEmpty() && questions.isCorrect(str.toUpperCase())) {
						System.out.println("corrrect");
					} else {
						System.out.println("incorrect");
					}
					questions.incQuesCount();
				} else {
					System.out.println("select valid option");
				}

			}

		}
		System.out.println("exit");

	}
}
