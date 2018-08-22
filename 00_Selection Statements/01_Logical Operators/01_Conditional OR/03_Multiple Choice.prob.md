>>Consider the following code segment:

```
public static void exampleMethod(int paramOne, int paramTwo)
{
  if ((paramOne > 0) && (paramTwo > 0)) {
    if (paramOne > paramTwo){
      System.out.println("A");
    }
    else{
      System.out.println("B");
    }
  }
  else if ((paramTwo < 0) || (paramOne < 0)) {
    System.out.println("C");
  }
  else if (paramTwo < 0) {
    System.out.println("D");
  }
  else { 
    System.out.println("E");
  }
}
```

What is printed as a result of executing <code>exampleMethod(3,-2)</code>?<<

( ) A {{Incorrect because <code>paramTwo</code> is less than zero, causing the whole boolean expression in the <code>if</code> statement to be false.}}
( ) B {{Incorrect because <code>paramTwo</code> is less than zero, causing the whole boolean expression in the <code>if</code> statement to be false.}}
(x) C {{Correct because the boolean expression in the first <code>if</code> statement will lead to false, causing the first <code>else if</code> statement to execute and print C. <code>(paramOne &#62; 0) &#38;&#38; (paramTwo &#62; 0)</code> is false while <code>(paramOne &#62; 0) || (paramTwo &#62; 0)</code> is true because one of the parameters is bigger than zero.}}
( ) D {{Incorrect because the boolean expression in the first <code>else if </code> statement is true, meaning that the rest of the <code>else if </code> and <code>else</code> statements after it will not be executed.}}
( ) E {{Incorrect because the boolean expression in the first <code>else if </code> statement is true, meaning that the rest of the <code>else if </code> and <code>else</code> statements after it will not be executed.}}

||Consider the nested <code>if</code> statement located towards the start of the method when solving the question.||
