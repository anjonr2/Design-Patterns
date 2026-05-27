package structural.ProxyDesignPattern.Example1.withoutProxy;

/*
 In our example we tried to load a 5 MB image from disk for each image in the gallery.
 This is an expensive operation and can lead to performance issues,
 especially if there are many images or if the images are large.
 The user has to wait for each image to load before it can be displayed,
 which can result in a poor user experience.
* */
public class ImageGalleryAppV1 {
    public static void main(String [] args){
        System.out.println("Application started. Initializing images for gallery...");

        Image image1 = new HighResolutionImage("photo1.jpg");
        Image image2 = new HighResolutionImage("photo2.jpg");
        Image image3 = new HighResolutionImage("photo3.jpg");

        System.out.println("All images initialized. Displaying gallery...");

        System.out.println("user requests to display "+image1.getFileName());
        image1.display();

        System.out.println("user requests to display "+image2.getFileName());
        image2.display();

        System.out.println("user requests to display "+image3.getFileName());
        image3.display();

    }
}
