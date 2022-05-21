import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CoffeeMachineTest {
    @Test
    public void test1() {
        CoffeeMachine test1 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test1.HelloMachine());
    }
    @Test
    public void test2() {
        CoffeeMachine test2 = new CoffeeMachine();
        test2.isActive = true;
        assertEquals("Machine Already On", test2.HelloMachine());
    }
    @Test
    public void test3() {
        CoffeeMachine test3 = new CoffeeMachine();
        assertEquals("Please turn the machine first", test3.PutMoney(30));
    }
    @Test
    public void test4() {
        CoffeeMachine test4 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test4.HelloMachine());
        assertEquals("money received", test4.PutMoney(30));
    }
    @Test
    public void test5() {
        CoffeeMachine test5 = new CoffeeMachine();
        test5.HelloMachine();
        assertEquals("Machine Already On", test5.HelloMachine());
        assertEquals("Lights Off"+"Power Off" , test5.ByeMachine());
        assertEquals("Please turn the machine first", test5.PutMoney(30));
    }
    @Test
    public void test6() {
        CoffeeMachine test6 = new CoffeeMachine();
        assertEquals("4"+ " Cups Of coffee Made!", test6.OrderCoffee(4,20));
    }
    @Test
    public void test8() {
        CoffeeMachine test8 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test8.HelloMachine());
        assertEquals("money received", test8.PutMoney(40));
        assertEquals("8"+ " Cups Of coffee Made!", test8.OrderCoffee(10,40));
    }
    

}