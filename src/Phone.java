public class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String callerName) {
        System.out.print("Звонит: " + callerName);
    }
    public Phone(){
    }
    public Phone(String a){
        model="LG 521";
        number=8438129349L;
        receiveCall("Джони");
    }
    public long getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight(){
        return weight;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    void info(){
        System.out.printf("\nНомер телефона: %d\nМодель: %s\nВес(в граммах): %d\n", number, model, weight);
    }

}

