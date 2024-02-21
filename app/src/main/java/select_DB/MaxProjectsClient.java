package select_DB;

public class MaxProjectsClient {
    String name;
    int projectCount;

    public MaxProjectsClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getProjectCount() {
//        return projectCount;
//    }
//
//    public void setProjectCount(int projectCount) {
//        this.projectCount = projectCount;

//    }

    @Override
    public String toString() {
        return "Client with max projects: " +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount;
    }
}
