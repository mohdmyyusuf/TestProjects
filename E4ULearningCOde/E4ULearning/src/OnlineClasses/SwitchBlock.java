package OnlineClasses;

public class SwitchBlock {
	
	public static void main(String[] args) {
		
		String month = "feb";
		String weather = "Summer";
		
		switch (weather) 
		{
			case "Winter":
				switch (month) 
				{
					case "Dec":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "Jan":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "feb":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "march":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					default:
						System.out.println("Pata ni");
					break;
				}
				System.out.println("Its peak of winter");
				break;
				
			case "Summer":
				switch (month) 
				{
					case "Dec":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "Jan":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "feb":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					case "march":
						System.out.println("Its chilling "+month+" of" +weather);
						break;
					default:
						System.out.println("Pata ni");
					break;
				}
				System.out.println("Its peak of Summer");
				break;
	
			default:
			break;
		}	
		
		
	}

}
