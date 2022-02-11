// public class Checkcode {
    
// }
class A
{
String s = "AAA";

void methodA()
{
System.out.println(s);
}

static class B
{
void methodB()
{
methodA();
}
}
}

//Answer: It'll show error like non-static methodA() cannot be referenced from a static context.