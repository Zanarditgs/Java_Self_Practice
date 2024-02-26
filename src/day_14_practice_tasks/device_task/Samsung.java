package day_14_practice_tasks.device_task;

public final class Samsung extends Phone implements AndroidApps{
    public Samsung( String model, String color, String size, double price) {
        super("Samsung", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}