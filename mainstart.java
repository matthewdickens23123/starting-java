public class mainstart {

    public static void main(String[] args) {

    }

}

// System.out.print will write on the same line, System.out.println will write something on a line and will place the next phrase under it. You need a semicolon for after a line, syntax has to be correct.

//Boolean have 2 states, true or false and they can be given a variable to be true or false, example would be 
//Boolean LightOn = false 
//And when put with a System.out.print(LightOn) and you will get false. To change LightOn’s value you can just do
//LightOn = True
//And that changes it value. You can make a Boolean’s sate unchangeable with the phrase final in front of it.

//Int or integers are whole numbers up to 32 bits. You’d give a variable a number as you would a Boolean. If you change the variables value, you can concatenation with +*variable*+ within the sentences. An example would be

//int apple = 32;

//System.out.printlny

// double is for decimals, it is necesarry for it. char is charatcer, or one letter or charcter, like just f. quotes are necessrry for char. string is an array of characters. ints, double, booleans, long and such are primitive types. an array uses brackets after naming it. you cant do math with strings or chars. int only does whole numbers, it wont round up or down, so it is prefered to use doubles. + is used to concatenation words in strings. you dont have do give a variables value on the same line, you can state it later. you can make a constant or final variable making it unchangable with final. you can increase a variables value using + as this, beans = beans+1, after declaring it of course. you can also do the variable with ++ after it. if you want to have decimals in an equation, make sure every variable is deteremined by decimal not int.mod gives you the remainder and only it. 21/4 would give you 1. there is a pemdas with no exponents, and it goes from left to right. double equal signs means a boolean. you can use +*variable* to show its value. integer has classes, max and min value, ehich gives you its highest value. if you add the the max it goes to negative 2 billion, and vice versa with negative. if you give tinteger too big a number it gives an error. max and min work iwith long and big. you can use a single = to assign different variables 1 value. x=y=z=24. you can do += -= and such to numeric values for variables and call them. % is the remainder number. if you want a decimal in a string you can write double in parenthesis like this ((double)x/y). it cna be rewitten in a different place to make knly one value a decimal.

// public class Test2{
//   public static void main(String[] args)
//   {
// 	    int x = 3;
// 	    int y = 2;
//     System.out.println(x);
// 	    System.out.println(y);
//     x = y;
// 	    System.out.println(x);
// 	    System.out.println(y);
// 	    y = 5;
// 	    System.out.println(x);
// 	    System.out.println(y);
// 	  }
// 	}
	
	// 1-4-3: What are the values of x, y, and z after the following code executes? You can step through this code by clicking on this Java visualizer link.
	//int x = 0;
	//int y = 1;
//int z = 2;
//x = y;
//y = y * 2;
///z = 3;
//A. x = 0, y = 1, z = 2
//bB. x = 1, y = 2, z = 3
//C. x = 2, y = 2, z = 3
//D. x = 0, y = 0, z = 3

//✔️ x changes to y's initial value, y's value is doubled, and z is set to 3. 

//Assignment statements initialize or change the value stored in a variable using the assignment operator =. An assignment statement always has a single variable on the left hand side. The value of the expression (which can contain math operators and other variables) on the right of the = sign is stored in the variable on the left. Instead of saying equals for the = in an assignment statement, say “gets” or “is assigned” to remember that the variable gets or is assigned the value on the right. In the figure above score is assigned the value of the expression 10 times points (which is another variable) plus 5.

//If you use a variable to keep score you would probably increment it (add one to the current value) whenever score should go up. You can do this by setting the variable to the current value of the variable plus one (score = score + 1) as shown below. The formula looks a little crazy in math class, but it makes sense in coding because the variable on the left is set to the value of the arithmetic expression on the right. So, the score variable is set to the previous value of score + 1.

//Java uses the standard mathematical operators for addition (+), subtraction (-), multiplication (*), and division (/). Arithmetic expressions can be of type int or double. An arithmetic operation that uses two int values will evaluate to an int value. An arithmetic operation that uses at least one double value will evaluate to a double value. (You may have noticed that + was also used to put text together in the input program above – more on this when we talk about strings.)

//Java uses the operator == to test if the value on the left is equal to the value on the right and != to test if two items are not equal. Don’t get one equal sign = confused with two equal signs ==. They mean different things in Java. One equal sign is used to assign a value to a variable. Two equal signs are used to test a variable to see if it is a certain value and that returns true or false as you’ll see below. Use == and != only with int values and not doubles because double values are an approximation and 3.3333 will not equal 3.3334 even though they are very close.

//The tool that we use to compile a Java source file into a Java class file is called a compiler. Most programmers use an Integrated Development Environment (IDE) that has the compiler built in and helps you write, compile, run, and debug programs.

//You can learn Java by just using the interactive coding panels called Active Code in this e-book. If you are logged in, the Active Code will remember your changes and even show you a history of your changes to the code if you click on Load History.

//However, it’s a good idea to also try a Java IDE to build code outside of this e-book, especially to try coding with user input which Active Code cannot do. There are many Java IDEs available. Here are some of most popular ones used by AP CS A teachers:
// public class Test2
// 2	{
// 3	  public static void main(String[] args)
// 4	  {
// 5	    int x = 3;
// 6	    int y = 2;
// 7	    System.out.println(x);
// 8	    System.out.println(y);
// 9	    x = y;
// 10	    System.out.println(x);
// 11	    System.out.println(y);
// 12	    y = 5;
// 13	    System.out.println(x);
// 14	    System.out.println(y);
// 15	  }
// 16	}

// If you use a variable to keep score you would probably increment it (add one to the current value) whenever score should go up. You can do this by setting the variable to the current value of the variable plus one (score = score + 1) as shown below. The formula looks a little crazy in math class, but it makes sense in coding because the variable on the left is set to the value of the arithmetic expression on the right. So, the score variable is set to the previous value of score + 1.

// public class Test1
// {
//    public static void main(String[] args)
//    {
//      int score = 0;
//      System.out.println(score);
//      score = score + 1;
//      System.out.println(score);
//    }
// }

// public class Test1
// {
//    public static void main(String[] args)
//    {
//      System.out.println(11 % 10);
//      System.out.println(3 % 4);
//      System.out.println(8 % 2);
//      System.out.println(9 % 2);
//    }
// }

// 1
// 3
// 0
// 1

// 3%4 is essentially 4/3

// public Unit2(String cn, int ca, double cd){

// order of operations is parenthesis, then mod, multiplication, and division, then addition and subtraction