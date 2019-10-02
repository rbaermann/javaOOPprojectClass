public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Project2");
        Project project3 = new Project("Project3", "This is my 3rd test project");
        System.out.println(project3.elevatorPitch());
        project1.setName("Project1");
        System.out.println(project1.getName());
        System.out.println(project2.getDescription());
        project2.setDescription("This is my 2nd test project");
        System.out.println(project2.getDescription());
    }
}