package Files;

public class Result {

    public static void main(String[] args) {
        GeneralFiles[] generalArray = new GeneralFiles[4];
        generalArray[0] = new DocumentsFiles("j110-lab2-hiers.docx", 23221, "docx", 2);
        generalArray[1] = new PictureFiles("spb-map.png         ", 1703527, "image", 1024, 3072);
        generalArray[2] = new MultimediaFiles("06-PrettyGirl.mp3   ", 7893454, "audio", "Eric Clapton, Pretty Girl", 0,05,28);
        generalArray[3] = new VideoFiles("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985",01,48,8, 640, 352);
        System.out.println("File name           " + " |" + "Size   " + " |" + "Details" + " |");
        System.out.println("________________________________________");
        GeneralFiles.printAll(generalArray);

        VideoFiles[] videoFiles = new VideoFiles[2];
        videoFiles[0] = new VideoFiles("AnimalPlanet.avi    ", 253768637, "video", "Elephants", 2,15,30, 1920, 1080);
        videoFiles[1] = new VideoFiles("MonsterTrucks.avi   ", 753768637, "video", "Trucks Flight", 1,23,48, 1920, 1080);
        VideoFiles.printAll(videoFiles);
        }
    }
