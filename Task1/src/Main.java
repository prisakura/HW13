import Computer.Computer;
import Computer.KeyboardEnums.Keyboard;
import Computer.KeyboardEnums.KeyboardType;
import Computer.KeyboardEnums.Lighting;
import Computer.MemoryEnums.MemType;
import Computer.MemoryEnums.Memory;
import Computer.OpMemoryEnums.OpMemType;
import Computer.OpMemoryEnums.OpMemory;
import Computer.ProcessorEnums.Cores;
import Computer.ProcessorEnums.Frequency;
import Computer.ProcessorEnums.Processor;
import Computer.ProcessorEnums.Producer;
import Computer.ScreenEnums.Screen;
import Computer.ScreenEnums.ScreenType;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10,5);
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        Processor processor = new Processor(Frequency.f2500MHZ,Cores.c6, Producer.AMD,120);
        OpMemory opMemory = new OpMemory(OpMemType.DDR4,8,200);
        Memory memory = new Memory(MemType.SSD,2000,500);
        Screen screen = new Screen(27, ScreenType.IPS,1.5);
        Keyboard keyboard = new Keyboard(KeyboardType.FULL, Lighting.DynRGB,600);
        Computer computer = new Computer(processor,opMemory,memory,screen,keyboard);
        System.out.println(computer.getFinalWeight());
        System.out.println(computer.toString());
    }
}