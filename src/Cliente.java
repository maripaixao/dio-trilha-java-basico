public class Cliente {
    private String name, agency;
    private int accountNumber;
    private double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void accountCreated(String name, String agency, int accountNumber, double value){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência: " + agency);
        System.out.println("Sua conta: " + accountNumber);
        System.out.println("Seu saldo R$ " + value + " já está disponível para saque.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
