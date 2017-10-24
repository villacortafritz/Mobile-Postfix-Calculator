package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	
	Formula f = new Formula();
	
	public class DisplayA implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"A");
		}
	}
	public class DisplayD implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"D");
		}
	}
	public class DisplayB implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"B");
		}
	}
	public class DisplayC implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"C");
		}
	}
	public class DisplayE implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"E");
		}
	}
	public class DisplayF implements OnClickListener{
		public void onClick(View v){
			btnAdd.setEnabled(false);
			btnSubtract.setEnabled(false);
			btnMultiply.setEnabled(false);
			btnDivide.setEnabled(false);
			btnMplus.setEnabled(false);
			btnEquals.setEnabled(false);
			if(txtScreen.getText().toString().trim().equals("0")){
				txtScreen.setText("");
			}
			txtScreen.setText(txtScreen.getText()+"F");
		}
	}
	public class DisplayOne implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"1");
		}
	}
	public class DisplayTwo implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"2");
		}
	}
	public class DisplayThree implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"3");
		}
	}
	public class DisplayFour implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"4");
		}
	}
	public class DisplayFive implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"5");
		}
	}
	public class DisplaySix implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"6");
		}
	}
	public class DisplaySeven implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"7");
		}
	}
	public class DisplayEight implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"8");
		}
	}
	public class DisplayNine implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"9");
		}
	}
	public class DisplayZero implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+"0");
		}
	}
	public class Clear implements OnClickListener{
		public void onClick(View v){
			txtScreen.setText("0");
			btnAdd.setEnabled(true);
			btnSubtract.setEnabled(true);
			btnMultiply.setEnabled(true);
			btnDivide.setEnabled(true);
			btnMplus.setEnabled(true);
			btnEquals.setEnabled(true);
		}
	}
	
	public class Add implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			double a =Double.parseDouble(txtScreen.getText().toString());
			if(f.getNum1() == 0){
				f.setNum1(a);
				f.setOperation('+');
				txtScreen.setText("0");
			}
			else if(f.getNum1() != 0){
				f.setNum2(a);
				f.setNum1(f.add());
				txtScreen.setText(Double.toString(f.getNum1()));
				flag=true;
			}
		}
	}
	public class Subtract implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			double a =Double.parseDouble(txtScreen.getText().toString());
			if(f.getNum1() == 0){
				f.setNum1(a);
				f.setOperation('-');
				txtScreen.setText("0");
			}
			else if(f.getNum1() != 0){
				f.setNum2(a);
				f.setNum1(f.subtract());
				txtScreen.setText(Double.toString(f.getNum1()));
				flag=true;
			}
		}
	}
	public class Multiply implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			double a =Double.parseDouble(txtScreen.getText().toString());
			if(f.getNum1() == 0){
				f.setNum1(a);
				f.setOperation('*');
				txtScreen.setText("0");
			}
			else if(f.getNum1() != 0){
				f.setNum2(a);
				f.setNum1(f.multiply());
				txtScreen.setText(Double.toString(f.getNum1()));
				flag=true;
			}
		}
	}
	public class Divide implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			double a =Double.parseDouble(txtScreen.getText().toString());
			if(f.getNum1() == 0){
				f.setNum1(a);
				f.setOperation('/');
				txtScreen.setText("0");
			}
			else if(f.getNum1() != 0){
				f.setNum2(a);
				f.setNum1(f.divide());
				txtScreen.setText(Double.toString(f.getNum1()));
				flag=true;
			}
		}
	}
	public class Calculate implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			double a = Double.parseDouble(txtScreen.getText().toString().trim());
			char op = f.getOperation();
			switch(op){
				case '+':
					f.setNum2(a);
					f.setNum1(f.add());
					break;
				case '-':
					f.setNum2(a);
					f.setNum1(f.subtract());
					break;
				case '*':
					f.setNum2(a);
					f.setNum1(f.multiply());
					break;
				case '/':
					f.setNum2(a);
					f.setNum1(f.divide());
					break;					
			}
			txtScreen.setText(Double.toString(f.getNum1()));
			f.setNum1(0);
			f.setNum2(0);
			flag=true;
			btnA.setEnabled(true);
			btnB.setEnabled(true);
			btnC.setEnabled(true);
			btnD.setEnabled(true);
			btnE.setEnabled(true);
			btnF.setEnabled(true);
		}
	}
	public class Backspace implements OnClickListener{
		public void onClick(View v){
			String a = txtScreen.getText().toString();
			String b;
			int length = a.length();
			if(!(length==1)){
				b = txtScreen.getText().toString().substring(0,length-1);
				txtScreen.setText(b);
				if(!(b.contains("A")||b.contains("B")||b.contains("C")||b.contains("D")||b.contains("E")||b.contains("F"))){
					btnAdd.setEnabled(true);
					btnSubtract.setEnabled(true);
					btnMultiply.setEnabled(true);
					btnDivide.setEnabled(true);
					btnMplus.setEnabled(true);
					btnEquals.setEnabled(true);
				}
			}
			
			else{
				txtScreen.setText("0");
				btnSubtract.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMplus.setEnabled(true);
				btnEquals.setEnabled(true);
			}
		}
	}
	public class Memory implements OnClickListener{
		public void onClick(View v){
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			if(store==0){
				store = Double.parseDouble(txtScreen.getText().toString());
				txtScreen.setText("0");
			}
			else if (store!=0){
				txtScreen.setText(Double.toString(store));
				store = 0;
			}
			btnA.setEnabled(true);
			btnB.setEnabled(true);
			btnC.setEnabled(true);
			btnD.setEnabled(true);
			btnE.setEnabled(true);
			btnF.setEnabled(true);
		}
	}
	public class ConvertHex implements OnClickListener{
		public void onClick(View v){
			int a = Integer.parseInt(txtScreen.getText().toString());
			if(state!=0){
				String b = Integer.toString(a);
				if(state==2){
					a = f.BackBin(b);
					state=0;
				}
				else if(state==1){
					a = f.BackHex(b);
					state=0;
				}
				else if(state==3){
					a = f.BackOct(b);
					state=0;
				}
			}
			txtScreen.setText((f.Hex(a)));
			state = 1;
		}
	}
	public class ConvertBin implements OnClickListener{
		public void onClick(View v){
			int a = Integer.parseInt(txtScreen.getText().toString());
			if(state!=0){
				String b = Integer.toString(a);
				if(state==2){
					a = f.BackBin(b);
					state=0;
				}
				else if(state==1){
					a = f.BackHex(b);
					state=0;
				}
				else if(state==3){
					a = f.BackOct(b);
					state=0;
				}
			}
			txtScreen.setText(f.Bin(a));
			state=2;
		}
	}
	public class ConvertOct implements OnClickListener{
		public void onClick(View v){
			int a = Integer.parseInt(txtScreen.getText().toString());
			if(state!=0){
				String b = Integer.toString(a);
				if(state==2){
					a = f.BackBin(b);
					state=0;
				}
				else if(state==1){
					a = f.BackHex(b);
					state=0;
				}
				else if(state==3){
					a = f.BackOct(b);
					state=0;
				}
			}
			txtScreen.setText(f.Oct(a));
			state = 3;
		}
	}
	public class ConvertDec implements OnClickListener{
		public void onClick(View v){
			String a = txtScreen.getText().toString();
			switch(state){
				case 1:
					txtScreen.setText(Integer.toString(f.BackHex(a)));
					state =0;
					break;
				case 2:
					txtScreen.setText(Integer.toString(f.BackBin(a)));
					state =0;
					break;
				case 3:
					txtScreen.setText(Integer.toString(f.BackOct(a)));
					state =0;
					break;
			}
		}
	}
	public class DisplayPeriod implements OnClickListener{
		public void onClick(View v){
			if(txtScreen.getText().toString().trim().equals("0") || flag){
				txtScreen.setText("");
				flag=false;
			}
			txtScreen.setText(txtScreen.getText()+".");
		}
	}
	
	private Button btnHex, btnBin, btnOct, btnDec, btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear, btnDelete, btnMplus, btnEquals, btnA, btnB, btnC, btnD, btnE, btnF, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDot;
    private EditText txtScreen;
    private boolean flag = false;
    private double store=0;
    private int state = 0;
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txtScreen = (EditText)findViewById(R.id.txtScreen);
        btnHex = (Button)findViewById(R.id.btnHex);
        btnBin = (Button)findViewById(R.id.btnBin);
        btnDec = (Button)findViewById(R.id.btnDec);
        btnOct = (Button)findViewById(R.id.btnOct);
        btnAdd = (Button)findViewById(R.id.btnPlus);
        btnSubtract = (Button)findViewById(R.id.btnMinus);
        btnMultiply = (Button)findViewById(R.id.btnTimes);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnMplus = (Button)findViewById(R.id.btnMplus);
        btnDelete = (Button)findViewById(R.id.btnArrow);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnOne = (Button)findViewById(R.id.btn1);
        btnTwo = (Button)findViewById(R.id.btn2);
        btnThree = (Button)findViewById(R.id.btn3);
        btnFour = (Button)findViewById(R.id.btn4);
        btnFive = (Button)findViewById(R.id.btn5);
        btnSix = (Button)findViewById(R.id.btn6);
        btnSeven = (Button)findViewById(R.id.btn7);
        btnEight = (Button)findViewById(R.id.btn8);
        btnNine = (Button)findViewById(R.id.btn9);
        btnZero= (Button)findViewById(R.id.btn0);
        btnDot = (Button)findViewById(R.id.btnPeriod);
        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);
        btnC = (Button)findViewById(R.id.btnC);
        btnD = (Button)findViewById(R.id.btnD);
        btnE = (Button)findViewById(R.id.btnE);
        btnF = (Button)findViewById(R.id.btnF);
        
        //set functions
        btnA.setOnClickListener(new DisplayA());
        btnB.setOnClickListener(new DisplayB());
        btnC.setOnClickListener(new DisplayC());
        btnD.setOnClickListener(new DisplayD());
        btnE.setOnClickListener(new DisplayE());
        btnF.setOnClickListener(new DisplayF());
        btnOne.setOnClickListener(new DisplayOne());
        btnTwo.setOnClickListener(new DisplayTwo());
        btnThree.setOnClickListener(new DisplayThree());
        btnFour.setOnClickListener(new DisplayFour());
        btnFive.setOnClickListener(new DisplayFive());
        btnSix.setOnClickListener(new DisplaySix());
        btnSeven.setOnClickListener(new DisplaySeven());
        btnEight.setOnClickListener(new DisplayEight());
        btnNine.setOnClickListener(new DisplayNine());
        btnZero.setOnClickListener(new DisplayZero());
        btnClear.setOnClickListener(new Clear());
        btnAdd.setOnClickListener(new Add());
        btnEquals.setOnClickListener(new Calculate());
        btnDelete.setOnClickListener(new Backspace());
        btnMplus.setOnClickListener(new Memory());
        btnHex.setOnClickListener(new ConvertHex());
        btnBin.setOnClickListener(new ConvertBin());
        btnDec.setOnClickListener(new ConvertDec());
        btnOct.setOnClickListener(new ConvertOct());
        btnSubtract.setOnClickListener(new Subtract());
        btnMultiply.setOnClickListener(new Multiply());
        btnDivide.setOnClickListener(new Divide());
        btnDot.setOnClickListener(new DisplayPeriod());
     
    }
}