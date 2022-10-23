public class Start {
    public static void main(String[] args) {

     //  КОМП 1
        Computer apple = new Computer(50, 80,"sert"); // Computer -  тип данных для экземпляров компьютера
//        apple.cpu = 2500;
//        apple.memory = 1000;
//        apple.name = "mcbook";

       // System.out.println(apple.cpu);
        apple.getMemory();
        apple.getCPU();

        // НОВАЯ ПЕРЕМЕННАЯ
        Computer lenovo = apple; // присваиваем ей знаение эпл. теперь в эпл и леново лежит одна и та же ссылка на один и тот же комп
        lenovo.getMemory();

//        apple.memory = 5000;

        apple.setMemory(114); //устанавливает знаение вместо переменной (которая privte)
        apple.getMemory();
        lenovo.getMemory();



        // КОМП 2
      Computer deel = new Computer();
//        deel.cpu = 4300;
       // deel.isCPU();



        }

    }

