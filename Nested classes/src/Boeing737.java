public class Boeing737 {
    private int manufactureYear;
    private static int maxPassengersCount=300;

    public Boeing737(int manufactureYear){
        this.manufactureYear=manufactureYear;
    }

    public int getManufactureYear(){
        return manufactureYear;
    }

    public static class Drawing{
        public static int getMaxPassengersCount(){
            return maxPassengersCount;
        }
        public int getManufactureYear(){
            Boeing737 boeing737=new Boeing737(2000);
           System.out.println(boeing737.manufactureYear);
           return boeing737.manufactureYear;
        }
    }
    public class ExtendDrawing extends Drawing{
        public  int number_of_submodels;
        public  int getNumberOfSubmodels(){
            return number_of_submodels;
        }
        class InnerExtendDrawing{
            int number;
            InnerExtendDrawing(int number){
                this.number=number;
            }
            void getNumber(){
                System.out.println(number);
            }
        }
    }
}
