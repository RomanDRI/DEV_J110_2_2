package Files;

public class GeneralFiles {
    private String filesName;
    private int fileByteSize;

    private String filesFormat;

    public GeneralFiles(String filesName, int fileByteSize, String filesFormat) {
        setFilesName(filesName);
        setFileByteSize(fileByteSize);
        setFilesFormat(filesFormat);
    }

    public String getFilesName() {
        return filesName;
    }

    public void setFilesName(String filesName) {
        if(filesName != null & filesName != "") this.filesName = filesName;
        else throw new IllegalArgumentException("Введите имя файла");
    }

    public int getFileByteSize() {
        return fileByteSize;
    }

    public void setFileByteSize(int fileByteSize) {
        if(fileByteSize>0) this.fileByteSize = fileByteSize;
        else throw new IllegalArgumentException("Задайте размер файла больше 0");
    }

    public String getFilesFormat() {
        return filesFormat;
    }



    public void setFilesFormat(String filesFormat) {
        if(filesFormat != null & filesFormat !="") this.filesFormat = filesFormat;
        else throw new IllegalArgumentException("Задайте формат файла");
    }

    public String toString(){
        return filesName + " |"
                + fileByteSize + " |"
                + filesFormat;
    }
    public static void printAll(GeneralFiles[] generalArray){
        for (int i = 0; i < generalArray.length; i++) {
            System.out.println(generalArray[i]);
        }
        }
    }

