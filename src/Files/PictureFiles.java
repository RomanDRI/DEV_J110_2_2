package Files;

public class PictureFiles extends GeneralFiles {
    private String filesPicturesSize;

    FilesSizeType filesSizeType = new FilesSizeType();

    public PictureFiles(String filesName, int fileByteSize, String filesFormat, int width, int height) {
        super(filesName, fileByteSize, filesFormat);
        filesSizeType = new FilesSizeType(width, height);
        this.filesPicturesSize = filesSizeType.toStringSize();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", " + filesSizeType.toStringSize();
    }
}
