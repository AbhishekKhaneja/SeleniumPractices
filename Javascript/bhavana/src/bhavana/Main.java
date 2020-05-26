package bhavana;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.netbeans.jemmy.*;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JDialogOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JLabelOperator;
import org.netbeans.jemmy.operators.JMenuBarOperator;
import org.netbeans.jemmy.operators.JMenuOperator;
public class Main {
	
//	public void clickContinue() {
//		 JDialogOperator jdo = new JDialogOperator("About Swing!"); 
//		 JButtonOperator jbo = new JButtonOperator(jdo, "OK"); 
//		 jbo.push(); 
//		}


		 public static void main(String[] args)  {
			 
			 Abc x = new Abc();
			 x.king();
			 
			 hindu J = new hindu();
			 J.king();
			 J.kings();
			 
			 Abc C = new hindu();
			 C.king();
			 
			 hindu H = (hindu) new Abc();
			 
			 
			 
		     
		   
		}
	}
