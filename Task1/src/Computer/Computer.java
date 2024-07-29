package Computer;

import Computer.KeyboardEnums.Keyboard;
import Computer.MemoryEnums.Memory;
import Computer.OpMemoryEnums.OpMemory;
import Computer.ProcessorEnums.Processor;
import Computer.ScreenEnums.Screen;

public class Computer {
    private Processor processor;
    private OpMemory opMemory;
    private Memory memory;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor = "ASUS";
    private final String name = "PC";

    public Computer() {
    }

    public Computer(Processor processor, OpMemory opMemory, Memory memory, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.opMemory = opMemory;
        this.memory = memory;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public OpMemory getOpMemory() {
        return opMemory;
    }

    public void setOpMemory(OpMemory opMemory) {
        this.opMemory = opMemory;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getFinalWeight(){
        return processor.getWeight()+opMemory.getWeight()+memory.getWeight()+ keyboard.getWeight()+screen.getWeight();
    }

//    public String toString(){
//        String s = "Vendor: "+this.getVendor()+"\n";
//        s += "Name: "+this.getName()+"\n";
//        s += "Processor: "+processor.getProducer()+" "+processor.getCores().getValue()+" cores "+ processor.getFrequency().getValue()+" MHz\n";
//        s += "OpMemory: "+opMemory.getVolume()+"GB "+opMemory.getOpMemType().getValue()+"\n";
//        s += "Memory: "+memory.getVolume()+"GB "+memory.getMemType().getValue()+"\n";
//        s += "Screen: "+screen.getSize()+" inch. "+screen.getScreenType().getValue()+"\n";
//        s += "Keyboard: "+keyboard.getKeyboardType().getValue()+" Lighting: "+keyboard.getLighting().getValue();
//        return s;
//    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", opMemory=" + opMemory +
                ", memory=" + memory +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
