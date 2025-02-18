/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MINEDUCYT
 */
public class LIST {
    public static void main(String[] args) {
		
		List<Integer> miNumero;
		miNumero=new ArrayList<>();
		
		miNumero.add(1);
		miNumero.add(3);
		miNumero.add(5);
		
        Integer remove;
        remove = miNumero.remove(1);
                
		System.out.print(miNumero.get(1));
	}

    
}
