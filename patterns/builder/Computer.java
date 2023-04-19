package patterns.builder;

public class Computer {
    private int RAM;
    private String CPU;
    private int storage;
    private String MB;
    private int battery;
    private String color;
    private String Video;

    private Computer(Builder builder);
    this.RAM = builder.RAM;
    this.CPU = builder.CPU;
    this.storage = builder.storage;
    this.MB = builder.MB;
    this.battery = builder.battery;
    this.color = builder.color;
    this.Video = builder.Video;

    public static class Builder {
        private int RAM;
        private String CPU;
        private int storage;
        private String MB;
        private int battery;
        private String color;
        private String Video;
    }

    public static class Builder {
        private int RAM;
        private String CPU;
        private int storage;
        private String MB;
        private int battery;
        private String color;
        private String Video;

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }

        public void setMB(String MB) {
            this.MB = MB;
        }

        public void setBattery(int battery) {
            this.battery = battery;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setVideo(String video) {
            Video = video;
        }
    }

    }
    public Builder(String MB, String CPU){
        this.MB = MB;
        this.CPU = CPU;

}
