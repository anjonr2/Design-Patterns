package structural.ProxyDesignPattern.Example1.withoutProxy;

public class HighResolutionImage implements Image{
    private String fileName;
    private byte[] imageData;

    public HighResolutionImage(String fileName){
        this.fileName = fileName;
        loadImageDataFromDisk();
    }

    private void loadImageDataFromDisk(){
        System.out.println("Loading image: "+ fileName + " from disk (Expensive Opearation)..");
        try {
            Thread.sleep(200);
            this.imageData = new byte[1024 * 1024 * 5]; //Simulate loading a large image of 5 mb
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Image "+ fileName + "loaded successfully.");
    }

    @Override
    public void display() {
        System.out.println("Displaying image: "+fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
