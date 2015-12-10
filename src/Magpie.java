// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

import java.util.*;

public class Magpie {
	public static void main(String[] args) {
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}

class MagpieLab12a {
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("parent") >= 0
				|| statement.indexOf("family") >= 0) {

			// ArrayList of random responses in family
			ArrayList<String> responses = new ArrayList<String>();
			responses.add("Tell me more about your family.");
			responses.add("Who's the oldest person in your family?");
			responses.add("What's your mom's name?");
			responses.add("I wish I had a family:(");
			responses.add("Are you the youngest in your family?");
			responses.add("What's your dad's name?");
			responses.add("Do you have any siblings?");
			responses.add("What did you ask your parents for Christmas?");
			responses.add("What are the names of your family members that live with you?");
			responses.add("When were they born?");
			int whichResponse = (int) (Math.random() * responses.size()); // Random response

			// Switch Case Response for Random responses of family
			switch (whichResponse) {
			case 0:
				response = responses.get(0);
				break;
			case 1:
				response = responses.get(1);
				break;
			case 2:
				response = responses.get(2);
				break;
			case 3:
				response = responses.get(3);
				break;
			case 4:
				response = responses.get(4);
				break;
			case 5:
				response = responses.get(5);
				break;
			case 6:
				response = responses.get(6);
				break;
			case 7:
				response = responses.get(7);
				break;
			case 8:
				response = responses.get(8);
				break;
			case 9:
				response = responses.get(9);
				break;

			}

		} else {
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse() {

		// Static array of 10 Random responses
		String[] responses = new String[10];
		responses[0] = ("Interesting, tell me more.");
		responses[1] = ("Hmmmm.");
		responses[2] = ("Do you really think so?");
		responses[3] = ("You are really smart!");
		responses[4] = ("I can't tell where you're going with this.");
		responses[5] = ("I really don't want to hear that");
		responses[6] = ("I can tell you're lying");
		responses[7] = ("Where did you learn that?");
		responses[8] = ("That's Amazing!!!");
		responses[9] = ("No way!");

		int whichResponse = (int) (Math.random() * responses.length);// Random response
		String response = "";

		//Switch Case response for random responses
		switch (whichResponse) {
		case 0:
			response = responses[0];
			break;
		case 1:
			response = responses[1];
			break;
		case 2:
			response = responses[2];
			break;
		case 3:
			response = responses[3];
			break;
		case 4:
			response = responses[4];
			break;
		case 5:
			response = responses[5];
			break;
		case 6:
			response = responses[6];
			break;
		case 7:
			response = responses[7];
			break;
		case 8:
			response = responses[8];
			break;
		case 9:
			response = responses[9];
			break;
		}

		return response;
	}
}
