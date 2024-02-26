package day_14_practice_tasks.device_task;

public final class Google extends Phone implements AndroidApps{

    public Google( String model, String color, String size, double price) {
        super("Google", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }

}