
class Calculator{

    int n1,n2;
    Calculator(int a, int b){
    n1 = a;
    n2 = b;
}


void add()
{
    System.out.println(n1 + n2);
}

void sub()
{
    System.out.println(n1 - n2);
}

void multiple()
{
    System.out.println(n1 * n2);
}

void Divise()
{
    if(n1 != 0)
    {
        System.out.println(n1/n2);
    }
    else{
        System.out.println("cannot be divise the number");
    }
}
}
public class Main
{
	public static void main(String[] args) {
		Calculator Calc = new Calculator(10,5);
		Calc.add();
		Calc.sub();
		Calc.multiple();
		Calc.Divise();
	}
}
