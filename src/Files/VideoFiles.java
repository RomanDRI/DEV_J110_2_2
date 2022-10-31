package Files;

public class VideoFiles extends MultimediaFiles {
    private String fileVideoPictureSize;

    FilesSizeType filesSizeType = new FilesSizeType();


    public VideoFiles(String filesName, int fileByteSize, String filesFormat, String filesMultimediaDescription, int hours, int minutes, int seconds, int width, int height) {
        super(filesName, fileByteSize, filesFormat, filesMultimediaDescription, hours, minutes, seconds);
        filesSizeType = new FilesSizeType(width, height);
        this.fileVideoPictureSize = filesSizeType.toStringSize();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", " + filesSizeType.toStringSize();
    }
}
