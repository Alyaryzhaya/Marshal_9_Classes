public class Computer {

    // параметры компьютера. Но пока нет ни одного экземпляра этого класса. Создаем их в Start

   private int memory;
   private int cpu; // мощность процессора
   private String name;


   // КОНСТРУКТОР КЛАССА (базовый метод при создании нового экземпляра класса)

    Computer(){} // пустой (дефолтный) конструктор

//    Computer(int defMemory, int defCPU, String defName ){
//    memory = defMemory;
//    cpu = defCPU;
//    name = defName;

    Computer(int memory, int cpu, String name ){
    this.memory = memory;
    this.cpu = cpu;
    this.name = name;
    }


    //  метод
    void getCPU() {
    System.out.println(cpu); // метод универсален для всех экземпляров
    }

    void getMemory() {
        System.out.println(memory); // метод универсален для всех экземпляров
    }

    void setMemory(int m) {
       memory = m;


    }

}


