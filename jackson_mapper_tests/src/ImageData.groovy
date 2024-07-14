class ImageData {

    private String id
    private List<String> names
    private boolean readonly

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    List<String> getNames() {
        return names
    }

    void setNames(List<String> names) {
        this.names = names
    }

    boolean getReadonly() {
        return readonly
    }

    void setReadonly(boolean readonly) {
        this.readonly = readonly
    }
}
