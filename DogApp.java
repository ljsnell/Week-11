import java.util.Scanner;

class DogApp {
	 static String status1(String [] info) 
	 {
		String message = "Hi. My name is "+ info[0] +".";
		message += "\nI am a " + info[1] + " with " + info[2] +" fur.";
		message += "\nI have " + info[3] + " toy.";
		return message;
	 }
	 
	 static String status2(Double age, Double weight)
	 {
		 String message = "I am " + age + " years old, and I weigh " + weight + " pounds.";
		 return message;
	 }
	 
	 static String setmood (String food)
	 {
		String mood ="";
		if (food.equals("bone")) {mood = "happy";}
		if (food.equals("chicken")) {mood = "alert";}
		if (food.equals("fruit")) {mood = "angry";}
		return mood;
	 }
	 
	 static String speak(String mood){
		String say = "";
		if (mood.equals("happy")==true) {say = "Roof.";}
		if (mood.equals ("alert") == true) {say =  "Uh.";}
		if (mood.equals ("angry") == true) {say = "Whine.";}
		return say;
	}
	
	static String playoutside (String weather){
		String result;
		if (weather.equals("rainy")) {result = "The dog is soaked.";}
		else if (weather.equals("hot"))  {result = "The dog is getting heat stroke.";}
		else if (weather.equals("cold"))  {result = "The dog is too cold.";}
		else {result = "Good choice.";}
		return result;
	}
   
    public static void main (String[] args) {
    	Scanner userinput = new Scanner(System.in);	 
    	System.out.println ("Getting Info about Your Dog ...");
    	// myInfo stores name, breed, fur color, and toy
    	String[] myInfo = {"Max", "toy poodle", "red", "ring"};
      	Double myWeight = 6.9;
      	Double myAge = 0.8;	
    	String myFood = "chicken";
		System.out.print("What is the weather outside?");
		String myWeather = userinput.nextLine();
		String myMood = setmood(myFood);
		
		System.out.println(status1(myInfo));
		System.out.println(status2(myAge, myWeight));
		System.out.println(speak(myMood));
		System.out.println(playoutside(myWeather));
		System.out.println("Thanks for taking care of your dog.");
		userinput.close();
    }
}
