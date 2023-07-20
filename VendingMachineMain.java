public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(3);
        System.out.println(product);

        VendingMachine.printVersion();
    }
}
