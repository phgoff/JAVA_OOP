import java.io.*;
import java.util.*;
public class DiceMain {

	public static void main(String[] args){
		Dice d1 = new Dice();
		System.out.println(d1);
		d1.roll();
		System.out.println(d1);

		Dicebox box = new Dicebox();
		box.add(d1);
		box.add(new Dice());
		box.add(new Dice());
		System.out.println("ddd" + d1);
		System.out.println("Before shaking: total = " + box.getTotal());
		box.shake();
		System.out.println("After shaking: total = " + box.getTotal());

		box.printDices();
}
}