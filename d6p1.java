interface InterfaceA {
void methodA1();
void methodA2();
}
interface InterfaceB {
void methodB1();
void methodB2();
}
interface InterfaceC {
void methodC1();
void methodC2();
}
// New interface inheriting from the three above and adding one method
interface InterfaceD extends InterfaceA, InterfaceB, InterfaceC {
void methodD();
}
// Concrete base class
class BaseClass {
void baseMethod() {
System.out.println("Method in BaseClass");
}
}
// Class implementing InterfaceD and extending BaseClass
class MyClass extends BaseClass implements InterfaceD {
// Implementing InterfaceA methods
public void methodA1() { System.out.println("methodA1"); }
public void methodA2() { System.out.println("methodA2"); }
// Implementing InterfaceB methods
public void methodB1() { System.out.println("methodB1"); }
public void methodB2() { System.out.println("methodB2"); }
// Implementing InterfaceC methods
public void methodC1() { System.out.println("methodC1"); }
public void methodC2() { System.out.println("methodC2"); }
// Implementing InterfaceD method
public void methodD() { System.out.println("methodD"); }
}
// Main class with methods accepting different interfaces
public class d6p1 {
static void useInterfaceA(InterfaceA a) {
a.methodA1();
a.methodA2();
}
static void useInterfaceB(InterfaceB b) {
b.methodB1();
b.methodB2();
}
static void useInterfaceC(InterfaceC c) {
c.methodC1();
c.methodC2();
}
static void useInterfaceD(InterfaceD d) {
d.methodA1();
d.methodB1();
d.methodC1();
d.methodD();
}
public static void main(String[] args) {
MyClass obj = new MyClass();
// Passing object to all interface methods
System.out.println("--- Using InterfaceA ---");
useInterfaceA(obj);
System.out.println("--- Using InterfaceB ---");
useInterfaceB(obj);
System.out.println("--- Using InterfaceC ---");
useInterfaceC(obj);
System.out.println("--- Using InterfaceD ---");
useInterfaceD(obj);
// Using method from BaseClass
System.out.println("--- Using BaseClass method ---");
obj.baseMethod();
}
}