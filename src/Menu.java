public enum Menu {
    PRIV("Konto prywatne", 1),
    COMPANY("Konto firmowe", 2),
    SUPPORT("Konsultant", 3),
    END("Koniec", 4);
    public final int chooseNumber;
    public final String name;

    Menu(String name, int chooseNumber){
        this.name = name;
        this.chooseNumber = chooseNumber;
    }
    void printChooseNumber(){
        System.out.println(this.chooseNumber);
    }
}
