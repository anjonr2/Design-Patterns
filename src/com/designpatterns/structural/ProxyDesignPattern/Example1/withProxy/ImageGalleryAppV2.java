package structural.ProxyDesignPattern.Example1.withProxy;

public class ImageGalleryAppV2 {
    public static void main(String[] args){
        System.out.println("Application Started. Initializing image proxies for gallery...");

        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");
        Image image3 = new ImageProxy("photo3.jpg");

        System.out.println("Gallery Initialized. No images actually loaded yet...");

        System.out.println("user requests to display "+image1.getFileName());
        image1.display();

        System.out.println("user requests to display "+image1.getFileName());
        image1.display();

        System.out.println("user requests to display "+image3.getFileName());
        image3.display();
    }
}

/*
Using proxy pattern what we achieved :
1. Lazy loading : Images are only loaded when the user is actually views them, cutting startup time from a few seconds to almost instant. Improving user experience
2. photo2 was never loaded because user never requested to display photo2 which has saved 5 mb of memory
3. Client code uses same Image interfaces throughout, unware of the proxy
4. No changes to the real object : HighResolutionImage was not modified at all
5.Cached access : The second display () call on photo1.jpg reuses the already loaded image with no delay
 */