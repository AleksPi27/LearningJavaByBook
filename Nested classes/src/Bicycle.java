public class Bicycle {
    private String model;
    private int mawWeight;

    public Bicycle(String model, int mawWeight){
        this.model=model;
        this.mawWeight=mawWeight;
    }
    public void start(){
        System.out.println("Поехали!");
    }

    public class SteeringWheel{

        public void right(){
            System.out.println("Руль вправо!");
        }

        public void left(){
            System.out.println("Руль влево!");
        }
    }
}
