package test;

public class ColorApp {
	
	public static void main(String args[]){
		
		if(args.length != 3){
			System.out.println("Incorrect number of arguments");
			System.exit(1);
		}
		
		
		int red = Integer.parseInt(args[0]);
		int green = Integer.parseInt(args[1]);
		int blue = Integer.parseInt(args[2]);
		
		
		String hexStr = "#"+Integer.toHexString(red)+Integer.toHexString(green)+Integer.toHexString(blue);
		
		System.out.println(hexStr);

	}

}
