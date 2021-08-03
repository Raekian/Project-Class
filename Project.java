public class Project {
    private String name;
    private String description;

    public Project () {
        this.name = "default";
        this.description = "default";
    }

    public Project (String nameInput){
        this.name = nameInput;
        this.description = "default";
    }

    public Project (String nameInput, String descriptionInput){
        this.name = nameInput;
        this.description = descriptionInput;
    }

    public String getProject(){
        String info = String.format("Project name: %s \n Project description: %s", this.name, this.description);
        return info;
    }
}