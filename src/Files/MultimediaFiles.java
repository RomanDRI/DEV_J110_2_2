package Files;

public class MultimediaFiles extends GeneralFiles {
    private String filesMultimediaDescription;
    private String filesMultimediaLength;

    FilesLengthType filesLengthType = new FilesLengthType();



    public MultimediaFiles(String filesName, int fileByteSize, String filesFormat, String filesMultimediaDescription, int hours, int minutes, int seconds) {
        super(filesName, fileByteSize, filesFormat);
        setFilesMultimediaDescription(filesMultimediaDescription);
        filesLengthType = new FilesLengthType(hours, minutes, seconds);
        this.filesMultimediaLength = filesLengthType.toStringLength();
    }


    public String getFilesMultimediaDescription() {
        return filesMultimediaDescription;
    }

    public void setFilesMultimediaDescription(String filesMultimediaDescription) {
        if (filesMultimediaDescription != null & filesMultimediaDescription != "")
            this.filesMultimediaDescription = filesMultimediaDescription;
        else throw new IllegalArgumentException("Введите описание файла");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", " + filesMultimediaDescription
                + ", " + filesLengthType.toStringLength();
    }
}
