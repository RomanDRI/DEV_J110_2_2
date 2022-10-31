package Files;

public class DocumentsFiles extends GeneralFiles {
    private int filesDocumentPage;

    public DocumentsFiles(String filesName, int fileByteSize, String fileFormat, int filesDocumentPage) {
        super(filesName, fileByteSize, fileFormat);
        setFilesDocumentPage(filesDocumentPage);
    }

    public int getFilesDocumentPage() {
        return filesDocumentPage;
    }

    public void setFilesDocumentPage(int filesDocumentPage) {
        if(filesDocumentPage > 0 ) this.filesDocumentPage = filesDocumentPage;
        else throw new IllegalArgumentException("Введите значение кол-ва документов больше 0");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", " + filesDocumentPage + " pages";
    }
}
